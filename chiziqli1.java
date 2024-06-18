package algo.free;

import java.util.Scanner;

public class chiziqli1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double c1, a, b, c;

        a = (x + y);
        b = (y * y) + Math.abs(((y * y) + 2)/(x + ((x * x * x)/5)));
        c = Math.exp(y + 2);

        c1 = (a / b) + c;


        System.out.printf("%.2f",c1);
    }
}