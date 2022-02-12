package Programmers;

import java.util.*;

public class H_Index {

	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5};
		
		System.out.println(solution(citations));
		
	}
	
//	[3, 0, 6, 1, 5]	3
//	[1, 2, 3, 4, 5] 3
	static public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        //0,1,3,5,6
        
        for (int i = 0; i < citations.length; i++) {
			int h = citations.length-i;
			
			if(h <= citations[i]) {
				answer = h;
				break;
			}
		}
        
        return answer;
    }
	
}
