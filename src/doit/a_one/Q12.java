package doit.a_one;

public class Q12 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if(i == 1 ) System.out.print("   |");
			System.out.print(i+ " ");
		}
		System.out.println();
		for (int i = 0; i < 17; i++) {
			if(i == 0)System.out.print("---+");
			System.out.print("-");
		}
		System.out.println();
		for (int i = 1; i < 10; i++) {
			System.out.print(" "+i+" |");
			for (int j = 1; j < 10; j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
	}

}
