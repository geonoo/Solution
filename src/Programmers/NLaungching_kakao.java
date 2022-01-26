package Programmers;

public class NLaungching_kakao {
		
    public static void main(String[] args) {
//    	2	4	2	1	"0111"
//    	16	16	2	1	"02468ACE11111111"
//    	16	16	2	2	"13579BDF01234567"
    	System.out.println(solution(16,16,2,2));
    }
    
    //n : 진법
    //t : 구해야할 갯수
    //m : 게임에 참가하는 인원
    //p : 내순서
    static public String solution(int n, int t, int m, int p) {
        String answer = "";
        
        String a = "0";
        int num = 1;
        while(a.length() < (m*t)) {
        	a += conversion(num, n);
        	num++;
        }
        
        for(int i=(p-1);i<a.length();i+=m) {
        	answer += a.charAt(i)+"";
        }
        
        
        return answer.substring(0, t);
    }
	    
    
    public static String conversion(int number, int N){
        StringBuilder sb = new StringBuilder();
	    int current = number;
	    
        while(current > 0){
            if(current % N < 10){
                sb.append(current % N);
                
            } else {
                sb.append((char)(current % N - 10 + 'A'));
            }
            current /= N;
        }
        return sb.reverse().toString();
    }
    
}
	
