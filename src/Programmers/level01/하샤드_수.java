package Programmers.level01;

public class 하샤드_수 {
		
    public static void main(String[] args) {
    	System.out.println(solution(216));
    }
    
    static public boolean solution(int x) {
    	boolean answer = true;
    	
    	String[] num = (x+"").split("");
    	int hashad = 0;
    	
    	for(int i=0; i<num.length; i++) {
    		hashad += Integer.parseInt(num[i]);
    	}
    	
    	if(x % hashad == 0) {
    		answer = true;
    	}else {
    		answer = false;
    	}
    	
    	return answer;
    }
	    
	    
}
	
