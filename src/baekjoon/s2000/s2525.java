package baekjoon.s2000;


import java.util.Scanner;
public class s2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int total = a*60 + b + c;
        if(total > 1440) total -= 1440;
        System.out.println(total / 60);
        System.out.println(total % 60);
    }
}
