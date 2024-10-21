package bronze2.Day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ2920 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int a[] = new int[8];
        for (int i = 0; i < 8; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        String result = "";
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] == a[i] + 1) {
                result = "ascending";
            } else if (a[i + 1] == a[i] - 1) {
                result = "descending";
            } else {
                result = "mixed";
            }
        }
        System.out.println(result);
    }
}
