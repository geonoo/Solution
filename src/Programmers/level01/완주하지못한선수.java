package Programmers.level01;

import java.util.Arrays;

public class 완주하지못한선수 {
	
	public static void main(String[] args) throws Exception {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		System.out.println(solution(participant, completion));
		
	}
	
	
	 public static String solution(String[] participant, String[] completion) {
		 Arrays.sort(participant);
		 Arrays.sort(completion);
		 
		 for(int i=0; i<completion.length; i++) {
			 if(!completion[i].equals(participant[i])) {
				 return participant[i];
			 }
		 }
		 
		 return participant[participant.length-1];
	 }
	
}
