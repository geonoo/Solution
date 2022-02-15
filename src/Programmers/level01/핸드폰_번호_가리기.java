package Programmers.level01;

public class 핸드폰_번호_가리기 {
		
    public static void main(String[] args) {
    	System.out.println(solution("1234"));
    }
    
    static public String solution(String phone_number) {
        String answer = "";
        
		for(int i=0; i<(phone_number.length()-4);i++) {
			answer += "*";
		}
		answer += phone_number.substring(phone_number.length()-4, phone_number.length());
        
        return answer;
    }
	    
	    
}
	
