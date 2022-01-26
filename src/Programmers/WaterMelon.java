package Programmers;

public class WaterMelon {
		
    public static void main(String[] args) {
    	System.out.println(solution(8));
    }
    
    static public String solution(int n) {
        String answer = "";
        
        for (int i = 1; i<=n; i++) {
        	answer += (i % 2 == 0) ? "��" : "��";
		}
        
        return answer;
    }
	    
	    
}
	
