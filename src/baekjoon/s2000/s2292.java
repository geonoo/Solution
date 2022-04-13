package baekjoon.s2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s2292 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        int temp = 1;
        while (n > 1){
            n = n-(6*temp++);
            cnt++;
        }
        System.out.println(cnt);
    }
}
