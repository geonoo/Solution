package baekjoon.s2000;

import java.util.Scanner;

public class s2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String str = (a*b*c)+"";
        int arr[] = new int[10];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - '0']++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
