package Programmers.level01;

public class 최대공약수와_최소공배수 {
		
    public static void main(String[] args) {
    	
    	System.out.println(solution(3, 12)[0]);
    	System.out.println(solution(3, 12)[1]);
    }
    
    static public int[] solution(int n, int m) {
        
    	int[] answer = {gcd(n,m), lcm(n,m)};
        
        return answer;
    }
    
    //최대공약수 Greatest Common Divisor, 시간 복잡도 : O(logN)
    static int gcd(int a, int b) {
		 while(b!=0) {
			 int r=a%b;
			 a=b;
			 b=r;
		 }
		 return a;
	 }
    
    //최소공배수 Least Common Multiple
	 static int lcm(int a,int b) {
		 return a*b/gcd(a,b);
	 }

	 //무차별 대입, 시간 복잡도 : O(n)
	public static int gcd2(int a, int b) {
		int answer = 0;
		for(int i = 1; i <= b; i++) {
			if(a % i == 0 && b % i == 0) answer = i;
		}
		return answer;
	}
}
	
