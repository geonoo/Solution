package baekjoon.s1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s1712 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String[] t = br.readLine().split(" ");
        long[] a = new long[3];
        for (int i = 0; i < 3; i++) a[i] = Long.parseLong(t[i]);

        if(a[1] >= a[2]){
            System.out.println(-1);
        }else{
            long cnt = a[0] / (a[2] - a[1]);
            while (a[0]+(a[1]*cnt) >= a[2]*cnt) cnt++;
            System.out.println(cnt);
        }
    }
}
