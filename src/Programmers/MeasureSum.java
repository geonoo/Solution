package Programmers;

public class MeasureSum {
	
	//��
    public static void main(String[] args) {
//    	"AB"	1	"BC"
//    	"z"	1	"a"
//    	"a B z"	4	"e F d"
    	
    	//A~z
    	//Z : 90
    	//65~122
    	System.out.println(solution("a B z",4));
    }
    
    static public String solution(String s, int n) {
    	
    	String answer = "";
    	
    	for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c >= 'A' && c <= 'Z') {
				if((c+n) > 'Z') {
					answer += (char)(c+n-26);
				}else {
					answer += (char)(c+n);
				}
			}else if(c >= 'a' && c <= 'z') {
				if((c+n) > 'z') {
					answer += (char)(c+n-26);
				}else {
					answer += (char)(c+n);
				}
			}else {
				answer += (char)c;
			}
		}
    	
		return answer;
    }
	    
	    
}
	
