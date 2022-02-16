package Programmers.level01;

import java.util.Arrays;

public class x만큼_간격이_있는_n개의_숫자 {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(2, 5)));
	}
	
	static public long[] solution(int x, int n) {
        long[] answer = new long[n];
	    long t = x;
        
        for(int i=0;i<n;i++) {
            answer[i] = t*i+x;
            System.out.println(answer[i]);
        }
        return answer;
    }
	
}
