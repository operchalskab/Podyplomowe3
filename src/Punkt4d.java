import java.awt.*;

public class Punkt4d extends Point {
    int z;
    int w;

    public Punkt4d(int x, int y, int z, int w) {
        super(x, y);
        this.z = z;
        this.w = w;
    }

    public static void main(String[] args) {
        Punkt4d punkt4d = new Punkt4d(5, 5, 8, 10);
        System.out.println("x wynosi: " + punkt4d.x);
        System.out.println("y wynosi: " + punkt4d.y);
        System.out.println("z wynosi: " + punkt4d.z);
        System.out.println("w wynosi: " + punkt4d.w);


    }
}

