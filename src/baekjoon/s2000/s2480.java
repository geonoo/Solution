package baekjoon.s2000;

import java.util.Scanner;
public class s2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == b || a == c){
            if(b == c){
                System.out.println(10000+(a*1000));
            }else{
                System.out.println(a*100 + 1000);
            }
        }else if(b == c || a == c){
            if(a == b){
                System.out.println(10000+(a*1000));
            }else{
                System.out.println(c*100 + 1000);
            }
        }else{
            int max = Math.max(a,Math.max(b, c));
            System.out.println(max*100);
        }
    }
}
