package Programmers;

public class RightBracket {

	public static void main(String[] args) {
		System.out.println(solution("())"));
	}
	
	static boolean solution(String s) {
        boolean answer = true;
        
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
        	
        	if(cnt < 0) {
        		answer = false;
        		break;
        	}
        	
			if(s.charAt(i) == ')') {
				cnt--;
			}else {
				cnt++;
			}
		}
        
        if(cnt == 0) {
        	answer = true;
        }else {
        	answer = false;
        }
        return answer;
    }
	
}
