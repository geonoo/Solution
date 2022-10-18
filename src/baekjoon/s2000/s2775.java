package baekjoon.s2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s2775 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        int[][] arr = new int[t][2];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = Integer.parseInt(br.readLine());
            arr[i][1] = Integer.parseInt(br.readLine());
        }

        int sum = 0;

//1 0-1
//2 0-2
//3 0-3
//4 0-4

//1 1-1
//3 1-2
//6 1-3
//10 1-4

//1  2-1
//4  2-2
//10 2-3
//20 2-4

//1 3-1
//5 3-2
//15 3-3
//35 3-4

//1 4-1
//6 4-2
//21 4-3
//56 4-4

    }
}
