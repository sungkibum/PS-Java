package bronze2.Day9;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2587 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int[] arr = {a, b, c, d, e};
        System.out.println((a + b + c + d + e) / 5);

        Arrays.sort(arr);

        System.out.println(arr[2]);
    }
}
