package Programmers;

import java.util.Scanner;

public class 별_삼각형_그리기 {
	
	
//	*
//	**
//	***
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    
	    String b = "*";
	    for (int i = 0; i < a; i++) {
			System.out.println(b);
			b += "*";
		}
	    
	}
	
}
