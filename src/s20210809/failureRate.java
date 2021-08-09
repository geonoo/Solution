package s20210809;

import java.util.ArrayList;
import java.util.Arrays;

public class failureRate {
		
    public static void main(String[] args) {
//    	5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
//		4	[4,4,4,4,4]	[4,1,2,3]
    	
    	int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
    	int[] rtn = solution(5, stages); 
    	for (int i = 0; i < rtn.length; i++) {
//			System.out.println(rtn[i]);
		}
    }
    
    static public int[] solution(int N, int[] stages) {
    	
    	Arrays.sort(stages);
    	
        int[] answer = new int[stages[stages.length-1]-1];
        ArrayList<Double> rat = new ArrayList<Double>();
        ArrayList<Integer> rank = new ArrayList<Integer>();
        
        for (int i = 0; i <N; i++) {
        	int st = 0;
        	int user = 0;
        	for (int j = 0; j < stages.length; j++) {
				if((i+1) <= stages[j]) {
					if((i+1) == stages[j]) {
						user++;
					}
					st++;
				}
			}
        	rat.add((double)user/(double)st);
        	rank.add(0);
        	System.out.println((double)user/(double)st);
        }
        
        
        
        return answer;
    }
	    
	    
}
	
