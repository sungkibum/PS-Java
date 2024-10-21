package bronze2.Day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1712 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());


        if (b >= c) {
            System.out.println(-1);
        } else {
            int count = 1;
            while (true) {
                if (a + b * count >= c * count) {
                    count++;
                } else {
                    break;
                }
            }
            System.out.println(count);
        }

    }
}
