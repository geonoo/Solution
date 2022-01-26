package Programmers;

import java.util.Arrays;

public class BusinessCardSize {

	public static void main(String[] args) {
//		[[60, 50], [30, 70], [60, 30], [80, 40]]	4000
//		[[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]	
		int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
		
		System.out.println(solution(sizes));
	}
	
	static public int solution(int[][] sizes) {
        
        for (int i = 0; i < sizes.length; i++) {
        	Arrays.sort(sizes[i]);
		}
        
        int rMax = 0;
        int cMax = 0;
        for (int i = 0; i < sizes.length; i++) {
			rMax = Math.max(rMax, sizes[i][0]);
			cMax = Math.max(cMax, sizes[i][1]);
		}
        
        return rMax*cMax;
    }
	
}
