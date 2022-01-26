package Programmers;

import java.util.Arrays;

public class Budget {
	
	public static void main(String[] args) throws Exception {
		//3
		int[] d = {1,3,2,5,4};
		int budget = 9;
		
		//4
//		int[] d = {2,2,3,3};
//		int budget = 10;
		
		System.out.println(solution(d, budget));
		
	}
	
	
	 static public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        int temp = 0;
        for(int i=0; i<d.length; i++) {
        	if((temp+d[i]) <= budget) {
        		temp += d[i];
        		answer++;
        	}else {
        		break;
        	}
        }
        
        return answer;
	 }
	
}
