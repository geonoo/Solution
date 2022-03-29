package baekjoon;

import java.util.Scanner;

public class s11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = sc.next().split("");
        int sum = 0;
        for (int i = 0; i < s.length; i++) {
            sum += Integer.parseInt(s[i]);
        }
        System.out.println(sum);
    }
}
