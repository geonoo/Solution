package baekjoon.s2000;

import java.util.Scanner;

public class s2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int idx = 0;
        for (int i = 0; i < 9; i++) {
            int a = sc.nextInt();
            if(max < a){
                max = a;
                idx = i+1;
            }
        }
        System.out.print(max+"\n"+idx);
    }
}
