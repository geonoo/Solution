package Programmers;

public class IntervalXNumber {
		
	    public static void main(String[] args) {
	    	solution(10000000,10);
	    }
	    
	    static public long[] solution(int x, int n) {
	        long[] answer = new long[n];
	        
	        for(int i=0;i<n;i++) {
	        	answer[i] = x*i+x;
	        	System.out.println(answer[i]);
	        }
	        
	        return answer;
	    }
	}
	
