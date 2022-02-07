package doit.chap06;

import java.util.Scanner;

public class ShellsortQ9 {
	
	static int cntX = 0;
	static int cntY = 0;
	
	static void shellSort(int[] a, int n) {
		for (int h = n / 2; h > 0; h /= 2) {
			for (int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
				for (j = i-h; j >= 0 && a[j] > tmp; j -= h) {
					a[j + h] = a[j];
					cntX++;
				}
				a[j+h] = tmp;
				cntX++;
			}
		}
	}
	
	static void shellSort2(int[] a, int n) {
		int h;
		for (h=1; h<n/9; h = h*3+1)
			;
		
		for(; h > 0; h/=3)
			for (int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
				for (j = i-h; j >= 0 && a[j] > tmp; j-=h) {
					a[j + h] = a[j];
					cntY++;
				}
				a[j+h] = tmp;
				cntY++;
			}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("셸 정렬(버전 1~2)");
		System.out.print("요솟수：");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		int[] y = new int[nx];
		
		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}
		y = x;

		shellSort(x, nx);
		System.out.println("1번 shellSort 이동 횟수 : " + cntX);
		shellSort2(y, nx);
		System.out.println("2번 shellSort 이동 횟수 : " + cntY);
	}
}