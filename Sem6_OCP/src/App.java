public class App {
    public static void main(String[] args) throws Exception {
        Car ladaVesta = new Car(180, "Car");
        Bus yellowBus = new Bus(120, "Bus");
        SpeedCalculation speedCalculation = new SpeedCalculation();
        System.out.println(speedCalculation.calculateAllowedSpeed(ladaVesta));
        System.out.println(speedCalculation.calculateAllowedSpeed(yellowBus));
    }
}
