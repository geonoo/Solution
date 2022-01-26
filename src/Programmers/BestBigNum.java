package Programmers;

import java.util.*;

public class BestBigNum {

	public static void main(String[] args) {
//		[6, 10, 2]	"6210"
//		[3, 30, 34, 5, 9]	"9534330"
		int[] numbers = {6, 10, 2};
		System.out.println(solution(numbers));
	}
	
	
	static public String solution(int[] numbers) {
        String answer = "";
        
        List<String> s = new ArrayList<String>();
        for (int i = 0; i < numbers.length; i++) {
        	s.add(numbers[i]+"");
        }
        
        Collections.sort(s, (a,b) -> (b + a).compareTo(a + b));
        
        if(s.get(0).equals("0")) return "0";
        
        for (String ss : s) {
			answer += ss;
		}
        
        return answer;
    }

}
