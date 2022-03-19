package Programmers.level01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class 문자열_내림차순으로_배치하기 {
		
    public static void main(String[] args) {
    	System.out.println(solution2("AabCqfgqgg"));
    }
//    qqgggfbaCA
//    ggqqfqCbaA
    static public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        for (String ss : arr) {
			answer += ss;
		}
        
        return answer;
    }

    static public String solution2(String s) {
        String[] arr = s.split("");
        Arrays.sort(arr, Comparator.reverseOrder());

        return ArrayToString(arr);
    }

    public static String ArrayToString(Object[] a) {
        if (a == null)
            return "null";

        int iMax = a.length - 1;
        if (iMax == -1)
            return "";

        StringBuilder b = new StringBuilder();
        for (int i = 0; ; i++) {
            b.append(String.valueOf(a[i]));
            if (i == iMax)
                return b.toString();
        }
    }
	    
}
	
