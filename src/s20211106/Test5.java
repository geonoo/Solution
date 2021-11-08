package s20211106;

import java.util.Arrays;

public class Test5 {

	public static void main(String[] args) {
		
		int[][] s = solution(3, 3);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(Arrays.toString(s[i]));
		}
		
	}
	
	
	static public int[][] solution(int rows, int columns) {
        int[][] answer = new int[rows][columns];
        
        for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				answer[i][j] = 0;
			}
		}
        
        int w = 1;
        int r = 0;
        int c = 0;
        int rtn = 0;
        
        String p = "";
        String pp = "";
        
        boolean pb = false;
        boolean ppb = false;
        
        while (w < 1000000) {
        	if(r == 0 && c == 0 && p.length() == 0) {
        		pb = true;
        	}else if(r == 0 && c == 0 && p.length() > 0) {
        		ppb = true;
        		pb = false;
        	}
        	
        	if(pb) {
        		p += r+""+c;
        	}
        	
        	if(ppb) {
        		pp += r+""+c;
        	}
        	
        	answer[r][c] = w;
        	if(w % 2 == 0) {
        		if(r == (rows-1)) {
        			r = 0;
        		}else {
        			r++;
        		}
        	}else {
        		if(c == (columns-1)) {
        			c = 0;
        		}else {
        			c++;
        		}
        	}
        	
    		w++;
    		
        	for (int i = 0; i < answer.length; i++) {
        		if(Arrays.binarySearch(answer[i], 0) == -1) {
        			rtn++;
        		}
    		}
        	
        	if(rtn == 3) {
        		break;
        	}
        	
        	rtn = 0;
        	
        	if(p.equals(pp)) {
        		for (int i = 0; i < answer.length; i++) {
					for (int j = 0; j < answer[0].length; j++) {
						if(answer[i][j] != 0) 
						answer[i][j] -= p.length()/2;
					}
				}
        		break;
        	}
        	
		}
        
        return answer;
    }

}
