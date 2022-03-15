package baekjoon.s10000.s0;

import java.util.Scanner;

public class s10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int a = sc.nextInt();
        int b = sc.nextInt();

        while (a != 0 && b != 0){
            sb.append((a+b)+"\n");
            a = sc.nextInt();
            b = sc.nextInt();
        }
        System.out.println(sb.toString());
    }
}
