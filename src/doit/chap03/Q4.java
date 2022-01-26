package doit.chap03;

public class Q4 {
	
	
	static int binSearch(int[] a, int n, int key) {
		
		int pl = 0; // 검색 범위의 첫 인덱스
		int pr = n - 1; // 검색 범위의 끝 인덱스
		String b = "";
		for (int i = 0; i < a.length/2; i++) {
			b += "  ";
		}
		String c = " ";
		for (int i = 0; i < a.length; i++) {
			c += a[i]+"  ";
		}
		System.out.println("   | <- "+b+"+"+b+" ->");
		do {
			int pc = (pl + pr) / 2;
			
			System.out.println("  "+pc+"|"+c);
			
			if(a[pc] == key) {
				return pc;
			}else if(a[pc] < key) {
				System.out.println("   |");
				System.out.println("   | <- "+b+"+"+b+" ->");
				pl = pc+1;
			}else {
				b = b.substring(0,1);
				System.out.println("   |");
				System.out.println("   | <-"+b+"+"+b+"->");
				pr = pc -1;
			}
		} while (pl <= pr);
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,5,6,8,9};
		
		System.out.print("   | ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(i+"  ");
		}
		System.out.println("\n---+-----------------------");
		
		System.out.println("\n2는 x["+binSearch(a, 7, 2)+"]에 있습니다.");
		
	}

}
