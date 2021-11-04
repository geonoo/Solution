package s20211104;

public class RemainderOne {
	public static void main(String[] args) {
		
		System.out.println(solution(12));
	}
	
	static public int solution(int n) {
        int answer = 0;
        
        for (int i = 2; i < n; i++) {
			if(n % i == 1) {
				return i;
			}
		}
        
        return answer;
    }
}
