package baekjoon.s1000;

import java.util.Arrays;
import java.util.Scanner;

public class s1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }
        Arrays.sort(score);
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (score[i]/(double)score[n-1])*100;
        }
        System.out.println(sum/n);
    }
}
