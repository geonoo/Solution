package s20211106;

import java.util.*;

public class Test4 {

	public static void main(String[] args) {
//		"aaabbaaa"	[2,6]
//		"wowwow"	[1,1,2,2]
		System.out.println(Arrays.toString(solution("wowwow")));
	}
	
	static public int[] solution(String s) {
        List<Integer> list = new ArrayList<>();
        int cnt = 1;
        for (int i = 1; i < s.length(); i++) {
			if(s.charAt(i-1) == s.charAt(i)) {
				cnt++;
			}else {
				if(cnt != 0) {
					list.add(cnt);
					cnt = 1;
				}
			}
			if(s.length()-1 == i) {
				if(s.charAt(i) == s.charAt(0)) {
					list.set(0, list.get(0)+cnt);
				}else {
					list.add(cnt);
				}
			}
		}
        
        int[] answer = new int[list.size()];
        for (int i=0; i<answer.length; i++) {
        	answer[i] = list.get(i);
		}
        
        Arrays.sort(answer);
        
        return answer;
        
    }

}
