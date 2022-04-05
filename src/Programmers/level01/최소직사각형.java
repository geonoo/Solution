package Programmers.level01;

import java.util.Arrays;

public class 최소직사각형 {

	public static void main(String[] args) {
//		[[60, 50], [30, 70], [60, 30], [80, 40]]	4000
//		[[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]	
		int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
		
		System.out.println(solution3(sizes));
	}

    static public int solution3(int[][] sizes) {
        for (int i = 0; i < sizes.length ; i++) {
            if(sizes[i][0] < sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }

        int max0 = 0;
        int max1 = 0;
        for (int i = 0; i < sizes.length ; i++) {
            if(max0 < sizes[i][0])
                max0 = sizes[i][0];

            if(max1 < sizes[i][1])
                max1 = sizes[i][1];
        }

        return max0*max1;
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
	
	public int solution2(int[][] sizes) {
        int max = 0;
        int min = 0;
        for (int[] size : sizes) {
            int paramMax = Math.max(size[0], size[1]);
            int paramMin = Math.min(size[0], size[1]);

            if (paramMax > max) {
                max = paramMax;
            }

            if (paramMin > min) {
                min = paramMin;
            }
        }
        return max * min;
    }
	
}
