package Programmers.level01;

public class 수박수박수박 {

	public static void main(String[] args) {
		System.out.println(solution(5));
	}
	
	static public String solution(int n) {
        String answer = "";
        
        for (int i = 1; i<=n; i++) {
        	answer += (i % 2 == 0) ? "박" : "수";
		}
        
        return answer;
    }

	static public String solution2(int n) {

		String answer = "";
		for (int i = 0; i <n ; i++) {
			answer += (i % 2 == 0) ? "수" : "박";
		}

		return answer;
	}

}
