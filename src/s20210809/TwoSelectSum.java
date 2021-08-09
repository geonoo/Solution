package s20210809;

import java.util.*;

public class TwoSelectSum {
		
    public static void main(String[] args) {
    	
//    	[2,1,3,4,1]	[2,3,4,5,6,7]
//    	[5,0,2,7]	[2,5,7,9,12]
    	
    	int[] numbers = {5,0,2,7};
    	int[] rtn = solution(numbers);
    	for (int i = 0; i < rtn.length; i++) {
    		System.out.println(rtn[i]);
		}
    	
    	
    }
    
    static public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if(!list.contains(numbers[i]+numbers[j])) {
					list.add(numbers[i]+numbers[j]);
				}
			}
		}
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
        
        Arrays.sort(answer);
        
        return answer;
    }
	    
	    
}
	
