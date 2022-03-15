package baekjoon.s1000;

import java.util.Scanner;

public class s1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp = (num / 10) + (num % 10);
        int tNum = temp + (num % 10);

        System.out.println(tNum);

        int rNum = (temp % 10) + (tNum % 10);
        System.out.println(rNum);
        int aNum = (tNum % 10) + (rNum % 10);
        System.out.println(rNum);

    }
}
