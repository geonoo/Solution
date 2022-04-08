package Programmers.level01;

import java.util.Arrays;

public class 예산 {
	
	public static void main(String[] args) throws Exception {
		//3
//		int[] d = {1,3,2,5,4};
//		int budget = 9;
		
		//4
		int[] d = {0,0,0,0};
		int budget = 10;
		
		System.out.println(solution2(d, budget));
		
	}

	static public int solution2(int[] d, int budget) {
		Arrays.sort(d);
		int cnt = 0;
		for (cnt = 0; 0 < budget && cnt < d.length; cnt++)
			budget -= d[cnt];

		return budget < 0 ? --cnt : cnt;
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
