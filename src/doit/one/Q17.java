package doit.one;

public class Q17 {

	public static void main(String[] args) {
		nspira(4);
	}
	
	static void nspira(int n) {
		for (int i = 1; i <=n; i++) {
			String star = "";
			String blank = "";
			for (int j = 1; j <= i; j++) {
				star += i;
			}
			for (int j = i; j > 1; j--) {
				star += i;
			}
			for (int j = i; j < n+1; j++) {
				blank += " ";
			}
			System.out.println(blank+star);
		}
	}
}
