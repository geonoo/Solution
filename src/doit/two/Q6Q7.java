package doit.two;

import java.util.Scanner;

public class Q6Q7 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int no;
		int cd;
		int dno;
		char[] cno = new  char[32];
		
		System.out.println("10진수를 기수 변환합니다.");
			do {
				System.out.print("변환하는 음이 아닌 정수 : ");
				no = stdIn.nextInt();
			}while(no < 0);
			
			do {
				System.out.print("어떤 진수로 변환할까요? (2~36) : ");
				cd = stdIn.nextInt();
			}while(cd < 2 || cd > 36);
			
			dno = CardConvR(no, cd, cno);
			
			System.out.print(cd + "진수로는 ");
			for (int i = dno-1; i>=0; i--) {
				System.out.print(cno[i]);
			}
			System.out.println("입니다.");
			
	}
	
	static int CardConvR(int x, int r, char[] d){
		
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.println();
		
		do {
			System.out.print(r+" |     ");
			if(digits > 0) {
				System.out.println(x + "  ... " + dchar.charAt(x % r));
			}else {
				System.out.println(x);
			}
			System.out.println("  +--------");
			if(x < r) {
				System.out.println("        0  ... " + dchar.charAt(x % r));
			}
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		}while(x != 0);
		
		return digits;
	}
	
	static int CardConv(int x, int r, char[] d){
		
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		}while(x != 0);
		
		for (int i = 0; i < digits/2; i++) {
			char t = d[i];
			d[i] = d[digits-1-i];
			d[digits-1-i] = t;
		}
		
		return digits;
	}
	
	
}
