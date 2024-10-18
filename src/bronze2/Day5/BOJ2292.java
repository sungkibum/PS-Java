package bronze2.Day5;

import java.util.Scanner;

public class BOJ2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 1;
        int count = 1;
        while (N > a) {
            a = a + count * 6;
            count++;
        }
        System.out.println(count);
    }
}
