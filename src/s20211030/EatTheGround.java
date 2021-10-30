package s20211030;

import java.util.Arrays;

public class EatTheGround {

	public static void main(String[] args) {
		
		int [][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		int [][] land2 = {{5,6,7,8},{1,2,3,5},{4,3,2,1}};
		
		
		System.out.println(solution(land2));
	}
	
	static int solution(int[][] land) {
        for (int i = 1; i < land.length; i++) {
        	land[i][0] += Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3]));
        	land[i][1] += Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3]));
        	land[i][2] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][3]));
        	land[i][3] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][2]));
		}
        
        Arrays.sort(land[land.length-1]);
        
        return land[land.length-1][3];
    }
	
	static int solution2(int[][] land) {
        int answer = 0;
        int max = 0;
        int maxIdx = 0;
        int tempIdx = 0;
        for (int i = 0; i < land.length; i++) {
        	max = land[i][0];
			for (int j = 0; j < land[i].length; j++) {
				if(max < land[i][j]) {
					if(maxIdx == j) { 
						continue;
					}
					max = land[i][j];
					tempIdx = j;
				}
			}
			answer += max;
			maxIdx = tempIdx;
		}
        
        return answer;
    }

}
