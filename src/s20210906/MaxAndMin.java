package s20210906;

import java.util.Arrays;

public class MaxAndMin {
	public static void main(String[] args) {
		System.out.println(solution("1 2 3 4"));
	}
	
	static public String solution(String s) {
        String[] arr = s.split(" ");
        int[] arr2 = new int[arr.length];
        
        for (int i = 0; i < arr2.length; i++) {
			arr2[i]  = Integer.parseInt(arr[i]); 
		}
        
        Arrays.sort(arr2);
        
        return arr2[0]+ " " + arr2[arr2.length-1];
    }
}
