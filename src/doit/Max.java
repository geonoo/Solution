package doit;

import java.util.Arrays;
import java.util.Collections;

public class Max {
	public static void main(String[] agrs) {
		
		
	}
	
	static int max4(int a, int b, int c, int d) {
		
		int max = a;
		
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max;
	}
	
	static int max4Two(int a, int b, int c, int d) {
		
		int[] arr = new int[4];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		arr[3] = d;
		
		Arrays.sort(arr);
		
		return arr[0];
	}
	
	
	static int min3(int a, int b, int c) {
		
		Integer[] arr = new Integer[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
		Arrays.sort(arr,Collections.reverseOrder());
		
		return arr[0];
	}

	
}
