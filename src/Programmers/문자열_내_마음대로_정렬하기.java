package Programmers;

import java.util.Arrays;

public class 문자열_내_마음대로_정렬하기 {
	
	public static void main(String[] args) {
    	//"abce", "abcd", "cdx"
    	//2
    	String[] aa = {"abce", "abcd", "cdx"};
    	String[] rtn = solution(aa,2);
    	for (int i = 0; i < rtn.length; i++) {
			System.out.println(rtn[i]);
		}
    }
    
    static public String[] solution(String[] strings, int n) {
    	 String[] answer = new String[strings.length];
         
         String[] arr = new String[strings.length];
             
         for (int i=0; i<strings.length; i++) {
             arr[i] = strings[i].charAt(n) + strings[i];
         }
         
         Arrays.sort(arr);
         
         for (int i=0; i<arr.length; i++) {
             answer[i] = arr[i].substring(1);
         }
         
         return answer;
    }
	    
	    
}
	
