package Programmers.level01;

import java.util.ArrayList;
import java.util.Collections;

public class K번쨰수 {
	
	public static void main(String[] args) throws Exception {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		
		int[] answer = solution(array, commands);
		for(int i=0;i<answer.length;i++) {
			System.out.println("answer : "+answer[i]);
		}
		
	}
	
	
	 public static int[] solution(int[] array, int[][] commands) {
		 int[] answer = new int[commands.length];
		 
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 int j = 0; 
		 
		 for(int[] c : commands) {
			 if(c.length == 3) {
				 list = new ArrayList<Integer>();
				 for(int i=(c[0]-1); i<c[1]; i++) {
					 list.add(array[i]);
				 }
				 
				 Collections.sort(list);
				 
				 answer[j] = list.get(c[2]-1);
			 }
			 j++;
		 }
		 
		 return answer;
		 
		 
	 }
	
}
