package Programmers;

import java.util.Arrays;

public class MatrixMultiplication {
	public static void main(String[] args) {
		
//		[[1, 4], [3, 2], [4, 1]]	[[3, 3], [3, 3]]	[[15, 15], [15, 15], [15, 15]]
		
//		[[2, 3, 2], [4, 2, 4], [3, 1, 4]]
//		[[5, 4, 3], [2, 4, 1], [3, 1, 1]]	[[22, 22, 11], [36, 28, 18], [29, 20, 14]]
		
		int[][] arr1 = {
					{1, 2},
					{3, 4},
					{5, 6}
				};
		int[][] arr2 = {
					{7, 8},
					{9, 10}
				};
		
		//행렬의 곱셈 공식
		//1 * 7 + 2 * 9 -> 0,0
		//1 * 8 + 2 * 10 -> 0,1
		
		System.out.println(Arrays.toString(solution(arr1, arr2)));
		
	}
	
	
	//행렬의 곱셈 
	static public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				for (int n = 0; n < arr1[0].length; n++) {
					answer[i][j] += arr1[i][n] * arr2[n][j]; 
				}
			}
		}
        
        return answer;
    }
}
