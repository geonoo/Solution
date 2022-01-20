package doit.e_five.two;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		recur2(sc.nextInt());
	}
	
	static void recur2(int n) {
		if(n > 0) {
			recur2(n-2);
			System.out.println(n);
			recur2(n-1);
		}
	}

}
