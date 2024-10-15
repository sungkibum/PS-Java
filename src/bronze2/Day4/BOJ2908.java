package bronze2.Day4;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2908 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char[] array1 = Integer.toString(a).toCharArray();
        char[] array2 = Integer.toString(b).toCharArray();
        char temp;
        temp = array1[0];
        array1[0] = array1[2];
        array1[2] = temp;

        char temp1;
        temp1 = array2[0];
        array2[0] = array2[2];
        array2[2] = temp1;

        int c = Integer.parseInt(String.valueOf(array1));   //toString()을 쓰면 메모리 주소가 출력됨
        int d = Integer.parseInt(String.valueOf(array2));   //new String도 가능(배열의 내용을 복사하여 새로운 인스턴스를 만듬)

        if (c < d) {
            System.out.println(d);
        } else {
            System.out.println(c);
        }



    }
}
