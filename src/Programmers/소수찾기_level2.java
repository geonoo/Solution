package Programmers;

import java.util.HashSet;
import java.util.Iterator;

public class 소수찾기_level2 {

	public static void main(String[] args) {
		
		System.out.println(solution("17"));
	}
	
	static HashSet<Integer> set = new HashSet<>();
	static public void findComb(String comb, String others) {
    	if(!comb.equals("")) {
    		set.add(Integer.valueOf(comb));
    	}
    	
    	for (int i = 0; i < others.length(); i++) {
			findComb(comb + others.charAt(i), others.substring(0, i) + others.substring(i+1));
		}
    	
    }
	
	static boolean isPrime(int num) {
		
		if(num == 0 || num == 1) {
			return false;
		}
		
		int limit = (int)Math.sqrt(num);
		for (int i = 2; i <=limit; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	static public int solution(String numbers) {
        int answer = 0;
        
        //1. 조합할수있는 숫자 찾기
        findComb("", numbers);
        
        Iterator<Integer> sets = set.iterator();
        while (sets.hasNext()) {
			if(isPrime(sets.next())) {
				answer++;
			}
			
		}
        return answer;
    }

}
