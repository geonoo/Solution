package doit.chap06;

import java.util.Scanner;

public class BubbleSortQ4 {
	
	static int totalChange = 0;
	static int totalCheck = 0;
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubbleSort(int[] a, int n) {
		int k = 0;
		int j = 1;
		while (k < n - 1) {
			int last = n - 1;
			System.out.println("패스" + (j) + ":");
			for (int i = n-1; i > k; i--) {
				totalCheck++;
				if(a[i-1] > a[i]) {
					printBubble(a, "+", i-1);
					totalChange++;
					swap(a, i-1, i);
					last = i;
				}else {
					printBubble(a, "-", i-1);
				}
			}
			k = last;
			j++;
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
	}
	
	static void printBubble(int[] a, String b, int idx) {
		for (int i = 0; i < a.length; i++) {
			if(idx == i) {
				System.out.print(a[i] + b);
			}else {
				System.out.print(a[i] + " ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("버블 정렬(버전 3)");
		System.out.print("요솟수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		bubbleSort(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다.");
		System.out.println("비교를 "+totalCheck+"회 했습니다.");
		System.out.println("교환을 "+totalChange+"회 했습니다.");
	}
}
