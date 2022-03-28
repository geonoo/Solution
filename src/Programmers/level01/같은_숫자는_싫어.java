package Programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class 같은_숫자는_싫어 {
		
    public static void main(String[] args) {
//    	[1,1,3,3,0,1,1]	[1,3,0,1]
//    	[4,4,4,3,3]	[4,3]
    	int[] arr = {1,1,3,3,0,1,1};
    	int[] rtn = solution2(arr);
    	System.out.println(Arrays.toString(rtn));
    }
    
    static public int[] solution(int []arr) {
    	
    	int len = arr.length;
    	for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				arr[i] = -1;
				len--;
			}
		}
    	
    	int[] rtn = new int[len];
    	int idx = 0;
    	for (int i = 0; i < arr.length; i++) {
			if(arr[i] != -1) {
				rtn[idx++] = arr[i];
			}
		}
    	
    	return rtn;
    }
    
    static public int[] solution2(int []arr) {
			ArrayList<Integer> list = new ArrayList<Integer>();

			for (int i = 0; i < arr.length-1; i++) {
				if(arr[i] != arr[i+1]) list.add(arr[i]);
				if(i == arr.length-2 && list.size() == 0) list.add(arr[i]);
				if(i == arr.length-2 && list.get(list.size()-1) != arr[i+1]) list.add(arr[i+1]);
			}

			int[] answer = new int[list.size()];
			for (int i = 0; i < list.size(); i++)
				answer[i] = list.get(i);

			return answer;
    }
}
	
