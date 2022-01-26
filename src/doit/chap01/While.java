package doit.chap01;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("1부터 n까지 합을 구합니다.");
		System.out.println("n의 값 : ");
		
		int n = s.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while( i <= n) {
			sum += i;
			i++;
		}
		
		System.out.println(i);
		
		System.out.println("1부터 "+n+"까지의 합은 : " + sum);
		
	}
	
}
