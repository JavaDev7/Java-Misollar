package algo.free;

import java.util.Scanner;

public class chiziqli2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double a = 2 * Math.tan(x + ((Math.PI) / 6));

        double b = 1. / 3 + (Math.cos(y + x * x) * Math.cos(y + x * x));

        double c = Math.log10(x * x + 2) / Math.log10(2);

        System.out.printf("%.2f", a / b + c);
    }
}
