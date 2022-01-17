package doit.e_five.one;

import java.util.Scanner;

public class Q1_factorial {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요. : ");
		int x = stdIn.nextInt();
		int rtn = x;
		int y = 1;
		while (x != 1) {
			if(x == 0) break;
			
			y *= x--;
		}
		
		System.out.println(rtn + "의 팩토리얼은 "+y+ "입니다." );
	}

}
