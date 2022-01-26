package Programmers;

import java.util.*;

public class failureRate {
		
    public static void main(String[] args) {
//    	5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
//		4	[4,4,4,4,4]	[4,1,2,3]
    	
    	int[] stages = {1,2,3,2,2,1,3,2};
    	System.out.println(Arrays.toString(solution(8, stages))); 
    }
    
    static public int[] solution(int N, int[] stages) {
    	
        int[] answer = new int[N];
        Map<Integer,Double> map = new HashMap<>();

        for (int i = 0; i <N; i++) {
        	double user = 0;
        	double stage = 0;
        	for (int j = 0; j < stages.length; j++) {
        		if((i+1) <= stages[j]) {
        			stage++;
        		}
        		if( (i+1) == stages[j]) {
        			user++;
        		}
			}
        	
        	if(user == 0 && stage == 0) stage = 1;
        	
        	map.put(i+1, user/stage);
        }
        
        for (int i = 0; i < N; i++) {
        	double max = -1;
            int maxKey = 0;
            for(Integer key : map.keySet()) {
                if(max < map.get(key)) {
                    max = map.get(key);
                    maxKey = key;
                }
            }
            answer[i] = maxKey;
            map.remove(maxKey);
        }

        
        return answer;
    }
	    
	    
}
	
