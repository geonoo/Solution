package baekjoon.s2000;

import java.util.Scanner;
public class s2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("*");
            System.out.println(sb.toString());
        }
    }
}
