package Programmers.level01;

import java.util.Locale;

public class 이상한_문자_만들기 {
    public static void main(String[] args) {
    	//TrY HeLlO WoRlD
    	System.out.println(solution("  aa ss"));
    }
    
    static public String solution(String s) {
        String answer = "";
        
        String[] str = s.split("");

        int idx = 0;
        for (int i = 0; i < str.length; i++) {
			if(str[i].equals(" ")) {
				idx = 0;
				answer += " ";
			}else if(idx % 2 == 0) {
				answer += str[i].toUpperCase();
				idx++;
			}else {
				answer += str[i].toLowerCase();
				idx++;
			}
		}
        return answer;
    }
	    
}
	
