package Programmers.level01;

public class 정수_제곱근_판별 {
		
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

   static public long solution(int n) {
        double rtn = Math.sqrt(n);
        return rtn % 1 == 0 ? (long)Math.pow(rtn+1, 2) : -1;
   }
	    
	    
}
	
