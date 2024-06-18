package algo.free;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        double sum = 0;
        double sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double average = sum / n;
        double average2 = 0;

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= average) {
                sum2 += arr[i];
                cnt++;
            }
        }
        if (cnt != 0) {
            average2 = sum2 / cnt;
        }
        System.out.printf("%.2f", average2);
    }
}