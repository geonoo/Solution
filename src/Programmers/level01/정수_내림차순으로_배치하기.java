package Programmers.level01;

import java.util.Arrays;
import java.util.Collections;

public class 정수_내림차순으로_배치하기 {
		
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
	
