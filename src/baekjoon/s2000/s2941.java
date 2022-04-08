package baekjoon.s2000;

import java.util.Scanner;

public class s2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next()
                .replaceAll("dz=", "1")
                .replaceAll("-","")
                .replaceAll("=","")
                .replaceAll("lj","1")
                .replaceAll("nj","1");

        System.out.println(s.length());
    }
}
