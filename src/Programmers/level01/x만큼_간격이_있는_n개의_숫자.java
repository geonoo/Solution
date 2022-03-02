package Programmers.level01;

import java.util.Arrays;

public class x만큼_간격이_있는_n개의_숫자 {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution2(10000000, 1000)));
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
//                     1,410,065,408
//    –2,147,483,648 ~ 2,147,483,647
//    int 시 범위 오류
    static public long[] solution(int x, int n ){
        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = (long)x * i + x;
        }

        return answer;
    }
	
}
