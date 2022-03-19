package Programmers;

import java.util.Arrays;
import java.util.Comparator;

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
             
         for (int i=0; i<strings.length; i++)
             answer[i] = strings[i].charAt(n) + strings[i];
         
         Arrays.sort(answer);
         
         for (int i=0; i<answer.length; i++)
             answer[i] = answer[i].substring(1);
         
         return answer;
    }

    static public String[] solution2(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
                else return s1.charAt(n) - s2.charAt(n);
            }
        });
        return strings;
    }

}
	
