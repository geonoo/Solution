package Programmers.level01;

public class 두_정수_사이의_합 {
		
    public static void main(String[] args) {
    	System.out.println(solution3(3,3));
    }
    
    static public long solution(int a, int b) {
        long answer = 0;
        if(a > b) {
        	for (long i = b; i <= a; i++) {
            	answer += i;
    		}
        }else {
        	for (long i = a; i <= b; i++) {
            	answer += i;
    		}
        }
        
        return answer;
    }
	
    public long solution2(int a, int b) {
        long answer = 0;
        if(a!=b){
            for(int i=Math.min(a,b);i<=Math.max(a,b);i++){
                answer+=i;
            }
        }else{
            answer=a;
        }
        return answer;
    }

    static public long solution3(int a, int b) {
        long answer = 0;
        for (int i = Math.min(a,b); i <= Math.max(a,b) ; i++)
            answer += i;
        return answer;
    }
	    
}
	
