package bronze2.Day1;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ3052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int[] arr = new int[42];
        int count = 0;
        Arrays.fill(arr, 0);

        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i] % 42;
            arr[b[i]] = 1;
        }
        for (int i = 0; i < 42; i++) {
            if (arr[i] != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
