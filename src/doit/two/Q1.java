package doit.two;

import java.util.Arrays;
import java.util.Random;

public class Q1 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("키의 최댓값을 구합니다.");
		
		int num = rand.nextInt(10) + 1;
		
		System.out.println("사람 수 : "+num);
		
		int[] height = new int[num];
		
		System.out.println("키 값은 아래와 같습니다.");
		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height["+i+"] : " + height[i]);
		}
		
		Arrays.sort(height);
		
		System.out.println("최댓값은 : " + height[height.length-1]);
	}
	

}
