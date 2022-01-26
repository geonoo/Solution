package doit.chap05;

import java.util.Scanner;

import doit.chap04.IntStack;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		recur4(sc.nextInt());
	}
	
	static void recur3(int n) {
		if(n > 0) {
			recur3(n-1);
			recur3(n-2);
			System.out.println(n);
		}
	}
	
	static void recur4(int n) {
		
		IntStack s = new IntStack(n*n);
		
		//r(3) 3
		//r(2)r(1) 2 1
		//r(1)r(-1) 1
		int x = n;
		int y = n;
		s.push(n);
		while (true) {
			if(x > 0 || y > 0) {
				x = x - 1;
				y = y - 2;
				if(y > 0) {
					s.push(y);
				}
				if(x > 0) {
					s.push(x);
				}
				continue;
			}
			break;
		}
		
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}

}
