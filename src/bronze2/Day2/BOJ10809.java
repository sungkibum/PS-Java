package bronze2.Day2;

import java.util.Scanner;

public class BOJ10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.nextLine().toCharArray();
        for (int i = 0; i < 26; i++) {
            int temp = -1;
            for (int j = 0; j < S.length; j++) {
                if (S[j] - 'a' == i) {  // 아스키코드 변환
                    temp = j;
                    break;
                }
            }
            System.out.print(temp + " ");
        }
    }
}
