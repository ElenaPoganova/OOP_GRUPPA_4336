package Classes;



public class ReturnClient extends Actor {
    public int idReturnOrderClient; /* номер клиента сделавшего возврат */
    public String dateReturnOrder; /* дата возврата товара */
    public int summaReturnOrder;

    public ReturnClient(String name, int idReturnOrderClient, String dateReturnOrder, int summaReturnOrder) {
        super(name);
        this.idReturnOrderClient = idReturnOrderClient;
        this.dateReturnOrder = dateReturnOrder;
        this.summaReturnOrder = summaReturnOrder;
    }  /* добавлен конструктор для ReturnClient */
/* геттеры и сеттеры для данного класса */
    public int getIdReturnOrderClient() {
        return idReturnOrderClient;
    }
    public void setIdReturnOrderClient(int idReturnOrderClient) {
        this.idReturnOrderClient = idReturnOrderClient;
    }
    public String getDateReturnOrder() {
        return dateReturnOrder;
    }
    public void setDateReturnOrder(String dateReturnOrder) {
        this.dateReturnOrder = dateReturnOrder;
    }
    public int getSummaReturnOrder() {
        return summaReturnOrder;
    }
    public void setSummaReturnOrder(int summaReturnOrder) {
        this.summaReturnOrder = summaReturnOrder;
    }
 
    @Override
    public String getName() {
        return super.name;
    }
    @Override
    public Actor getActor() {
        return this;
    }
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    @Override
     public void setTakeOrder(boolean makeOder) {
      super.isMakeOrder = makeOder;
    }
    
    public void setMakeOrder(boolean pikUpOrder) {
      super.isTakeOrder = pikUpOrder;
    }
    @Override
    public String toString() {
        return "ReturnClient [idReturnOrderClient=" + idReturnOrderClient + ", dateReturnOrder=" + dateReturnOrder
                + ", summaReturnOrder=" + summaReturnOrder + "]";
    }
}    