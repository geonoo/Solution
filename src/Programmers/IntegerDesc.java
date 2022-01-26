package Programmers;

import java.util.Arrays;
import java.util.Collections;

public class IntegerDesc {
		
    public static void main(String[] args) {
    	System.out.println(solution(118372));
    }
    
    static public long solution(long n) {
        String[] str = (n+"").split("");
        Arrays.sort(str, Collections.reverseOrder());
        
        String temp = "";
        for (String s : str) {
        	temp += s;
		}
        
        return Long.parseLong(temp);
    }
	    
	    
}
	
