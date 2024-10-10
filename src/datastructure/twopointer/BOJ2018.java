package datastructure.twopointer;

import java.util.Scanner;

public class BOJ2018 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 1;
        int sum = 1;
        int start_index = 1;
        int end_index = 1;
        while (end_index != N) {
            if (sum == N) {
                count++;
                end_index++;
                sum = sum + end_index;
            } else if (sum < N) {
                end_index++;
                sum = sum + end_index;
            } else {
                sum = sum - start_index;
                start_index++;
            }
        }
        System.out.println(count);

    }
}
