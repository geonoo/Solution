package baekjoon.s10000;

import java.util.Scanner;

public class s10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] arr = new int[26];
        for (int i = 0; i < arr.length; i++) arr[i] = -1;

        for (int i = 0; i < s.length() ; i++) {
            int a = (int)s.charAt(i) - 97;
            if(arr[a] == -1) arr[a] = i;
        }

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}
