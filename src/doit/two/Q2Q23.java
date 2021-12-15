package doit.two;

public class Q2Q23 {
	static int[] arr = {5, 10, 73, 2, -5, 42};
	
	public static void main(String[] args) {
		
		System.out.println("합계 : " + sumOf(arr));
		
		printArr(arr);
		
		for (int i = 0; i < arr.length/2; i++) {
			System.out.println("a["+i+"]과(와) a["+(arr.length-(1+i))+"]를 교환합니다.");
			swap(arr, i, (arr.length-1-i));
			printArr(arr);
		}
		
	}
	
	static void printArr(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static int sumOf(int[] a) {
		int rtn = 0;
		
		for (int i = 0; i < a.length; i++) {
			rtn += a[i];
		}
		return rtn;
	}
	
}
