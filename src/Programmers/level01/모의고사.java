package Programmers.level01;

import java.util.Arrays;
import java.util.Map;

public class 모의고사 {
	
	public static void main(String[] args) throws Exception {
		int[] anwsers = {1,3,2,4,2};
		//int[] anwsers = {1,3,2,4,2};
		System.out.println(Arrays.toString(solution2(anwsers)));
		
	}

	static public int[] solution2(int[] answers) {
		int[] student1 = {1, 2, 3, 4, 5};
		int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int cnt1 = 0, cnt2 = 0, cnt3 = 0;

		for (int i = 0; i < answers.length; i++) {
			int t1 = i - ((i/student1.length)*student1.length);
			int t2 = i - ((i/student2.length)*student2.length);
			int t3 = i - ((i/student3.length)*student3.length);
			if(answers[i] == student1[t1]) cnt1++;
			if(answers[i] == student2[t2]) cnt2++;
			if(answers[i] == student3[t3]) cnt3++;
		}

		int max = Math.max(cnt1, Math.max(cnt2, cnt3));
		String a = "";
		if(max == cnt1) a += 1;
		if(max == cnt2) a += 2;
		if(max == cnt3) a += 3;

		String[] s = a.split("");
		int[] rtn = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			rtn[i] = Integer.parseInt(s[i]);
		}

		return rtn;
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
