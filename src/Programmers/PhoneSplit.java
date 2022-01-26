package Programmers;

public class PhoneSplit {
		
    public static void main(String[] args) {
    	System.out.println(solution("01093292136"));
    }
    
    static public String solution(String phone_number) {
        String answer = "";
        
        if(phone_number.length() > 4) {
        	for(int i=0; i<(phone_number.length()-4);i++) {
        		answer += "*";
        	}
        	answer += phone_number.substring(phone_number.length()-4, phone_number.length());
        }else {
        	answer = phone_number;
        }
        
        return answer;
    }
	    
	    
}
	
