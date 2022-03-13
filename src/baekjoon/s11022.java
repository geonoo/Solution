package baekjoon;

import java.io.*;
public class s11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n ; i++) {
            String[] c = br.readLine().split(" ");
            int a = Integer.parseInt(c[0]);
            int b = Integer.parseInt(c[1]);
            bw.write("Case #"+(i+1)+": "+a+" + "+b+" = "+(a+b)+"\n");
        }
        bw.flush();
        bw.close();
    }
}