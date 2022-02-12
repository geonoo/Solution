package doit.chap08;

import java.util.Scanner;

public class BfMatchLast {
	
	static int bfMatch(String txt, String pat) {
		int pt = txt.length()-1; //txt 커서
		int pp = pat.length()-1; //pat 커
		
		while (pt >= 0 && pp >= 0) {
			if(txt.charAt(pt) == pat.charAt(pp)) {
				pt--;
				pp--;
			}else {
				pt = pt + (pat.length() - pp) -2;
				pp = pat.length()-1;
			}
		}
		if(pp < 0) {
			return pt+1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("txt : ");
		String s1 = sc.next();
		
		System.out.print("패턴 : ");
		String s2 = sc.next();
		
		int idx = bfMatch(s1, s2);
		
		if(idx == -1)
			System.out.println("텍스트에 패턴이 없습니다");
		else {
			int len = 0;
			for (int i = 0; i < idx; i++) {
				len += s1.substring(i, i+1).getBytes().length;
			}
			len += s2.length();
			
			
			System.out.println((idx + 1) + "번째 문자부터 일치합니다.");
			System.out.println("텍스트 : " + s1);
			System.out.printf(String.format("패턴 :  %%%ds\n", len), s2);
		}
	}
	
}
