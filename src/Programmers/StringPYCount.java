package Programmers;

public class StringPYCount {
		
    public static void main(String[] args) {
    	System.out.println(solution("pPoooyY"));
    }
    
    static public boolean solution(String s) {
    	s.toUpperCase();
    	int cnt = 0;
    	for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'P') {
				cnt++;
			}
			
			if(s.charAt(i) == 'Y') {
				cnt--;
			}
		}
    	
        return (cnt == 0) ? true : false;
    }
	    
	    
}
	
