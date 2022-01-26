package Programmers;

public class NoneNumPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static public int solution(int[] numbers) {
        
		int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
			temp += numbers[i];
		}
        
        return 45-temp;
    }

}
