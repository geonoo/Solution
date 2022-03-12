package baekjoon;

import java.util.Scanner;

public class s2588 {
//    472
//    385

//    2360
//    3776
//    1416
//    181720
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = b+"";
        for (int i = s.length()-1; i >= 0; i--) {
            System.out.println(a*(s.charAt(i) - '0'));
        }
        System.out.println(a*b);
    }
}
