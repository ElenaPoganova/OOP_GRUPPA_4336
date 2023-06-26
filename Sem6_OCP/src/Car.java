

public class Car extends Vehicle{
    public Car(int maxSpeed, String type){
          super(maxSpeed, "Car");
    }

    @Override
    public double calculateAllowedSpeed() {
       return super.getMaxSpeed() * 0.8;
    }
    
}
