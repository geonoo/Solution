package Programmers;

import java.util.Arrays;

public class 직사각형_마지막좌표_구하기 {

	public static void main(String[] args) {
		//[[1, 4], [3, 4], [3, 10]]	[1, 10]
		//[[1, 1], [2, 2], [1, 2]]	[2, 1]
		int[][] v = {{1, 4}, {3, 4}, {3, 10}};
		
		System.out.println(Arrays.toString(solution(v)));
	}
	
	static public int[] solution(int[][] v) {
        int[] answer = new int[2];
        
        if(v[0][0] == v[1][0]) {
			answer[0] = v[2][0];
		}
        
        if(v[1][0] == v[2][0]) {
        	answer[0] = v[0][0];
		}
        
        if(v[0][0] == v[2][0]) {
        	answer[0] = v[1][0];
		}
        
        if(v[0][1] == v[1][1]) {
        	answer[1] = v[2][1];
		}
        
        if(v[1][1] == v[2][1]) {
        	answer[1] = v[0][1];
		}
        
        if(v[0][1] == v[2][1]) {
        	answer[1] = v[1][1];
		}
        
        return answer;
    }
	
}
