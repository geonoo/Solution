package Programmers.level01;

public class 내적 {
		
    public static void main(String[] args) {
    	
//    	[1,2,3,4]	[-3,-1,0,2]	3
//    	[-1,0,1]	[1,0,-1]	-2
    	int[] a = {-1,0,1};
    	int[] b = {1,0,-1};
    	System.out.println(solution(a, b));
    }
    
    static public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for (int i = 0; i < a.length; i++) {
			answer += a[i]*b[i];
		}
        
        return answer;
    }
	    
	    
}
	
