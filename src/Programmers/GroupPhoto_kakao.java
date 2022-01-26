package Programmers;

public class GroupPhoto_kakao {
	public static void main(String[] args) {
		
//		2	["N~F=0", "R~T>2"]	3648
//		2	["M~C<2", "C~M>1"]	0
		
		String[] data = {"N~F=0", "R~T>2"};
		
		System.out.println(solution(2, data));
	}
	
	// O O O O O O O O
	// 8 7 6 5 4 3 2 1
	
	// 2 1 8 7 6 5 4 3
	static public int solution(int n, String[] data) {
        int answer = 0;
        
        char[] f = {'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
        
        for (String s : data) {
			if(s.charAt(3) == '>') {
				
			}else if(s.charAt(3) == '<'){
				
			}else {
				
			}
		}
        
        return answer;
    }
}
