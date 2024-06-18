package algo.free;

import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long seconds = x * 365 * 24 * 60 * 60;
        long l = seconds / 1000;
        System.out.println(l);

    }
}
