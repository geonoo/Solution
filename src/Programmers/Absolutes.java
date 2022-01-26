package Programmers;

public class Absolutes {
	
	public static void main(String[] args) throws Exception {

		//�� : 9
//		int[] absolutes = {4,7,12};
//		boolean[] signs = {true,false,true};
		
		//�� : 0
		int[] absolutes = {1,2,3};
		boolean[] signs = {false,false,true};
		
		System.out.println(solution(absolutes, signs));
		
		
	}
	
	
	
	 public static int solution(int[] absolutes, boolean[] signs) {
		 	int answer = 0;
		 	
		 	for(int i=0;i<absolutes.length;i++) {
		 		
		 		if(!signs[i]) {
		 			answer += -(absolutes[i]);
		 		}else {
		 			answer += absolutes[i];
		 		}
		 	}
	        
	        return answer;
	    }
	
}
