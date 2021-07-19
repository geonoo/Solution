package s20210719;

public class Lotto {
	
	public static void main(String[] args) throws Exception {
		
		//[3,5]
//		int[] lottos = {44, 1, 0, 0, 31, 25};
//		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		//[1, 6]
//		int[] lottos = {0, 0, 0, 0, 0, 0};
//		int[] win_nums = {38, 19, 20, 40, 15, 25};
		
		//[1, 1]
		int[] lottos = {45, 4, 35, 20, 3, 9};
		int[] win_nums = {20, 9, 3, 45, 4, 35};
		int[] aa = solution(lottos, win_nums);
		System.out.println("최고 : "+aa[0]);
		System.out.println("최저 : "+aa[1]);
		
	}
	
	
	
	 public static int[] solution(int[] lottos, int[] win_nums) {
	        int[] answer = new int[2];
	        int top = 0, low = 0;
	        
	        for(int i=0;i<lottos.length;i++) {
	        	if(lottos[i] != 0) {
	        		for(int j=0;j<win_nums.length;j++) {
		        		if(lottos[i] == win_nums[j]) {
		        			top++;
		        			low++;
		        		}
		        	}
	        	}else {
	        		top++;
	        	}
	        	
	        }
	        answer[0] = lottoRank(top);
	        answer[1] = lottoRank(low);
	        
	        return answer;
	 }
	 
	 
	 static int lottoRank(int a) {
		 int b = 0;
		 switch (a) {
			case 6: b = 1; break;
			case 5: b = 2; break;
			case 4: b = 3; break;
			case 3: b = 4; break;
			case 2: b = 5; break;
			default: b = 6; break;
		}
		 
		 return b;
	 }
	
}
