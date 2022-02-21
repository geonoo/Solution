package Programmers.level01;

import java.util.ArrayList;

public class 폰켓몬 {
	
	public static void main(String[] args) throws Exception {
		int[] nums = {3,3,3,2,2,4};
		//int[] nums = {3,3,3,2,2,2};
		//int[] nums = {3, 1, 2, 3};
		
		System.out.println("answer : " + solution(nums));
		
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
