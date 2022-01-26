package doit.chap02;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,4},{5,6,7}};
		int[][] b = a.clone();
		
		
		//복사가 아닌 참
		for (int i = 0; i < b.length; i++) {
			System.out.println(Arrays.toString(b[i]));
		}
		
	}

}
