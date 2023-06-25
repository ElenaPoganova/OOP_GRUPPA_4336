package OOP_GRUPPA_4336.Sem_6.ISP;

public class Cube implements ThreeDimensionalShape, TwoDimensionalShape{
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double volume() {
         return edge * edge * edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }
}
