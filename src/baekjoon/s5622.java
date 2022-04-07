package baekjoon;

import java.util.Scanner;

public class s5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] ss = new String[10];
        ss[2] = "ABC"; ss[3] = "DEF"; ss[4] = "GHI"; ss[5] = "JKL";
        ss[6] = "MNO"; ss[7] = "PQRS"; ss[8] = "TUV"; ss[9] = "WXYZ";
        int sec = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 2; j < ss.length ; j++) {
                boolean check = false;
                for (int k = 0; k < ss[j].length(); k++) {
                    if(s.charAt(i) == ss[j].charAt(k)){
                       check = true;
                       sec += j+1;
                       break;
                    }
                }
                if(check) break;
            }
        }
        System.out.println(sec);
    }
}
