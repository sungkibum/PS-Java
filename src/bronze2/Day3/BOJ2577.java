package bronze2.Day3;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2577 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int result = A * B * C;
        String resultStr = Integer.toString(result);
        char[] S = resultStr.toCharArray();
        int[] count = new int[10];
        Arrays.fill(count, 0);
        for (int i = 0; i < S.length; i++) {
            int temp = Integer.parseInt(String.valueOf(S[i]));
            count[temp]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }
    }
}
