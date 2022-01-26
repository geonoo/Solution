package Programmers;

public class Average {
		
    public static void main(String[] args) {
    	int[] arr = {5,5};
    	System.out.println(solution(arr));
    }
    
    static public double solution(int[] arr) {
        double answer = 0;
        
        int sum = 0;
        for(int a : arr) {
        	sum += a;
        }
        answer = (double)sum/(double)arr.length; 
        
        return answer;
    }
	    
	    
}
	
