package datastructure.array;

import java.util.Scanner;

public class BOJ1546 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int[] scores = new int[N];
        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
            sum += scores[i];
        }
        int maxScore = 0;
        for (int i = 0; i < scores.length; i++) {
            if (maxScore < scores[i]) {
                maxScore = scores[i];
            }
        }
        System.out.println((double) sum * 100 / maxScore / N);
    }
}
