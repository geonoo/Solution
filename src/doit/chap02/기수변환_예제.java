package doit.chap02;

public class 기수변환_예제 {

	public static void main(String[] args) {
		
	}
	
	static int CardConvR(int x, int r, char[] d){
		
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		}while(x != 0);
		return digits;
	}

}
