package baekjoon.s10000.s0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s10250 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int len = Integer.parseInt(br.readLine());
        String[] arr = new String[len];
        for (int i = 0; i < len; i++)
            arr[i] = br.readLine();

        for (int i = 0; i < len; i++) {
            String[] s = arr[i].split(" ");
            int h = Integer.parseInt(s[0]);
            int w = Integer.parseInt(s[1]);
            int n = Integer.parseInt(s[2]);

            int hh = 0;
            int ww = 0;
            if (n % h == 0) {
                hh = h * 100;
                ww = n/h;
            }else{
                hh = n % h * 100;
                ww = n/h+1;
            }
            System.out.println(hh+ww);

//            2
//            6 12 10 402
//            30 50 72 1203
//            3 50 50 217
//            1 1 1 101

        }
    }
}
