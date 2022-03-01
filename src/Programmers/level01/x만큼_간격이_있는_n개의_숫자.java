package Programmers.level01;

import java.util.Arrays;

public class x만큼_간격이_있는_n개의_숫자 {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution2(2, 5)));
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

//    2	5	[2,4,6,8,10]
//    4	3	[4,8,12]
//    -4	2	[-4, -8]
    static public long[] solution2(long x, int n ){
        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = x * i + x;
            System.out.println(x);
        }

        return answer;
    }
	
}
