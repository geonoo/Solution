package groom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class 줄서기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int arr[] = new int[N+1];
        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < M; i++) {
            String temp[] = br.readLine().split(" ");
            int front = Integer.parseInt(temp[0]);
            int back = Integer.parseInt(temp[1]);
            arr[front]++;
            arr[back]--;
        }

        if (!check(N, arr)) {
            System.out.println(-1);
        } else {
            StringBuffer sb = new StringBuffer();
            for (int i = 1; i <= N; i++) {
                sb.append(arr[i]).append(" ");
            }

            System.out.print(sb);
        }
    }
    public static boolean check ( int N, int[] arr){   //조건에 부합하는 지 체크
        HashSet<Integer> set = new HashSet<>();

        for (int i = 1; i <= N; i++) {
            int temp = arr[i];

            if (temp > N || temp <= 0) return false;   //주어진 입력이 잘못되어 1~N 범위를 벗어날 때

            if (!set.add(temp)) return false;      //주어진 입력이 잘못되어 중복인 수가 존재할
        }
        return true;
    }
}
