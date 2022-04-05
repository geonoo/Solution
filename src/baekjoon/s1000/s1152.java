package baekjoon.s1000;

import java.util.Scanner;

public class s1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.isEmpty() || s.equals(" ")){
            System.out.println(0);
        }else{
            if(s.charAt(0) == ' ') s = s.substring(1, s.length());
            if(s.charAt(s.length()-1) == ' ') s = s.substring(0, s.length()-1);
            System.out.println(s.split(" ").length);
        }
    }
}
