package baekjoon.s2000;

import java.util.Scanner;

public class s2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star = "";
        String space = "";
        for (int i = 0; i < n-1; i++) space += " ";
        for (int i = 0; i < n; i++) {
            star += "*";
            System.out.println(space.substring(i)+star);
        }
    }
}
