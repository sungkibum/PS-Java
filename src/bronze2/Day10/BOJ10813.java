package bronze2.Day10;

import java.util.Scanner;

public class BOJ10813 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        for (int i = 1; i <= m; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int temp = 0;
            temp = arr[num1 - 1];
            arr[num1 - 1] = arr[num2 - 1];
            arr[num2 - 1] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
