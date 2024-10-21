package bronze2.Day7;

import java.util.Scanner;

public class BOJ10870 {

    public static void main(String[] args) {
        int[] a = new int[21];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i <= 20; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(a[n]);
    }
}
