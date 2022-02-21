package Programmers.level02;


public class N개의_최소공배수 {
		
    public static void main(String[] args) {
//    	[2,6,8,14]	168
//    	[1,2,3]	6
    	int[] arr = {2,8,6,14};
    	System.out.println(solution(arr));
    }
    
    static public int solution(int[] arr) {
    	int lcm1 = arr[0];
    	for(int i=0;i<arr.length;i++) {
    		lcm1 = lcm(lcm1,arr[i]);
    	}
    	return lcm1;
    }
    
    static int gcd(int a, int b) {
		 while(b!=0) {
			 int r=a%b;
			 a=b;
			 b=r;
		 }
		 return a;
	 }
	 static int lcm(int a,int b) {
		 return a*b/gcd(a,b);
	 }
}
	
