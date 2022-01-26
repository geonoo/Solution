package Programmers;

import java.util.Arrays;

public class AutoComplate_kakao {
	public static void main(String[] args) {
		
//		["go","gone","guild"]	7
//		["abc","def","ghi","jklm"]	4
//		["word","war","warrior","world"]	15
		
		String[] words = {"word","war","warrior","world"};
		
		//go : go
		//gone : gon
		//guild : gu
		System.out.println(solution(words));
		
	}
	//자동정렬
	static public int solution(String[] words) {
        int answer = 0;
        
        Arrays.sort(words);
        int[] count = new int[words.length];

        for (int i = 0; i < words.length-1; i++) {
			
        	int len = Math.min(words[i].length(), words[i+1].length());
        	int sameCnt = same(words[i], words[i+1], len);
        	
        	if(len == sameCnt) {
        		count[i] = Math.max(count[i], sameCnt);
        	}else {
        		count[i] = Math.max(count[i], sameCnt+1);
        	}
        	count[i+1] = Math.max(count[i+1], sameCnt+1);
        	
		}
        
        for (int i : count) {
			answer += i;
		}
        
		return answer;
        
    }
	
	static public int same(String a, String b, int len) {
		int cnt = 0;
		for (int i = 0; i < len; i++) {
			if(a.charAt(i) != b.charAt(i)) {
				return cnt;
			}
			cnt++;
		}
		
		return cnt;
		
	}
}
