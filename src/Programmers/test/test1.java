package Programmers.test;

import java.util.Arrays;
import java.util.HashMap;

public class test1 {

	public static void main(String[] args) {
		
//		[1,52,125,10,25,201,244,192,128,23,203,98,154,255]	126
//		[0,0,255,255,0,0,255,255,255]	1
//		[100,50,100,200]	51
		
		int[] arr = {100,50,100,200};
		
		System.out.println(solution(arr));
	}
//	임계값을 정해서 최대가 되는 수 a
//	임계값을 정해서 최소가 되는 수 b
//	|a - b| 이 가장 작은 수를 구하기 
//	0~255 원소 
	
	static public int solution(int[] arr) {
		int answer = 255;
        int min = 256;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < 256; i++) {
        	int a = 0;
        	int b = 0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[j] < i) {
					b++;
				}else {
					a++;
				}
			}
			
			if(min > Math.abs(a-b)) {
				min = Math.abs(a-b);
				map.put(i, min);
			}
		}
        
        for (int key : map.keySet()) {
			if(min == map.get(key) && answer > key) {
				answer = key;
			}
		}
        
        return answer;
    }

}
