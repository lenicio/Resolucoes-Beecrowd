// https://resources.beecrowd.com/repository/UOJ_1045.html

import java.util.Scanner;

public class Bee1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a = 7.0;
        Double b = 5.0;
        Double c = 7.0;
        Double maior;

        if (b > a) {
            maior = b;
            b = a;
            a = maior;
        }

        if (c > b) {
            maior = c;
            
        }

        System.out.println(a + "|" + b);

    }
}
