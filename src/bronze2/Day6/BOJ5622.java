package bronze2.Day6;

import java.util.Scanner;

public class BOJ5622 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] b = a.toCharArray();
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            int time = 2;
            if (b[i] < 'D') {
                time++;
            } else if (b[i] < 'G') {
                time += 2;
            } else if (b[i] < 'J') {
                time += 3;
            } else if (b[i] < 'M') {
                time += 4;
            } else if (b[i] < 'P') {
                time += 5;
            } else if (b[i] < 'T') {
                time += 6;
            } else if (b[i] < 'W') {
                time += 7;
            } else {
                time += 8;
            }
            sum += time;
        }
        System.out.println(sum);
    }
}
