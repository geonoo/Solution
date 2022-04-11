package baekjoon.s1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s1316 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];

        for (int i = 0; i < n; i++)
            str[i] = br.readLine();

        int cnt = 0;
        for (String s : str) {
            boolean[] check = new boolean[26];
            boolean rtn = false;
            int prev = 0;
            for (int i = 0; i < s.length() ; i++) {
                int now = s.charAt(i);
                if(prev != now){
                    if(check[now - 'a'] == false){
                        check[now - 'a'] = true;
                        prev = now;
                    }else{
                        rtn = true;
                        break;
                    }
                }
            }
            if(!rtn) cnt++;
        }
        System.out.println(cnt);
    }
}
