package s20220103;

import java.util.Arrays;

public class 주식가격 {

	public static void main(String[] args) {
//		[1, 2, 3, 2, 3]	[4, 3, 1, 1, 0]
		
//		int[] prices = {1,2,1,3,3};
		int[] prices = {1,2,3,2,3};
		
		System.out.println(Arrays.toString(solution(prices)));
		
	}
	
	
	static public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
        	int sec = 0;
        	for (int j = i+1; j < answer.length; j++) {
				sec++;
				if(prices[i] > prices[j]) {
					break;
				}
			}
        	answer[i] = sec;
        }
        
              
        return answer;
    }

}
