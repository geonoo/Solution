package Programmers;

import java.util.ArrayList;

public class FindPrimeNumber {
		
	//��
    public static void main(String[] args) {
    	long beforeTime = System.currentTimeMillis(); //�ڵ� ���� ���� �ð� �޾ƿ���
        
    	System.out.println("�� : "+solution(10000000));
    	        
    	long afterTime = System.currentTimeMillis(); // �ڵ� ���� �Ŀ� �ð� �޾ƿ���
    	long secDiffTime = (afterTime - beforeTime); //�� �ð��� �� ���
    	System.out.println("�ð��� : "+secDiffTime);
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
	
