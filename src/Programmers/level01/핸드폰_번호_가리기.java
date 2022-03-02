package Programmers.level01;

public class 핸드폰_번호_가리기 {
		
    public static void main(String[] args) {
    	System.out.println(solution2("12345678"));
    }
    
    static public String solution(String phone_number) {
        String answer = "";
        
		for(int i=0; i<(phone_number.length()-4);i++) {
			answer += "*";
		}
		answer += phone_number.substring(phone_number.length()-4, phone_number.length());
        
        return answer;
    }

    static public String solution2(String p) {
        String tail = p.substring(p.length()-4, p.length());
        if(p.length()-5 > 0){
            int len = p.length() - 4;
            String star = "";
            for (int i = 0; i < len; i++)
                star += "*";
            return star + tail;
        }else{
            return tail;
        }

    }

    public String solution3(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for(int i = 0; i < ch.length - 4; i ++){
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }

    public String solution4(String phone_number) {
        return phone_number.replaceAll(".(?=.{4})", "*");
    }
	    
}
	
