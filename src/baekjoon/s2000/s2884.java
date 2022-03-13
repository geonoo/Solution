package baekjoon.s2000;

import java.util.Scanner;
public class s2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        int total = (h*60 + m) - 45;
        if(total < 0) total += 1440;

        int rH = total / 60;
        int rM = total % 60;
        System.out.println(rH);
        System.out.println(rM);

    }
}
