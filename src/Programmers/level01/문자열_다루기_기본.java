package Programmers.level01;

public class 문자열_다루기_기본 {

	public static void main(String[] args) {
		
//		"a234"	false
		System.out.println(solution("123456"));
		
	}
	
	static public boolean solution(String s) {
		
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		}
		
		return s.length() == 6 || s.length() == 4 ? true : false;
	}

}
