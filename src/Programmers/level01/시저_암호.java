package Programmers.level01;

public class 시저_암호 {
	
    public static void main(String[] args) {
//    	"AB"	1	"BC"
//    	"z"	1	"a"
//    	"a B z"	4	"e F d"
    	
    	//A~z
    	//Z : 90
    	//65~122
    	System.out.println(solution2("a B z",4));
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

	static public String solution2(String s, int n) {
		String answer = "";
		for (int i = 0; i < s.length() ; i++) {
			char c = s.charAt(i);
			if(c >= 'A' && c <= 'Z'){
				answer += (c + n > 'Z') ? (char)((c+n)-26) :  (char)((c+n));
			}else if(c >= 'a' && c <= 'z'){
				answer += (c + n > 'z') ? (char)((c+n)-26) :  (char)((c+n));
			}else{
				answer += c;
			}
		}
		return answer;
	}
	    
}
	
