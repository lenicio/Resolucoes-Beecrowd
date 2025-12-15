import java.util.Map;
import java.util.Scanner;

public class Bee1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();

        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.printf("Perimetro = %.1f%n", a + b + c);
        } else {
            Double area = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f%n", area);
        }


    }
}
