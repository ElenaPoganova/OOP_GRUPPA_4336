package OOP_GRUPPA_4336.Sem_6.OCP;

public class Bus extends Vehicle {
    public Bus(int maxSpeed, String string) {
        super(maxSpeed, "Bus");
    }

    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.6;
    }
}
