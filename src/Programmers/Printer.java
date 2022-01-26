package Programmers;

import java.util.*;

public class Printer {

	public static void main(String[] args) {
//		[2, 1, 3, 2]	2	1
//		[1, 1, 9, 1, 1, 1]	0	5
		
		int[] priorities = {1,1,1,1,1,1,9,2};
		
		System.out.println(solution(priorities, 7));
		
	}
	
	static public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Integer> base = new LinkedList<Integer>();
        Queue<Integer> compare = new LinkedList<Integer>();
        List<String> name = new ArrayList<>();
        Queue<String> qName = new LinkedList<String>();
        
        for (int i = 0; i < priorities.length; i++) {
        	base.offer(priorities[i]);
        	compare.offer(priorities[i]);
        	name.add((char)'A'+i+"");
        	qName.offer((char)'A'+i+"");
		}
        while (!base.isEmpty()) {
        	int max = base.peek();
        	for (int j = 0; j < compare.size(); j++) {
        		int comparePoll = compare.poll();
        		max = Math.max(max, comparePoll);
        		compare.offer(comparePoll);
			}
        	
        	if(max == base.peek()) {
        		base.poll();
        		compare.poll();
        		answer++;
        		if(name.get(location).equals(qName.poll())) {
        			return answer;
        		}
        	}else {
        		base.offer(base.poll());
        		compare.offer(compare.poll());
        		qName.offer(qName.poll());
        	}
		}
        return answer;
    }
	
	public int solution2(int[] priorities, int location) {
        int answer = 0;

        Queue<Integer> que = new LinkedList<>();

        for(int pri : priorities){
            que.add(pri);
        }

        Arrays.sort(priorities); //우선순위를 비교하기 위해 오름 차순 정렬
        int length = priorities.length-1; //오름차순 한 마지막 요소가 가장 큰 수 

        while(!que.isEmpty()){
            int current = que.poll();

            //우선순위가 가장 높은 수 == 현재 큐에 담긴 (프린트 순서)가 같으면
            if(current == priorities[length - answer]){
                answer++;
                location--;
                if(location<0){
                    break;
                }
            }else{
                //처음에 que.poll을 했던 수를 add 함으로써 맨 뒤로 밀림
                que.add(current);
                location--; // 1
                if(location<0){
                    location = que.size()-1;
                }
            }
        }
        return answer;
    }
	
}
