package Classes;

import java.util.List;
import java.util.ArrayList;
import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder; /* Импортирован интерфейс iReturnOrder */

public class Market implements iMarketBehaviour,iQueueBehaviour { 
    private List<iActorBehaviour> queue;
    private List<iActorBehaviour> returnOrderQueue;
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
        this.returnOrderQueue = new ArrayList<iActorBehaviour>();
    }
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
        takeInQueue(actor);
    }
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
    }
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors)
        {
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }
        
    }
    @Override
    public void update() {
       takeOrder();
       giveOrder();
       releaseFromQueue();
    }
    @Override
    public void giveOrder() {
        for(iActorBehaviour actor: queue)
        {
            if(actor.isMakeOrder())
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
            }
        }
        
    }
    @Override
    public void releaseFromQueue() {
       List<Actor> releaseActors = new ArrayList<>();
       for(iActorBehaviour actor:queue)
       {
        if(actor.isTakeOrder())
        {
            releaseActors.add(actor.getActor());
            System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
        }
       }
    releaseFromMarket(releaseActors);
    }
    @Override
    public void takeOrder() {
        for(iActorBehaviour actor:queue)
        {
            if(!actor.isMakeOrder())
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");
            }
        }
        
    }
     
    // @Override
    // public void requestReturnOrder(iActorBehaviour actor) {
    //     this.request.add(actor);
    //     System.out.println(actor.getActor().getName()+" клиент сделал заявку на возврат товара ");     
        
    // }
  
    // public void requestReturnOrderApproved() {
    //     for(iActorBehaviour actor:request)
       
    //     {
    //         actor.setRequestRetur(true);
    //         System.out.println(actor.getActor().getName()+" возврат клиенту одобрен ");
    //     }
    // }
      
    // @Override
    // public void payMoneyReturnOrder() {
    //     for(iActorBehaviour actor: money)
    //     {
    //         if(actor.payMoneyReturnOrder())
    //         {
    //             actor.setTakeOrder(true);
    //             System.out.println(actor.getActor().getName()+" клиенту выданы деньги за возврат ");
    //         }
    //     }
        
    // }    
        
  
    // public void getMoneyReturnOrder() {
    //     for(iActorBehaviour actor: money)
    //     {
    //         if(actor.getMoneyReturnOrder())
    //         {
    //             actor.setTakeOrder(true);
    //             System.out.println(actor.getActor().getName()+" клиент получил деньги за возврат ");
    //         }
    //     }
        
    // }    
       
}
