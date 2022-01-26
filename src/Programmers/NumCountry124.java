package Programmers;

public class NumCountry124 {
	public static void main(String[] args) {
//		1	1	1	1
//		2	2	2	2
//		3	4	3	10
//		4	11	10	11
//		5	12	11	12
//		6	14	12	20
//		7	21	13	21
//		8	22	20	22
//		9	24  21	100
//		10	41	22	101
		
		System.out.println(solution(4));
	}
	
	static public String solution(int n) {
        String answer = "";
        
        answer = conv(n);
        
        return answer;
    }
	
	static public String conv(int n) {
		
		String ans = "";
		
		while (n > 0) {
			if(n % 4 == 3) {
				ans = 4 + ans;
			}else {
				ans = (n % 4) + ans;
			}
			
			n /= 4;
		}
		
		return ans;
	}
}
