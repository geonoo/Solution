package s20210806;

import java.util.ArrayList;

public class FindPrimeNumber {
		
	//★
    public static void main(String[] args) {
    	long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
        
    	System.out.println("답 : "+solution(10000000));
    	        
    	long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
    	long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
    	System.out.println("시간차 : "+secDiffTime);
    }
    
    
    static public int solution(int n) {
        int answer = 0;
        
        int[] arr = new int[n+1];
        
        for(int i=2;i<=n;i++) {
        	arr[i] = i;
        }
        for(int i=2;i*i<=n;i++) {
        	if(arr[i] == 0) continue;
        	for (int j=i+i;j<=n;j+=i) {
        		arr[j] = 0;
			}
        }
        
        for(int i=2;i<=n;i++) {
        	if(arr[i] != 0) {
        		answer++;
        	}
        }
        
        return answer;
    }
	    
}
	
