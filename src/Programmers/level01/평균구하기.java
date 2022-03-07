package Programmers.level01;

public class 평균구하기 {
		
   public static void main(String[] args) {
    	int[] arr = {1,2,3,4};
    	System.out.println(solution2(arr));
    }
    
    static public double solution(int[] arr) {
        double answer = 0;
        
        int sum = 0;
        for(int a : arr) {
        	sum += a;
        }
        answer = (double)sum/(double)arr.length; 
        
        return answer;
    }

    static public double solution2(int[] arr) {
       double answer = 0;

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

       return answer/arr.length;
    }
	    
	    
}
	
