package Programmers.level01;

public class 나머지가_1인_수_찾기 {
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
