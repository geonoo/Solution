package doit.chap06;

import java.util.Scanner;

public class QuickSort {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}
	
	static void quickSort(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(pl + pr) / 2];
		
		do {
			while (a[pl] < x) pl++;
			while (a[pr] > x) pr--;
			if(pl <= pr)
				swap(a, pl++, pr--);
		}while(pl <= pr);
		
		if(left < pr) quickSort(a, left, pr);
		if(pl < right) quickSort(a, pl, right);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("퀵정");
		System.out.print("요솟수：");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		quickSort(x, 0, nx-1); // 배열 x를 단순선택정렬
		System.out.println("오름차순 정렬 ok");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}

}
