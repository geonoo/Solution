package Programmers.level01;

public class 문자열_내_p와y의_개수 {

	public static void main(String[] args) {
//		"pPoooyY"	true
		System.out.println(solution("pPoooyY"));
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

}
