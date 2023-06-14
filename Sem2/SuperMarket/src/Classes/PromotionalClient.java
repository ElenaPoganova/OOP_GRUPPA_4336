package Classes;

public class PromotionalClient extends Actor{
    public String nameOfThePromotion; /* Название акции */
    public int idPromoClient; /* номер участника акции */
    public static int countPromoClient; /* количество участников акции */

    
    /* добавим конструктор класса PromotionalClient */
    public PromotionalClient(String name, String nameOfThePromotion, int idPromoClient) {
      super(name);
      this.nameOfThePromotion = nameOfThePromotion;
      this.idPromoClient = idPromoClient;
    }
/* Добавим геттеры и сеттеры для данного класса */
    public String getNameOfThePromotion() {
      return nameOfThePromotion;
    }

    public void setNameOfThePromotion(String nameOfThePromotion) {
      this.nameOfThePromotion = nameOfThePromotion;
    }

    public int getIdPromoClient() {
      return idPromoClient;
    }

    public void setIdPromoClient(int idPromoClient) {
      this.idPromoClient = idPromoClient;
    }

    public static int getCountPromoClient() {
      return countPromoClient;
    }

    public static void setCountPromoClient(int countPromoClient) {
      PromotionalClient.countPromoClient = countPromoClient;
    }

      @Override
    public String getName() {
        return super.name;
    }
    public boolean isTakeOrder() {
      return super.isTakeOrder;
    }
    public boolean isMakeOrder() {
      return super.isMakeOrder;
    }
    public void setTakeOrder(boolean makeOder) {
      super.isMakeOrder = makeOder;
    }
    
    public void setMakeOrder(boolean pikUpOrder) {
      super.isTakeOrder = pikUpOrder;
    }
    public Actor getActor() {
      return this;
    }
/* переопределим метод */
@Override
    public String toString() {
      return "PromotionalClient [nameOfThePromotion=" + nameOfThePromotion + ", idPromoClient=" + idPromoClient + "]";
    }

}