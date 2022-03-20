package baekjoon;

import java.util.Scanner;

public class s8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] rtn = new int[n];
        for (int i = 0; i < n ; i++) {
            String ox = sc.next();
            int score = 0;
            int sum = 0;
            for (int j = 0; j <ox.length() ; j++) {
                if(ox.charAt(j) == 'O'){
                    sum += ++score;
                }else{
                    score = 0;
                }
            }
            rtn[i] = sum;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(rtn[i]);
        }

    }
}
