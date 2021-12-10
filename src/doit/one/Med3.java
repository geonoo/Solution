package doit.one;

import java.util.*;

public class Med3 {

	public static void main(String[] args) {
		System.out.println(med3(1,3,2));
	}
	
	static int med3(int a, int b, int c) {
		
		int[] arr = {a, b, c};
		
		Arrays.sort(arr);
		
		
		return arr[1];
	}

}
