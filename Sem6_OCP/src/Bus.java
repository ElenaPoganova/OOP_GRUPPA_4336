

public class Bus extends Vehicle {
    public Bus(int maxSpeed, String string) {
        super(maxSpeed, "Bus");
    }

    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.6;
    }
}

