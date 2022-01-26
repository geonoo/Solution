package doit.chap02;

import java.util.Arrays;

public class Q4 {
	
	static int[] a = {1,2,3,4,5};
	static int[] b = new int[a.length];
	
	public static void main(String[] args) {
		
//		copy(a, b);
		rCopy(a, b);
		
	}
	
	static void copy(int[] a, int[] b) {
		b = a.clone();
		
		System.out.println(Arrays.toString(b));
	}
	
	static void rCopy(int[] a, int[] b) {
		for (int i = b.length-1; i >= 0; i--) {
			b[b.length-1-i] = a[i];
		}
		
		System.out.println(Arrays.toString(b));
		
	}
	
}
