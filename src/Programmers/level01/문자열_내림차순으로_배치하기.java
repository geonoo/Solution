package Programmers.level01;

import java.util.Arrays;
import java.util.Collections;

public class 문자열_내림차순으로_배치하기 {
		
    public static void main(String[] args) {
    	System.out.println(solution("Zbcdefg"));
    }
    
    static public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        for (String ss : arr) {
			answer += ss;
		}
        
        return answer;
    }
	    
	    
}
	
