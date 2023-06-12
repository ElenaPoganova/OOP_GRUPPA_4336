import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromotionalClient;  /* Импортирован класс PromotionalClient */
import Classes.ReturnClient;
import Classes.SpecialClient;
import Classes.TaxService;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market market = new Market();
        iActorBehaviour client1 = new OrdinaryClient("Boris");
        iActorBehaviour client2 = new OrdinaryClient("Dasha");
        iActorBehaviour client3 = new SpecialClient("Prezident", 1);
        iActorBehaviour client4 = new PromotionalClient("Alex", "Скидка на 2й товар", 1);
        /* Добавлен клиент учавствующий в акции */
        iActorBehaviour client5 = new ReturnClient("Tom", 1, "15.05.2023", 300);
        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.acceptToMarket(client4);  /* Добавлен клиент учавствующий в акции */
        market.acceptToMarket(client5);
        market.acceptToMarket(new TaxService());
        market.update();
    }
}
