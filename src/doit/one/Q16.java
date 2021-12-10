package doit.one;

public class Q16 {

	public static void main(String[] args) {
		spira(4);
	}
	
	static void spira(int n) {
		for (int i = 1; i <=n; i++) {
			String star = "";
			String blank = "";
			for (int j = 1; j <= i; j++) {
				star += "*";
			}
			for (int j = i; j > 1; j--) {
				star += "*";
			}
			for (int j = i; j < n+1; j++) {
				blank += " ";
			}
			System.out.println(blank+star);
		}
	}

}
