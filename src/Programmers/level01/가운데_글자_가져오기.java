package Programmers.level01;

public class 가운데_글자_가져오기 {
		
    public static void main(String[] args) {
//    	"abcde"	"c"
//    	"qwer"	"we"
    	System.out.println(solution3("abcde"));
    }
    
    static public String solution(String s) {
    	
    	if(s.length() % 2 == 0) {
    		return s.substring(s.length()/2-1, s.length()/2+1);
    	}else {
    		return s.substring(s.length()/2, s.length()/2+1);
    	}
    }
    
    static public String solution2(String s) {
        
        return (s.length() % 2 == 0) ? s.substring((s.length()/2)-1, (s.length()/2)+1) : s.substring((s.length()/2), (s.length()/2)+1);
    }

    static public String solution3(String s) {
        return (s.length() % 2 == 0 ? s.substring(s.length()/2-1, s.length()/2+1) : s.substring(s.length()/2, s.length()/2+1));
    }
	    
}
	
