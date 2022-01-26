package Programmers;

import java.util.*;

public class 다리를지나는트럭_level2 {

	public static void main(String[] args) {
		
//		2	10	[7,4,5,6]	8
//		100	100	[10]	101
//		100	100	[10,10,10,10,10,10,10,10,10,10]	110
		
		int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
		
		System.out.println(solution(100, 100, truck_weights));
		
		
	}
	static public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> q = new LinkedList<>();
        int sum = 0;
        int time = 0;
        for (int i = 0; i < truck_weights.length; i++) {
			int truck = truck_weights[i];
			
			while (true) {
				if(q.isEmpty()) {
					q.add(truck);
					sum += truck;
					time++;
					break;
				}else if(q.size() == bridge_length) {
					sum -= q.poll();
				}else {
					if(sum + truck <= weight) {
						q.add(truck);
						sum += truck;
						time++;
						break;
					}else {
						q.add(0);
						time++;
					}
				}
			}
			
		}
        
        
        return time + bridge_length;
    }
}
