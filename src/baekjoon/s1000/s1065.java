package baekjoon.s1000;

import java.util.Scanner;
//한수
public class s1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int han = 0;
        for (int i = 1; i <= n ; i++) {
            if(i < 100){
                han = i;
            }else if(i == 1000){
                break;
            }else{
                int[] a = new int[3];
                int t = i;
                int k = 0;
                while (t > 0){
                    a[k] = t % 10;
                    t /= 10;
                    k++;
                }
                if(a[0] - a[1] == a[1] - a[2]) han++;
            }
        }
        System.out.println(han);
    }
}
