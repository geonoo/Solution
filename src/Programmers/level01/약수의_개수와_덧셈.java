package Programmers.level01;

import java.util.ArrayList;

public class 약수의_개수와_덧셈 {
	
	public static void main(String[] args) throws Exception {
		
		//43
//		int left = 13;
//		int right = 17;
		
		//52
		int left = 24;
		int right = 27;
		
		
		System.out.println(solution2(left, right));
		
	}

	static public int solution2(int left, int right) {
		int answer = 0;
		for (int i = left; i <= right; i++) {
			int cnt = 0;
			for (int j = 1; j <= i; j++)
				if(i % j == 0) cnt++;

			answer = (cnt % 2 == 0) ? answer + i : answer - i;
		}
		return answer;
	}
	
	 static public int solution(int left, int right) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=left; i<=right; i++) {
        	list.add(i);
        }
        
        for(int i : list) {
        	int factor = 1;
        	int cnt = 2;
        	while (i >= cnt) {
				if(i % cnt == 0) {
					factor++;
				}
				cnt++;
			}
        	if(factor % 2 == 0) {
        		answer += i;
        	}else {
        		answer -= i;
        	}
        	
        }
        
        return answer;
        
	    
	 }
	
}
