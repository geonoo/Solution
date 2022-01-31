package doit.chap06;

import java.util.Scanner;

public class BubbleSortQ2 {
	
	static int totalChange = 0;
	static int totalCheck = 0;
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n-1; i++) {
			System.out.println("패스" + (i+1) + ":");
			for (int j = n-1; j > i; j--) {
				totalCheck++;
				if(a[j-1] > a[j]) {
					printBubble(a, "+", j-1);
					totalChange++;
					swap(a, j-1, j);
				}else {
					printBubble(a, "-", j-1);
				}
			}
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j] + " ");
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
		
		System.out.println("버블 정렬(버전 1)");
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
