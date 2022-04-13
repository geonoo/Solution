package Programmers.level01;

import java.util.*;

public class 실패율 {
		
    public static void main(String[] args) {
//    	5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
//		4	[4,4,4,4,4]	[4,1,2,3]
    	
    	int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
    	System.out.println(Arrays.toString(solution2(5, stages)));
    }
    
    //N : 스테이지 개수
    //stages : 현재 멈춰있는 스테이지를 담은 배열
    static public int[] solution2(int N, int[] stages) {

        Map<Integer, Double> map = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            double total = 0;
            double fail = 0;
            for (int j = 0; j < stages.length; j++) {
                if(i <= stages[j]) total++;
                if(i == stages[j]) fail++;
            }
            if(total == 0 && fail == 0) total = 1;
            map.put(i, fail/total);
        }

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            double max = -1;
            int rKey = 0;
            for (int key : map.keySet()){
                if(max < map.get(key)){
                    max = map.get(key);
                    rKey = key;
                }
            }
            answer[i] = rKey;
            map.remove(rKey);
        }

        return answer;
    }


    static public int[] solution(int N, int[] stages) {
    	
        int[] answer = new int[N];
        Map<Integer,Double> map = new HashMap<>();

        for (int i = 0; i <N; i++) {
        	double user = 0;
        	double stage = 0;
        	for (int j = 0; j < stages.length; j++) {
        		//스테이지에 도달한 수 
        		if((i+1) <= stages[j]) {
        			stage++;
        		}
        		//스테이지에 도달했으나 아직 클리어 못한  
        		if( (i+1) == stages[j]) {
        			user++;
        		}
			}
        	
        	//스태이지가 1만 있을 경우 
        	if(user == 0 && stage == 0) stage = 1;
        	
        	map.put(i+1, user/stage);
        }
        
        for (int i = 0; i < N; i++) {
        	double max = -1;
            int maxKey = 0;
            for(Integer key : map.keySet()) {
            	//실패율이 가장 높은 스테이지 찾기 
                if(max < map.get(key)) {
                    max = map.get(key);
                    maxKey = key;
                }
            }
            //가장 내림차순이 될 수 있게 
            answer[i] = maxKey;
            map.remove(maxKey);
        }

        
        return answer;
    }
	    
	    
}
	
