package Programmers;

import java.util.*;

public class DivideNumArr {
		
    public static void main(String[] args) {
    	//[5, 9, 7, 10]	5	[5, 10]
		//[2, 36, 1, 3]	1	[1, 2, 3, 36]
		//[3,2,6]	10	[-1]
    	
    	int[] arr = {2, 36, 1, 3};
    	int[] rtn = solution(arr,1);
    	
    	System.out.println(Arrays.toString(rtn));
    }
    
    static public int[] solution(int[] arr, int divisor) {
    	
    	Arrays.sort(arr);
    	String temp = "";
    	for (int i = 0; i < arr.length; i++) {
    		if(arr[i] % divisor == 0) {
    			temp += arr[i]+"|";
    		}
		}
    	temp = temp.substring(0,temp.length()-1);
    	String[] temps = temp.split("\\|");
    	
    	int[] rtn = new int[temps.length];
    	for (int i = 0; i < temps.length; i++) {
			rtn[i] = Integer.parseInt(temps[i]);
		}
    	
    	return rtn;
    }
    
    
    static public int[] solution2(int[] arr, int divisor) {
        
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
	
