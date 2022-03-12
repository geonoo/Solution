package Programmers.test;

import java.util.Arrays;

public class test3 {
    public static void main(String[] args) {
//        5	true	[[1,2,3,4,1],[4,5,6,5,2],[3,6,7,6,3],[2,5,6,5,4],[1,4,3,2,1]]
//        6	false	[[1,5,4,3,2,1],[2,6,8,7,6,5],[3,7,9,9,8,4],[4,8,9,9,7,3],[5,6,7,8,6,2],[1,2,3,4,5,1]]

        for (int[] a: solution(5, true)) {
            System.out.println(Arrays.toString(a));
        }
        
    }

    static public int[][] solution(int n, boolean clockwise) {
        int[][] answer = new int[n][n];
//        3 * 3
//        1,1 1,2
//        1,3 2,3
//

        int len = n;
        if(clockwise){
            int i = 0;
            int j = 0;
            int k = 0;
            int numA = 1;
            int rNumA = 4;
            int numB = 1;
            int rNumB = 4;
            while (len > 0){
                int z = i;
                int x = j;
                int c = k;
                System.out.println(len);
                for (; z < len; z+=(len-1)) {
                    if(len-1 != z){
                        for (; x < len-1; x++) {
                            System.out.println("x : " +x);
                            answer[z][x] = numA++;
                            answer[x+1][z] = rNumA--;
                        }

                    }else{
                        for (; c < len-1; c++) {
                            answer[c][z] = numB++;
                            answer[z][c+1] = rNumB--;
                        }
                    }
                }
                len -= 1;
                i++;
                j++;
                k++;
            }
        }else {
            
        }
        
        return answer;
    }
}
