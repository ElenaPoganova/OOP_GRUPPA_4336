package OOP_GRUPPA_4336.Sem_6.ISP;

/* Класс по определению объема круга имплементирующий интерфейс для двумерных фигур */
public class Circle implements TwoDimensionalShape {
   

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

     @Override
    public double area() {
       return 2 * Math.PI * radius;
    }
}

