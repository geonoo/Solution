package Programmers;

public class PhoneFinger {
	
	public static void main(String[] args) throws Exception {
		
		//LRLLLRLLRRL
//		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
//		String hand = "right";
		
		//LRLLRRLLLRR
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";
		
		System.out.println(solution(numbers, hand));
		
//		1 2 3
//		4 5 6
//		7 8 9
//		* 0 #
		
	}
	
	
	
	 public static String solution(int[] numbers, String hand) {
		 String answer = "";
		 
		 int leftPos = 10;
		 int rightPos = 12;
		 
		 for(int n : numbers) {
			 if(n == 1 || n == 4 || n == 7) {
				 answer += "L";
				 leftPos = n;
			 }else if(n == 3 || n == 6 || n == 9) {
				 answer += "R";
				 rightPos = n;
			 }else {
				 int rIdx = getLength(rightPos, n);
				 int lIdx = getLength(leftPos, n);
				 
				 if(rIdx < lIdx) {
					 rightPos = n;
					 answer += "R";
				 }else if(rIdx > lIdx) {
					 leftPos = n;
					 answer += "L";
				 }else {
					 if(hand.equals("right")) {
						 rightPos = n;
						 answer += "R";
					 }else {
						 leftPos = n;
						 answer += "L";
					 }
				 }
			 }
		 }
		 
		 
		 return answer;
	 }
	 
	 public static int getLength(int idx, int n) {
		
		idx = (idx == 0) ? 11 : idx;	
		n = (n == 0) ? 11 : n;
		
		int x = (idx - 1) / 3;
		int y = (idx - 1) % 3; 
		int nX = n / 3;
		int nY = 1;

		return Math.abs(x-nX) + Math.abs(y-nY);
	 }
	
}
