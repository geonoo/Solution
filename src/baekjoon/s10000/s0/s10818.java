package baekjoon.s10000.s0;

import java.util.Arrays;
import java.util.Scanner;

public class s10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }

        Arrays.sort(arr);

        System.out.println(arr[0] + " " + arr[arr.length-1]);
    }
}
