package datastructure.twopointer;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1940 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int S[] = new int[N];
        int count = 0;
        int start_index = 0;
        int end_index = N - 1;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            S[i] = scanner.nextInt();
        }
        Arrays.sort(S);
        while (start_index < end_index) {
            if (S[start_index] + S[end_index] < M) {
                start_index++;
            } else if (S[start_index] + S[end_index] == M) {
                count++;
                start_index++;
                end_index--;
            } else {
                end_index--;
            }
        }
        System.out.println(count);
    }
}
