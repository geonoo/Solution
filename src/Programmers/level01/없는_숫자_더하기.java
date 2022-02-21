package Programmers.level01;

public class 없는_숫자_더하기 {

	public static void main(String[] args) {
//		[1,2,3,4,6,7,8,0]	14
		int[] numbers = {1,2,3,4,6,7,8,0};
		
		System.out.println(solution(numbers));
	}
	
	static public int solution(int[] numbers) {
        
		int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
			temp += numbers[i];
		}
        
        return 45-temp;
    }

}
