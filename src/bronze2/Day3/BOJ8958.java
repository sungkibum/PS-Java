package bronze2.Day3;

import java.util.Scanner;

public class BOJ8958 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            char[] temp = sc.nextLine().toCharArray();
            int score = 0;
            int result = 0;
            for (int j = 0; j < temp.length; j++) {
                if (temp[j] == 'O') {
                    score++;
                    result += score;
                } else {
                    score = 0;
                }
            }
            System.out.println(result);
        }
    }
}
