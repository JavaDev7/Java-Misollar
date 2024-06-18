package algo.free;

import java.util.Scanner;

public class Chiziqli4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double a = (x + y) * (x + y);
        double b = Math.sqrt(Math.abs(y) + 2);
        double c = x - (2 * x * y / (x * x - 10));
        double d = Math.cos(x + y) * Math.cos(x + y);
        double e = Math.pow((x + y), 1. / 3);

        double z = (Math.log10(Math.abs(a + b - c)) / (Math.log10(Math.exp(1)))) + (d / e);
        System.out.printf("%.2f", z);
    }
}