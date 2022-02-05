package doit.chap06;
import java.util.Scanner;

import doit.chap04.IntStack;

class QuickSortVerboseQ12 {
	// 배열의 요소 a[idx1]과 a[idx2]를 교환
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 퀵정렬(비재귀버전)
	static void quickSort(int[] a, int left, int right) {
		IntStack lstack = new IntStack(right - left + 1);
		IntStack rstack = new IntStack(right - left + 1);

		while (lstack.isEmpty() != true) {
			int pl = left = lstack.pop(); // 왼쪽 커서
			int pr = right = rstack.pop(); // 오른쪽 커서
			int x = a[(left + right) / 2]; // 피벗은 중앙의 요소

			do {
				while (a[pl] < x)
					pl++;
				while (a[pr] > x)
					pr--;
				if (pl <= pr)
					swap(a, pl++, pr--);
			} while (pl <= pr);

			if (left < pr) {
				lstack.push(left); // 머리쪽 그룹의 범위
				rstack.push(pr); // (index)를 푸시
			}
			if (pl < right) {
				lstack.push(pl); // 꼬리쪽그룹의 범위
				rstack.push(right); // (index)를 푸시
			}
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("퀵정렬 ");
		System.out.print("요솟수：");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		quickSort(x, 0, nx - 1); // 배열 x를 퀵정렬

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "] = " + x[i]);
	}
}