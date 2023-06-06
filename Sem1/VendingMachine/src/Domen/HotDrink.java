package Domen;

public class HotDrink  extends Bottle{ /* создаем класс потомка от родителя Bottle */
    private int temperature; /* добавляем дополнительный параметр  */ 

    /**
     * Create a product for VM
     *
     * @param productId       id product
     * @param productName
     * @param productCategory
     * @param price
     * @param volume
     * @throws Exception
     */
    public HotDrink(int productId, String productName, String productCategory, double price, int volume, int temperature) throws Exception {
        super(productId, productName, productCategory, price, volume);
        this.temperature = temperature;
    }
    
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString()
    {
        return "Product{" +
        "name = '" + super.getProductName() + '\'' +
        ", category ='" + super.getProductCategory() + '\'' +
        ", cost = " + super.getPrice() +
        ", volum = " + super.getVolume() +
        ", temperature = " + temperature +
        '}';
    }
}
    

