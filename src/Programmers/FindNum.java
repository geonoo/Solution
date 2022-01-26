package Programmers;

public class FindNum {
		
    public static void main(String[] args) {
    	System.out.println(solution("-12345"));
    }
    
    static public boolean solution(String s) {
    	String basic = "0123456789";
        for (int i = 0; i < s.length(); i++) {
			if (basic.indexOf(s.charAt(i)) == -1) {
				return false;
			}
		}
        
        return (s.length() == 4 || s.length() == 6) ? true : false;
        
    }
	    
}
	
