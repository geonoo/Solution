package Programmers;

public class Compression_kakao {
	public static void main(String[] args) {
		
//		"aabbaccc"	7
//		"ababcdcdababcdcd"	9
//		"abcabcdede"	8
//		"abcabcabcabcdededededede"	14
//		"xababcdcdababcdcd"	17
		
		//substring 하는 idx 값 파악 
		
		System.out.println(solution("xababcdcdababcdcd"));
		//0,1
		//1,2
		//2,3
		//3,4
		//4,5
		//5,6
		//6,7
		//7,8
		
		//0,2
		//2,4
		//4,6
		//6,8
	}
	//문자열 압축 
	
	static public int solution(String s) {
		
		int min = s.length();
		String now, temp = "", rtn = "";
		int count = 1;
		
		for (int i = 1; i <= s.length()/2; i++) {
			rtn = "";
			for (int j = 0; j < Math.ceil((double)s.length()/i); j++) {
				now = s.substring(i*j, i*(j+1) >= s.length() ? s.length() : i*(j+1));

				if(temp.equals(now)) {
					count++;
				}else {
					if(count != 1) {
						rtn += count;
						count = 1;
					}
					rtn += temp;
					temp = now;
				}
				
			}
			if(count != 1) {
				rtn += count;
				count = 1;
			}
			rtn += temp;
			temp = "";

			min = Math.min(min, rtn.length());
			
			
		}
		
		return min;
        
    }
	
}
