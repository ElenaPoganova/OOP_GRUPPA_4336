package Interfaces;

import Classes.Actor;

public interface iReturnOrder {
    void requestReturnOrder(boolean requestReturnOrder);
    void requestReturnOrderApproved(boolean requestReturnOrderApproved);
    void payMoneyReturnOrder(boolean payMoneyReturnOrder);
    void getMoneyReturnOrder(boolean getMoneyReturnOrder);
    Actor getActor();
       
}


   