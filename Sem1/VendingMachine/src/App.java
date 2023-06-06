import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import VendingMachine.VendingMachine;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Product item1 = new Product(1, "Lays", "Чипсы", 59);
        item1.setPrice(98);
        Product item2 = new Bottle(2, "Cola", "Water", 70, 500);
        Product item3 = new HotDrink(3, "Coffee", "Drink", 189, 300, 100); 
        
        VendingMachine iMachine = new VendingMachine(300);
        iMachine.addProduct(item1);
        iMachine.addProduct(item2);
        iMachine.addProduct(item3);
        iMachine.addProduct(new HotDrink(4, "Cocoa", "Drink", 250, 250, 100));
        iMachine.addProduct(new HotDrink(5, "Tea", "Drink", 150, 200, 100));
        /* добавлены два наптка в класс HotDrink */
        for(Product prod: iMachine.getProducts())
        {
            System.out.println(prod.toString());
        }
    }
}
