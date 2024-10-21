package bronze2.Day8;

import java.util.Scanner;

public class BOJ2231 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        for (int i = 1; i < n; i++) {
            if (n == check(i)) {
                a = i;
                break;
            }
        }
        System.out.println(a);
    }

    private static int check(int now) {
        int sum = now;
        char text[] = String.valueOf(now).toCharArray();
        for (int i = 0; i < text.length; i++) {
            sum += Integer.parseInt(String.valueOf(text[i]));
        }
        return sum;
    }
}
