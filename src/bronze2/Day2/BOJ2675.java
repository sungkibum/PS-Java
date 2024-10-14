package bronze2.Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ2675 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int R = sc.nextInt();
            char[] S = sc.next().toCharArray();
            for (int j = 0; j < S.length; j++) {
                for (int k = 0; k < R; k++) {
                    System.out.print(S[j]);
                }
            }
            System.out.println();   //한줄 안넘기면 콘솔창에서 한줄 안밀린 상태로 출력돼 틀림
        }
        }
    }

