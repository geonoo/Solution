package Programmers.level01;

public class 제일_작은_수_제거하기 {
		
	public static void main(String[] args) {
    	int[] arr = {10};
    	
    	int[] rtn = solution(arr);
    	for(int r : rtn) {
    		System.out.println(r);
    	}
    	
    }
    
    static public int[] solution(int[] arr) {
        int[] answer = {};
        
        if(arr.length == 1) {
        	answer = new int[1];
        	answer[0] = -1;
        }else {
        	answer = new int[arr.length-1];
        	int min = arr[0];
        	for (int i = 0; i < arr.length; i++) {
        		if(min > arr[i]) {
        			min = arr[i];
        		}
			}
        	int j = 0;
        	for (int i = 0; i < arr.length; i++) {
        		if(min != arr[i]) {
        			answer[j] = arr[i];
        			j++;
        		}
			}
        }
        
        return answer;
    }
	    
	    
}
	
