package Programmers;

import java.util.*;

public class DivideNumArr {
		
    public static void main(String[] args) {
    	//[5, 9, 7, 10]	5	[5, 10]
		//[2, 36, 1, 3]	1	[1, 2, 3, 36]
		//[3,2,6]	10	[-1]
    	
    	int[] arr = {2, 36, 1, 3};
    	
    	int[] rtn = solution(arr,1);
    	for (int i = 0; i < rtn.length; i++) {
    		System.out.print(rtn[i]);
			if(i != (rtn.length-1))System.out.print(",");
		}
    	
    }
    
    static public int[] solution(int[] arr, int divisor) {
        
    	Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
        int[] answer = (list.size() == 0) ?  new int[1] : new int[list.size()];
        answer[0] = -1;
        
        for (int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
		}
        
        return answer;
    }
	    
}
	
