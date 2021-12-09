package One;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("a의 값 : ");
		int a = s.nextInt();
		System.out.println("b의 값 : ");
		int b = s.nextInt();
		while (a >= b) {
			System.out.println("a보다 큰 값을 입력하세욧!");
			System.out.println("b의 값 : ");
			b = s.nextInt();
		}
		
		System.out.println("b-a는" + (b-a) +"입니당");
	}

}
