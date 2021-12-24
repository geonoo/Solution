package doit.c_three;

import java.util.Scanner;

public class Q5 {

static int binSearchX(int[] a, int n, int key) {
		
		int pl = 0; // 검색 범위의 첫 인덱스
		int pr = n - 1; // 검색 범위의 끝 인덱스
		
		do {
			int pc = (pl + pr) / 2;
			if(a[pc] == key) {
				if(pc != 0) {
					while (pc > 0) {
						--pc;
						if(a[pc] == key) {
							continue;
						}else {
							return ++pc;
						}
					}
				}
				return pc;
			}else if(a[pc] < key)
				pl = pc+1;
			else pr = pc -1;
		} while (pl <= pr);
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		
		
		System.out.print("x[0] : ");
		x[0] = stdIn.nextInt();
		
		
		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x["+i+"] : ");
				x[i] = stdIn.nextInt();
			} while (x[i] < x[i - 1]);
		}
		
		System.out.print("검색할 값(같은 값일때, 제일 앞에있는 요소) : ");
		int ky = stdIn.nextInt();
		
		int idx = binSearchX(x, num, ky);
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			System.out.println(ky+"는 x["+idx+"]에 있습니닷");
		}
		
		System.out.println(BinSearch.binSearch(x, num, ky));
	}

}
