package Programmers;

public class SquareRoot {
		
    public static void main(String[] args) {
    	System.out.println(solution(121));
    }
    
    static public long solution(double n) {
        double s = Math.sqrt(n);
        if(s % 1 == 0) {
        	return (long) ((s+1)*(s+1));
        }else {
        	return -1;
        }
    }
	    
	    
}
	
