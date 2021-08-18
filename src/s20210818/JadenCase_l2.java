package s20210818;


public class JadenCase_l2 {
		
    public static void main(String[] args) {
//    	"3people unFollowed me"	"3people Unfollowed Me"
//    	"for the last week"	"For The Last Week"
    	
    	String s = "3people Unfollowed Me";
    	
    	System.out.println(solution(s));
    }
    
    static public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        boolean upper = true;
        for (int i = 0; i < s.length(); i++) {
        	if(upper) {
        		answer += (s.charAt(i)+"").toUpperCase();
        		upper = false;
        	}else {
        		answer += s.charAt(i)+"";
        	}
			
        	if(s.charAt(i) == ' ') {
        		upper = true;
        	}
        	
		}
        
        return answer;
    }
    
}
	
