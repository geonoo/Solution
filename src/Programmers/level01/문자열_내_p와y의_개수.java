package Programmers.level01;

import java.util.Locale;

public class 문자열_내_p와y의_개수 {

	public static void main(String[] args) {
//		"pPoooyY"	true
		System.out.println(solution2("pPoooyY"));
	}
	
	static boolean solution(String s) {
		int cntP = 0;
		int cntY = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
				cntP++;
			}
			if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
				cntY++;
			}
		}
		
		return cntP == cntY ? true : false;
	}

	static boolean solution2(String s) {
		s = s.toLowerCase();
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'p'){
				cnt++;
			}else if(s.charAt(i) == 'y'){
				cnt--;
			}
		}

		return (cnt == 0) ? true :false;
	}

}
