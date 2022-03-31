package baekjoon.s2000;

import java.util.Scanner;

public class s2675 {
    public static void main(String[] args) {
//        2
//        3 ABC
//        5 /HTP
//        AAABBBCCC
/////     HHHHHTTTTTPPPPP
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] arr = new String[n];
        for (int i = 0; i < n ; i++) {
            int a = sc.nextInt();
            String b = sc.next();
            arr[i] = "";
            for (int j = 0; j < b.length(); j++) {
                for (int k = 0; k < a; k++) {
                    arr[i] += b.charAt(j)+"";
                }
            }
            System.out.println(arr[i]);
        }
    }
}
