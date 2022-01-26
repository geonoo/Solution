package Programmers;

import java.util.Arrays;

public class MakeMin {
	public static void main(String[] args) {
		
//		[1, 4, 2]	[5, 4, 4]	29
//		[1,2]	[3,4]	10
		
		int[] a = {1,4,2};
		int[] b = {5,4,4};
		
		System.out.println(solution(a, b));
		
	}
	
	static public int solution(int []A, int []B){
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for (int i = 0; i < A.length; i++) {
			answer += A[i] * B[B.length-1-i];
		}

        return answer;
    }
}
