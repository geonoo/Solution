package baekjoon;

import java.util.Scanner;

public class s3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int[] arr = new int[10];
        while (n < 10){
            arr[n++] = sc.nextInt() % 42;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    n--;
                    break;
                }
            }
        }

        System.out.println(n);

    }
}
