package baekjoon.s2000;

import java.util.Scanner;

public class s2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(new StringBuilder(sc.next()).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(sc.next()).reverse().toString());
        System.out.println(Math.max(a, b));
    }
}
