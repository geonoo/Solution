package Programmers.level01;

public class 자릿수_더하기 {
		
    public static void main(String[] args) {
    	System.out.println(solution2(5555));
    }
    
    static public int solution(int n) {
        int answer = 0;
        
        String[] str = (n+"").split("");
        for(String s : str) {
        	answer += Integer.parseInt(s);
        }
        
        return answer;
    }

    static public int solution2(int n) {
        int answer = 0;
        String str = n + "";
        for (int i = 0; i < str.length(); i++) {
            answer += str.charAt(i) - '0';
        }

        return answer;
    }
	    
}
	
