package Programmers.level01;

import java.util.ArrayList;
import java.util.HashSet;

public class 폰켓몬 {
	
	public static void main(String[] args) throws Exception {
		int[] nums = {3,3,3,2,2,4};
		//int[] nums = {3,3,3,2,2,2};
		//int[] nums = {3, 1, 2, 3};
		
		System.out.println("answer : " + solution2(nums));
		
	}

	static public int solution2(int[] nums) {
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < nums.length ; i++)
			hs.add(nums[i]);

		return nums.length / 2 < hs.size() ? nums.length/2 : hs.size();
	}
	
	
	public static int solution(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int n : nums) {
        	if(!list.contains(n)) {
        		System.out.println(n);
        		list.add(n);
        	}
        }
        
        if(list.size() > (nums.length/2)) {
        	return nums.length/2;
        }else {
        	return list.size();
        }
        
        
    }
	
}
