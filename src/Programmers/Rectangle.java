package Programmers;

import java.util.Arrays;

public class Rectangle {

	public static void main(String[] args) {
//		[[1, 4], [3, 4], [3, 10]]	[1, 10]
//		[[1, 1], [2, 2], [1, 2]]	[2, 1]
		
		int[][] v = {{1, 4}, {3, 4}, {3, 10}};
		
		System.out.println(Arrays.toString(solution(v)));
		
	}
	

	static public int[] solution(int[][] v) {
        int[] answer = new int[2];
        
        int[] a = new int[3];
        int[] b = new int[3];
        
        for (int i = 0; i < v.length; i++) {
        	for (int j = 0; j < 2; j++) {
        		if(j == 0) {
        			a[i] = v[i][j];
        		}else {
        			b[i] = v[i][j];
        		}
    		}
		}
        
        if(a[0] == a[1]) {
        	answer[0] = a[2];
        }else if(a[0] == a[2]) {
        	answer[0] = a[1];
        }else {
        	answer[0] = a[0];
        }
    	
        if(b[0] == b[1]) {
        	answer[1] = b[2];
        }else if(b[0] == b[2]) {
        	answer[1] = b[1];
        }else {
        	answer[1] = b[0];
        }
        
        return answer;
    }

}
