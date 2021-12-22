package doit.a_one;

public class Q15 {

	public static void main(String[] args) {
		trianglelB(3);
	}
	
	static void trianglelB(int n) {
		
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void trianglelU(int n) {
		
		for (int i = n; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void trianglelRU(int n) {
		String a = "";
		String b = "";
		for (int i = n; i > 0; i--) {
			a = "";
			for (int j = i; j > 0; j--) {
				a += "*";
			}
			a = b+a;
			System.out.print(a);
			b += " ";
			System.out.println();
			
		}
	}
	
	static void trianglelRB(int n) {
		for (int i = 1; i <= n; i++) {
			String star = "";
			for (int j = 1; j <= i; j++) {
				star += "*";
			}
			String blank = "";
			for(int j=0; j<(n-i);j++) {
				blank += " ";
			}
			System.out.print(blank+star);
			System.out.println();
			
		}
	}
	
}
