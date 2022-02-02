package Programmers;

import java.util.Arrays;

public class 카펫 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(24, 24)));
	}
	
//	10	2	[4, 3]
//	8	1	[3, 3]
//	24	24	[8, 6]
	static public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int area = brown + yellow;
        for (int i = 1; i <= area; i++) {
        	int row = i;
        	int col = area / row;
        	
        	if(col < row) {
        		continue;
        	}
        	
        	//핵심! 노랑의 넓이는 (전체세로 - 2) * (전체가로 -2 )
        	if((col-2) * (row-2) == yellow) {
        		answer[0] = col;
        		answer[1] = row;
        		break;
        	}
        	
		}
        return answer;
    }

}
