package Programmers;

public class CenterString {
		
    public static void main(String[] args) {
//    	"abcde"	"c"
//    	"qwer"	"we"
    	System.out.println(solution("qwer"));
    }
    
    static public String solution(String s) {
        
        return (s.length() % 2 == 0) ? s.substring((s.length()/2)-1, (s.length()/2)+1) : s.substring((s.length()/2), (s.length()/2)+1);
    }
	    
	    
}
	
