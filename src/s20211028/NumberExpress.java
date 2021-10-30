package s20211028;

public class NumberExpress {

	public static void main(String[] args) {
		
		System.out.println(solution(15));
		
	}
//	1 + 2 + 3 + 4 + 5 = 15
//	4 + 5 + 6 = 15
//	7 + 8 = 15
//	15 = 15
	static public int solution(int n) {
        int answer = 0;
        
        for (int i = 0; i < n; i++) {
        	int temp = 0;
        	for (int j = i+1; j <= n; j++) {
        		temp += j;
        		if(temp == n) {
        			answer++;
        			temp = 0;
        			break;
        		}else if(temp > n) {
        			break;
        		}
    		}
		}
        
        return answer;
    }

}
