package Programmers.level01;

public class 약수의_합 {

	public static void main(String[] args) {
		
		System.out.println(solution(5));
		
	}
	
	static public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
			if(n % i == 0) {
				answer += i;
			}
		}
        
        return answer;
    }

	static public int solution2(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if(n % i == 0)
				answer += i;
		}
		return answer;
	}

}
