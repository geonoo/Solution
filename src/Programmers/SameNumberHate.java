package Programmers;

import java.util.ArrayList;

public class SameNumberHate {
		
    public static void main(String[] args) {
//    	[1,1,3,3,0,1,1]	[1,3,0,1]
//    	[4,4,4,3,3]	[4,3]
    	int[] arr = {0,0,0};
    	int[] rtn = solution(arr);
    	for (int i = 0; i < rtn.length; i++) {
    		System.out.println(rtn[i]);
		}
    	
    }
    
    static public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
    	for (int i = 0; i < arr.length-1; i++) {
    		if(arr[i] != arr[i+1]) {
    			list.add(arr[i]);
    		}
    		
    		if(i == arr.length-2) {
    			if(arr[i] != arr[i+1]) {
    				list.add(arr[i+1]);
    			}else {
    				list.add(arr[i+1]);
    			}
			}
    	}
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
        
        return answer;
    }
	    
	    
}
	
