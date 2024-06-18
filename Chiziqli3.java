package algo.free;

import java.util.Scanner;

public class Chiziqli3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double a = x * x * x / (Math.pow(x, 4) + (2 * x) + 3) + Math.exp((x * x) + (3 * x));
        double b = Math.atan(x + y) + Math.pow(Math.abs(5 + x), 2);
        double c = Math.cos(y * y + (x * x / 2));
        double f2 = (a / b) - (c * c);

        System.out.printf("%.2f", f2);
    }
}
