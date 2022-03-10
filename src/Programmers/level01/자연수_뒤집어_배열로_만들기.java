package Programmers.level01;

import java.util.Arrays;
import java.util.Collections;

public class 자연수_뒤집어_배열로_만들기 {
		
    public static void main(String[] args) {
    	int[] aa = solution(4561);
    	for (int i = 0; i < aa.length; i++) {
			System.out.println(aa[i]);
		}
    }
    static public int[] solution(long n) {
        String[] str = (n+"").split("");
        int[] answer = new int[str.length];
        for (int i=0;i<str.length;i++) {
			answer[i] = Integer.parseInt(str[(str.length-1)-i]);
		}
        
        return answer;
    }
}
	
