package OOP_GRUPPA_4336.Sem_6.OCP;

import OOP_GRUPPA_4336.Sem_6.OCP.Bus;
import OOP_GRUPPA_4336.Sem_6.OCP.Car;
import OOP_GRUPPA_4336.Sem_6.OCP.SpeedCalculation;
import OOP_GRUPPA_4336.Sem_6.OCP.Vehicle;

public class App {
    public static void main(String[] args) {
        Car ladaVesta = new Car(180, "Car");
        Bus yellowBus = new Bus(90, "Bus");
        System.out.println(ladaVesta.calculateAllowedSpeed());
        System.out.println(yellowBus.calculateAllowedSpeed());
    }
    
}
