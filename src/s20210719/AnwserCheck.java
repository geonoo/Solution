package s20210719;

import java.util.Arrays;

public class AnwserCheck {
	
	public static void main(String[] args) throws Exception {
		int[] anwsers = {1,2,3,4,5};
		//int[] anwsers = {1,3,2,4,2};
		
//		1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//		2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//		3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
		
		for(int i : solution(anwsers)) {
			System.out.println(i);
		}
		
		
	}
	
	
	
	 public static int[] solution(int[] answers) {
		 int[] student1 = {1, 2, 3, 4, 5};
		 int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
		 int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		 
		 int num1 = 0, num2 = 0, num3 = 0;
	     for(int i=0; i<answers.length; i++) {
	    	 int s1 = i - ((i/student1.length)*student1.length);
	    	 if(answers[i] == student1[s1]) {
	    		 num1++;
	    	 }
	    	 int s2 = i - ((i/student2.length)*student2.length);
	    	 if(answers[i] == student2[s2]) {
	    		 num2++;
	    	 }
	    	 int s3 = i - ((i/student3.length)*student3.length);
	    	 if(answers[i] == student3[s3]) {
	    		 num3++;
	    	 }
	     }
	     int[] rtn = {num1, num2, num3};
	     String spt = "";
	     int max = Arrays.stream(rtn).max().getAsInt();
	     for(int i=0; i<rtn.length;i++) {
	    	 if(max == rtn[i]) {
	    		 spt += (i+1)+"";
	    	 }
	     }
	     String ans[] = spt.split("");
	     int[] answer = new int[ans.length];
	     for(int i=0; i<ans.length; i++) {
	    	 answer[i] = Integer.parseInt(ans[i]);
	     }
	     
		 return answer;
	 }
	
}
