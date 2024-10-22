package bronze2.Day10;

import java.util.Scanner;

public class BOJ10811 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int temp[] = new int[b - a + 1];
            int index = 0;
            for (int j = b - 1; j >= a - 1; j--) {
                temp[index++] = arr[j];
            }

            index = 0;
            for (int j = a - 1; j <= b - 1; j++) {
                arr[j] = temp[index++];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
