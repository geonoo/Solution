package doit.chap05;
import java.util.Scanner;
// 메소드 recur3의 비재귀적구현

class Recur3_05_05 {
	// 메소드 recur의 비재귀적 구현
	static void recur3(int n) {
		int[] nstk = new int[100];
		int[] sstk = new int[100];
		int ptr = -1;
		int sw = 0;
		//3
		while (true) {
			if (n > 0) {
				ptr++;//0 1 2
				nstk[ptr] = n; //0:3, 1:2, 2:1
				sstk[ptr] = sw; //0:0 0:0 0:0
				if (sw == 0)
					n = n - 1; //n=0
				else if (sw == 1) {
					n = n - 2;
					sw = 0;
				}
				continue;
			}
			do {
				n = nstk[ptr]; // 2:1, 1:2, 0:3
				sw = sstk[ptr] + 1; // 2:1 1:1 0:1
				--ptr;
				if (sw == 2) {
					System.out.println(n);
					if (ptr < 0)
						return;
				}
			} while (sw == 2);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수를 입력하세요.：");
		int x = stdIn.nextInt();

		recur3(x);
	}
}