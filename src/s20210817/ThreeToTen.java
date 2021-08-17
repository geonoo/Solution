package s20210817;

public class ThreeToTen {
		
    public static void main(String[] args) {
    	//125 229
    	//45  7
    	System.out.println(solution(125));
    }
    
    static public int solution(int n) {
        int answer = 0;
        
        String a = "";
        while (n > 0) {
        	a = (n % 3) + a;
        	n /= 3;
		}
        
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
	    
	    
}
	
