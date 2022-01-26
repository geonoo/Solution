package Programmers;

public class 배민_Two {
	public static void main(String[] args) {
		
//		437674	3	3
//		110011	10	2
		
		System.out.println(solution(1000000, 10));
		
	}
	
	static public int solution(int n, int k) {
        int answer = 0;
        String[] b = {};
        if(k != 10) {
        	b = conversion(n,k).split("0");
        }else {
        	b = (n+"").split("0");
        }
        
        for (String bb : b) {
        	if(NumberCheck(bb)) {
    			if(isPrime(Long.parseLong(bb))) {
    				answer++;
    			}
        	}
		}
        
        return answer;
    }
	
	
	static public boolean isPrime(long num) {
		boolean isPrime = true;
		
		if(num == 1) return false;
 
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
	}
	
	static boolean NumberCheck(String s) {
    	try {
			Long.parseLong(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
    }
	
	
	static public String conversion(int number, int N){
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
