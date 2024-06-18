package algo.free;

import java.util.Scanner;
public class Chiziqli5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double a = ((x * x) + 1) / (( (x * x) + ( ((x * y) + (y * y)) / ((y * y) + (y + x * y) /(Math.abs(x * y) + 5 )))));
        double b = 1 / (1 + Math.cos(x) + (1 / Math.sin(Math.abs(x))));
        double T11 = a + b;
        System.out.printf("%.2f",T11);
    }
}


