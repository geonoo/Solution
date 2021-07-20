package s20210720;

import java.util.ArrayList;

public class GymSuit {
	
	public static void main(String[] args) throws Exception {

		//5
		int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};
		
        //4
//		int n = 5;
//		int[] lost = {2, 4};
//		int[] reserve = {3};
			
		//2
//		int n = 3;
//		int[] lost = {3};
//		int[] reserve = {1};
			
		
		System.out.println(solution(n, lost, reserve));
		
		
	}
	
	//11,2,33,4,55
	 public static int solution(int n, int[] lost, int[] reserve) {
		 	int answer = 0;
		 	
		 	ArrayList<Integer> list = new ArrayList<Integer>();
		 	for(int i=1; i<(n+1); i++) {
		 		list.add(i);
		 	}
		 	
		 	for(int i=0;i<lost.length;i++) {
		 		list.set(lost[i], 0);
		 	}
		 	
		 	
		 	return answer;
	    }
	
}
