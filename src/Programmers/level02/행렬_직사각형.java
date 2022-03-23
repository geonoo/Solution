package Programmers.level02;

public class 행렬_직사각형 {
    public static void main(String[] args) {
//    6	6	[[2,2,5,4],[3,3,6,6],[5,1,6,3]]	[8, 10, 25]
//    3	3	[[1,1,2,2],[1,2,2,3],[2,1,3,2],[2,2,3,3]]	[1, 1, 5, 3]
//    100 97	[[1,1,100,97]]	[1]
        int[][] arr = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
        System.out.println(solution(6, 6,arr));
    }

    static public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = {};

        int[][]arr = new int[rows][columns];
        int a = 0;
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <columns ; j++) {
                arr[i][j] = ++a;
                System.out.println(a);
            }
        }

        for (int i = 0; i < queries.length; i++) {
            //22, 54
            int r1 = queries[i][0];
            int r2 = queries[i][1];
            int c1 = queries[i][2];
            int c2 = queries[i][3];
            //1,1
            int temp = arr[r1-1][r2-1];
            //2,1
            if(rows > r1+1){

            }

        }


        return answer;
    }
}
