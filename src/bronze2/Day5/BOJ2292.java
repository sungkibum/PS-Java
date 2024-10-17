package bronze2.Day5;

import java.util.Scanner;

public class BOJ2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int a = 1;
        while (N > count) {
            count += a * 6;
            a++;
        }
        System.out.println(a);
    }
}
