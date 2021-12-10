package doit.one;

import java.util.Scanner;

public class exFor {

	public static void main(String[] args) {
		
//		Scanner s = new Scanner(System.in);
//		
//		System.out.println("1부터 n까지 합을 구합니다.");
//		System.out.println("n의 값 : ");
//		
//		int n = s.nextInt();
//		
//		int sum = 0;
//		String a = "";
//		for (int i = 1; i <= n; i++) {
//			sum += i;
//			a += (i != n) ? i+"+" : i+"="+sum;
//		}
//		
//		System.out.println(a);
		
//		System.out.println(gaoos(9));
		
		System.out.println(compareSum(4, 4));
		
	}
	
	
	static int gaoos(int a) {
		
		int x = a / 2;
		
		if(a % 2 == 0) {
			return (1+a)*x;
		}else {
			return (1+a)*x+(x+1);
		}
	}
	
	
	static int compareSum(int a, int b) {
		
		int sum = 0;
		
		if(a > b) {
			for (int i = b; i <= a; i++) {
				sum += i;
			}
		}else if(b > a){
			for (int i = a; i <=b; i++) {
				sum += i;
			}
		}else {
			sum = a;
		}
		
		return sum;
	}
	
}
