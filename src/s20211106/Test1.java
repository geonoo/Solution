package s20211106;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
//		[2, 1, 3, 1, 2, 1]	[0, 1, 2]
//		[3, 3, 3, 3, 3, 3]	[6, 6, 0]
//		[1, 2, 3]	[0, 0, 0]
		int[] arr = {1,2,3};
		System.out.println(Arrays.toString(solution(arr)));
	}
	
	static public int[] solution(int[] arr) {
        int[] answer = new int[3];
        
        int[] cntArr = {0,0,0};
        for (int i = 0; i < arr.length; i++) {
        	if(arr[i] == 1) {
        		cntArr[0]++;
        	}else if(arr[i] == 2) {
        		cntArr[1]++;
        	}else {
        		cntArr[2]++;
        	}
		}
        
        int max = -1;
        for (int i = 0; i < cntArr.length; i++) {
        	if(max < cntArr[i]) {
        		max = cntArr[i];
        	}
		}
        
        for (int i = 0; i < cntArr.length; i++) {
			answer[i] = max - cntArr[i];
		}
        
        return answer;
    }
}
