package Programmers;

public class DigitPlus {
		
    public static void main(String[] args) {
    	System.out.println(solution(5555));
    }
    
    static public int solution(int n) {
        int answer = 0;
        
        String[] str = (n+"").split("");
        for(String s : str) {
        	answer += Integer.parseInt(s);
        }
        
        return answer;
    }
	    
	    
}
	
