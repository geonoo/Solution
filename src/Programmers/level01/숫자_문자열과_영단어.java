package Programmers.level01;

public class 숫자_문자열과_영단어 {
	
	public static void main(String[] args) throws Exception {
		String s = "one4seveneight";
		
		System.out.println(solution(s));
		
		
	}
	
	
	
	 public static int solution(String s) {
	        
	        s = s.replaceAll("zero", "0").replaceAll("one", "1").replaceAll("two", "2").replaceAll("three", "3").replaceAll("four", "4")
	         .replaceAll("five", "5").replaceAll("six", "6").replaceAll("seven", "7").replaceAll("eight", "8").replaceAll("nine", "9");
	        
	        
	        return Integer.parseInt(s);
	    }
	
}
