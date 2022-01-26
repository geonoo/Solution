package Programmers;

import java.util.*;

public class 더_맵게 {

	public static void main(String[] args) {
		
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int k = 7;
		//2
		System.out.println(solution(scoville, k));
	}
	//섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
	static public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
			q.offer(scoville[i]);
		}
        while (q.peek() <= K) {
			if(q.size() == 1) {
				return -1;
			}
        	int a = q.poll();
        	int b = q.poll();
        	
        	q.offer(a+(b*2));
        	
        	answer++;
        	
		}
        
        return answer;
    }

}
