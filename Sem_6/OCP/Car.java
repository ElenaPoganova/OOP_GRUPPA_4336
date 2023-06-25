package OOP_GRUPPA_4336.Sem_6.OCP;

public class Car extends Vehicle{
    public Car(int maxSpeed, String type){
          super(maxSpeed, "Car");
    }

    @Override
    public double calculateAllowedSpeed() {
       return super.getMaxSpeed() * 0.8;
    }
    
}
