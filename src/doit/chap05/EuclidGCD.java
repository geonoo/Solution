package doit.chap05;

import java.util.Scanner;

public class EuclidGCD {

	static int gcd(int x, int y) {
		if(y == 0) {
			return x;
		}
		else return gcd(y, x % y);
	}
	
	static int gcd2(int x, int y) {
		
		if(x > y) {
			int t = y;
			y = x;
			x = t;
		}
		
		while (y > 1) {
			y = x % y;
			if(y == 0)
				return x;
		}
		
		return y;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("두 정수의 최대공약수를 구합니다. ");
		System.out.print("정수를 입력하세");
		int x = stdIn.nextInt();
		System.out.print("정수를 입력하세");
		int y = stdIn.nextInt();
		
		System.out.println("최대 공약수는 "+ gcd2(x,y) + "입니다.");
	}

}
