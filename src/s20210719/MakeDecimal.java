package s20210719;

import java.util.ArrayList;

//다시풀어보기
public class MakeDecimal {
	
	public static void main(String[] args) throws Exception {
		
		//1
		//int[] nums = {1,2,3,4};
		
		//4
		int[] nums = {1,2,7,6,4};
			
		
		System.out.println("답 : "+solution(nums) + "");
		
	}
	
	 public static int solution(int[] nums) {
	        int answer = 0;
	        
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        
	        for(int i =0; i<nums.length;i++) {
	        	if(i+2 > nums.length) break;
	        	for (int j = i+1; j < nums.length; j++) {
					for (int k = j+1; k < nums.length; k++) {
						list.add(nums[i] + nums[j] + nums[k]);
					}
				}
	        }
	        
	        for(int i=0; i<list.size();i++) {
	        	int cnt = 2;
	        	answer++;
	        	while (list.get(i) > cnt) {
	        		if(list.get(i) % cnt == 0) {
	        			answer--;
	        			break;
	        		}
	        		cnt++;
				}
	        }
	        
	        return answer;
	    }
	
}
