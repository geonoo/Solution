package baekjoon.s2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s2869 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]), b = Integer.parseInt(s[1]), v = Integer.parseInt(s[2]);

        int day = (int)Math.ceil((double)(v-a)/(double)(a-b))+1;

        System.out.println(day);
    }
}
//        2 1 5 4
//        5 1 6 2
//        100 99 1000000000 999999901
