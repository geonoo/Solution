package Programmers.level01;

public class 이상한_문자_만들기 {
    public static void main(String[] args) {
    	//TrY HeLlO WoRlD
    	System.out.println(solution("try hello world"));
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
	
