package s20211220;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 기능개발 {

	public static void main(String[] args) {
//		[93, 30, 55]	[1, 30, 5]	[2, 1]
//		[95, 90, 99, 99, 80, 99]	[1, 1, 1, 1, 1, 1]	[1, 3, 2]
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		System.out.println(Arrays.toString(solution(progresses, speeds)));
		
	}
	
	static public int[] solution(int[] progresses, int[] speeds) {
		
		List<Integer> answer = new ArrayList<Integer>();
		
        Queue<Integer> progressQ = new LinkedList<Integer>();
        Queue<Integer> speedsQ = new LinkedList<Integer>();
        
        for (int i = 0; i < progresses.length; i++) {
			progressQ.add(progresses[i]);
			speedsQ.add(speeds[i]);
		}
        
        while (!progressQ.isEmpty()) {
			boolean deploy = false;
			int cnt = 0;
        	for (int i = 0; i < progressQ.size(); i++) {
        		if(i == 0 && progressQ.peek() >= 100) {
        			deploy = true;
        			cnt++;
        			progressQ.poll();
        			speedsQ.poll();
        		}
        		if(progressQ.peek() != null && deploy && progressQ.peek() >= 100) {
        			cnt++;
        			progressQ.poll();
        			speedsQ.poll();
        		}else {
        			break;
        		}
			}
        	
        	if(cnt > 0) {
        		answer.add(cnt);
        	}
        	
        	if(progressQ.size() > 0) {
        		for (int i = 0; i < progressQ.size(); i++) {
        			progressQ.add(progressQ.poll()+speedsQ.peek());
        			speedsQ.add(speedsQ.poll());
				}
        	}
        	
		}
        
        int[] rtn = new int[answer.size()];
        for (int i = 0; i < rtn.length; i++) {
			rtn[i] = answer.get(i);
		}
        
        return rtn;
    }

}
