package Programmers.level01;

import java.util.Arrays;

public class 서울에서_김서방_찾기 {
		
    public static void main(String[] args) {
    	String[] ss = {"Jane", "Kim", "Apple"};
    	System.out.println(solution2(ss));
    }
    
    static public String solution(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				return "김서방은 "+i+"에 있다";
			}
		}
        
        return null;
    }

    static public String solution2(String[] seoul) {

        return "김서방은 "+Arrays.asList(seoul).indexOf("Kim")+"에 있다.";
    }
	    
	    
}
	
