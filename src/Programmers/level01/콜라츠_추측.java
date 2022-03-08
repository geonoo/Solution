package Programmers.level01;

public class 콜라츠_추측 {
		
    public static void main(String[] args) {
    	
    	System.out.println(solution2(16));
    }
    
    static public int solution(double num) {
        int answer = 0;
        
        while (num != 1) {
        	if(answer == 500) {
        		return -1;
        	}
	    	if(num % 2 == 0) {
	        	num = num/2;
	        }else {
	        	num = (num*3)+1;
	        }
	    	answer++;
		}
        return answer;
    }

	static public int solution2(double num) {
		for (int i = 0; i < 500 ; i++) {
			if( num == 1)
				return i;
			num = (num % 2 == 0) ? num/2 : num * 3 + 1;
		}
		return -1;
	}
	    
}
	
