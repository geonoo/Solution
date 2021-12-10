package doit.one;

import java.util.*;

public class Max3 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		
		System.out.print("a의 값 : "); int a = s.nextInt();
		System.out.print("b의 값 : "); int b = s.nextInt();
		System.out.print("c의 값 : "); int c = s.nextInt();
		
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.println("최댓값은 : " + max + " 입니다.");
		
	}
}
