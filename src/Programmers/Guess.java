package Programmers;

public class Guess {
		
    public static void main(String[] args) {
    	
    	System.out.println(solution(626331));
    }
    
    static public int solution(double num) {
        int answer = 0;
        
        while (num != 1) {
        	if(answer == 500) {
        		return -1;
        	}
	    	if(num % 2 == 0) {
	        	num = num/2;
	        }else {
	        	num = (num*3)+1;
	        }
	    	answer++;
		}
        return answer;
    }
	    
	    
}
	
