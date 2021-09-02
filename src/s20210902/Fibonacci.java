package s20210902;

public class Fibonacci {
	public static void main(String[] args) {
		
		System.out.println(solution(1000));
	}
	
	//31 : 1346269
	//32 : 2178309
	//33 : 3524578

	//31 : 111702
	//32 : 943742
	//33 : 1055444
	
	//피보나치수열 
	static long[] arr = {};
	static public long solution(int n) {
		
		arr = new long[n+1];
		
        return fibonacci(n) % 1234567;
    }
	
	static public long fibonacci(int n) {
		
		if(arr[n] == 0) {
			if(n <= 1) {
				arr[n] = n;
			}else if(n == 2){
				arr[n] = 1;
			}else {
				arr[n] = (fibonacci(n-1) % 1234567) + (fibonacci(n-2) % 1234567);
			}
		}
		
		return arr[n];
		
	}
}

//F(4) -> F(2) + F(3)
// F(2) -> F(0) + F(1)
// F(3) > F(0) + F(1) + F(2)
//Stack use
