package datastructure.array;

import java.util.Scanner;

public class BOJ11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String sNum = sc.next();
        char[] a = sNum.toCharArray();
        int  sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i] - '0';
        }
        System.out.println(sum);
    }
}
