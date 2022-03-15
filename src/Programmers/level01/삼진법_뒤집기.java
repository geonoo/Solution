package Programmers.level01;

public class 삼진법_뒤집기 {
		
    public static void main(String[] args) {
    	//125 229
    	//45  7
    	System.out.println(solution2(125));
    }
    
    static public int solution(int n) {
        int answer = 0;
        
        String a = "";
        while (n > 0) {
        	a = (n % 3) + a;
        	n /= 3;
		}
        
        //String 역 순으로 뒤집기!
        a = new StringBuffer(a).reverse().toString();
        System.out.println(a);
        
        //3진법에서 10진법으로
        //return Integer.parseInt(a,3);
        
        int num = 0;
        for (int i = a.length()-1; i >= 0; i--) {
        	System.out.println(i);
        	answer += Integer.parseInt((a.charAt(i)+"")) * (int)Math.pow(3, num);
        	num++;
        }
        
        return answer;
    }

    static public int solution2(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        while (n > 0){
            sb.append(n % 3);
            n /= 3;
        }

        int j = 1;
        for (int i = sb.toString().length()-1; i >= 0; i--) {
            answer += (sb.charAt(i) - '0')* j;
            j *= 3;
        }

        return answer;
    }
	    
}
	
