package Programmers.level02;

import java.util.Arrays;

public class 행렬의_곱셈 {
	public static void main(String[] args) {
		
//		[[1, 4], [3, 2], [4, 1]]	[[3, 3], [3, 3]]	[[15, 15], [15, 15], [15, 15]]
		
//		[[2, 3, 2], [4, 2, 4], [3, 1, 4]]
//		[[5, 4, 3], [2, 4, 1], [3, 1, 1]]	[[22, 22, 11], [36, 28, 18], [29, 20, 14]]
		
		int[][] arr1 = {
					{2, 3, 2},
					{4, 2, 4},
					{3, 1, 4}
				};
		int[][] arr2 = {
					{5, 4, 3},
					{2, 4, 1},
					{3, 1, 1}
				};
		
		//행렬의 곱셈 공식
		//1 * 3 + 4 * 3 -> 0,0
		//3 * 3 + 2 * 3 -> 0,1
		
		System.out.println(Arrays.toString(solution(arr1, arr2)));
		int[][] rtn = (solution(arr1, arr2));
		for (int i = 0; i < rtn.length; i++) {
			System.out.println(Arrays.toString(rtn[i]));
		}
		
	}
	
	
	//행렬의 곱셈 
	static public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2.length];


		for (int i = 0; i < arr1.length ; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				for (int k = 0; k < arr1[0].length; k++) {
					answer[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}

        return answer;
    }
}
