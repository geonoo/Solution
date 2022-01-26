package Programmers;

import java.util.Arrays;

public class GymSuit {
	
	public static void main(String[] args) throws Exception {

		//5
//		int n = 5;
//		int[] lost = {2, 4};
//		int[] reserve = {1, 3, 5};
		
        //4
//		int n = 5;
//		int[] lost = {2, 4};
//		int[] reserve = {3};
			
		//2
		int n = 3;
		int[] lost = {3};
		int[] reserve = {1};
		
		System.out.println("�� : "+solution(n, lost, reserve));
	}
	
	 public static int solution(int n, int[] lost, int[] reserve) {
		 	int answer = n-lost.length;
		 	
		 	Arrays.sort(lost);
		 	Arrays.sort(reserve);
		 	
		 	for(int i=0; i<lost.length; i++){
	            for(int j=0; j<reserve.length; j++){
	                if(lost[i] == reserve[j]){
	                    answer++;
	                    lost[i] = -1;
	                    reserve[j] = -1; 
	                    break; 
	                }
	            }
	        }
		 	
		 	for(int i=0; i<lost.length; i++){
	            for(int j=0; j<reserve.length; j++){
	            	if((reserve[j]-1) == lost[i] || (reserve[j]+1) == lost[i]) {
	            		answer++;
	                    lost[i] = -1;
	                    reserve[j] = -1; 
	                    break; 
	            	}
	            }
		 	}
		 	
		 	return answer;
	    }
	
}
