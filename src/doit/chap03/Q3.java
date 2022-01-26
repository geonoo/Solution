package doit.chap03;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int ky = stdIn.nextInt();
		
		int[] idx = sameKey(x, num, ky);
		
		System.out.println("같은 키의 개수 : " + idx.length );
		
	}
	
	static int[] sameKey(int[] x, int num, int ky) {
		
		int rtn = 0;
		String r = "";
		
		for (int i = 0; i < x.length; i++) {
			if(ky == x[i]) {
				r += i+"";
				rtn++;
			}
		}
		
		int[] arr = new int[rtn];
		for (int i = 0; i < rtn; i++) {
			arr[i] = Integer.parseInt(r.charAt(i)+"");
		}
		
		return arr;
	}

}
