package Programmers.level01;

import java.util.ArrayList;

public class 다트_게임 {
		
    public static void main(String[] args) {
    	//S 일승, D 이승, T 삼승
    	//0~9
    	//*(i-1, i), #(i)
    	
//    	1	1S2D*3T		37	1일승 * 2 + 2이승 * 2 + 3삼승 
//    	2	1D2S#10S 	9	1이승 + 2일승 * (-1) + 10일승
//    	3	1D2S0T		3	1이승 + 2일승 + 0삼승
//    	4	1S*2T*3S	23	1일승 * 2 * 2 + 2삼승 * 2 + 3일승
//    	5	1D#2S*3S	5	1이승 * (-1) * 2 + 2일승 * 2 + 3일승
//    	6	1T2D3D#		-4	1삼승 + 2이승 + 3더블 * (-1)
//    	7	1D2S3T*		59	1이승 + 2일승 * 2 + 3삼승 * 2
    	System.out.println(solution("1D2S3T*"));
    	
    }
    
    static public int solution(String dartResult) {
        int answer = 0;
        
        dartResult = dartResult.replaceAll("10", "Z");
        
        String[] score = dartResult.split("");
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < score.length; i++) {
        	if(score[i].equals("Z")) score[i] = "10";
        		
        	if(NumberCheck(score[i])) {
        		list.add(pow(score[i], score[i+1]));
        	}
        	if(score[i].equals("*")) {
        		if(i == 2) {
        			list.set(0, list.get(0)*2);
        		}else {
        			list.set(list.size()-1, list.get(list.size()-1)*2);
        			list.set(list.size()-2, list.get(list.size()-2)*2);
        		}
        	}
        	if(score[i].equals("#")) {
        		list.set(list.size()-1, list.get(list.size()-1)*-1);
        	}
		}
        
        for(int l : list) {
        	answer += l;
        }
        
        return answer;
    }
    
    static int pow(String a, String s) {
    	switch (s) {
		case "S": return (int) Math.pow(Integer.parseInt(a), 1); 
		case "D": return (int) Math.pow(Integer.parseInt(a), 2); 
		case "T": return (int) Math.pow(Integer.parseInt(a), 3);
		default: return 0;
		}
    }
    
    static boolean NumberCheck(String s) {
    	try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
    }
	    
	    
}
	
