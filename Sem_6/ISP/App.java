package OOP_GRUPPA_4336.Sem_6.ISP;

public class App {
     public static void main(String[] args) {
        Circle myCircle = new Circle(20.0);
        Cube myCube = new Cube(30);
        System.out.println("Circle area: " + myCircle.area());
        System.out.println("Cube area: " + myCube.area());
        System.out.println("Cube volume: " + myCube.volume());
    }
}
