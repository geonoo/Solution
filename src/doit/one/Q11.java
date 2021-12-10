package doit.one;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("양의 정수를 입력하세욧 : ");
		
		int a = s.nextInt();
		int num = 0;
		while (a > 0) {
			a /= 10;
			num++;
		}
		
		System.out.println("입력한 수의 자릿수는 "+num+"자리 입니다.");
	}

}
