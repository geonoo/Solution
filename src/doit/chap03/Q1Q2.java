package doit.chap03;

import java.util.Scanner;

public class Q1Q2 {
	
	static int seqSearchSen_one(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key;
		
//		while (true) {
//			if(a[i] == key)
//			break;
//			
//			i++;
//		}
		
		for (i = 0; i <n; i++) {
			if(a[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key;
		
		System.out.print("   |");
		for (int j = 0; j < a.length-1; j++) {
			System.out.print(" "+j+" ");
		}
		System.out.println();
		System.out.println("---+----------------------");
		
		String b = "";
		for (i = 0; i <n; i++) {
			System.out.println("   |"+b+" *");
			System.out.print("  "+i+"|");
			for (int j = 0; j < a.length-1; j++) {
				System.out.print(" "+a[j]+" ");
			}
			System.out.println();
			b += "   ";
			if(a[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int ky = stdIn.nextInt();
		
		int idx = seqSearchSen(x, num, ky);
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			System.out.println(ky+"는 x["+idx+"]에 있습니당");
		}
		
	}

}
