package bronze2.Day9;

import java.util.Scanner;

public class BOJ2581 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int min = n;
        int sum = 0;
        for (int i = m; i <= n; i++) {
            boolean check = true;
            if (i == 1) {
                check = false;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                if (min > i) {
                    min = i;
                }
                sum += i;
            }

        }
        if (sum == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
