package doit.one;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("단 수 : ");
		
		int len = s.nextInt();
		
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
