package s20211104;

public class NextBigNumber {
	public static void main(String[] args) {
		
		
		System.out.println(solution(78));
	}
	
	static public int solution(int n) {
        int answer = 0;
        
        String a = Integer.toBinaryString(n);
        int cnt = oneCnt(a);
        
        
        for (int i = n+1; i < 1000001 ; i++) {
			if(cnt == oneCnt(Integer.toBinaryString(i))) {
				answer = i;
				break;
			}
		}
        
        return answer;
    }
	
	static int oneCnt(String a) {
		int cnt = 0;
		for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == '1') {
				cnt++;
			}
		}
		return cnt;
	}
}
