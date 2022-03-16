package Programmers.level01;

public class 소수찾기 {
		
    public static void main(String[] args) {
    	long beforeTime = System.currentTimeMillis(); 
        
    	System.out.println("시작 : "+solution2(10000000));
    	        
    	long afterTime = System.currentTimeMillis();
    	long secDiffTime = (afterTime - beforeTime);
    	System.out.println("차이 : "+secDiffTime);
    }
    
//    에라토스테네스의 체 알고리즘
    static public int solution(int n) {
        int answer = 0;
        
        int[] arr = new int[n+1];
        
        for(int i=2;i<=n;i++) {
        	arr[i] = i;
        }
        for(int i=2;i*i<=n;i++) {
//        	소수의 배수로써 걸러진 수들은 넘어간다 (4,6,8,9..... 등)
        	if(arr[i] == 0) continue;
//        	자신을 제외한 배수를 고려하기 위해 i+i; j<=n;j=j+i 조건으로 걸러준다.
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

    // 4, 6, 8, 10 ... 배수를 제거
    static public int solution2(int n) {
        int anwser = 0;
        boolean[] arr = new boolean[n+1];

        for (int i = 2; i*i <= n ; i++)
            if(!arr[i])
                for (int j = i+i; j <= n ; j+=i) arr[j] = true;

        for (int i = 2; i <= n ; i++)
            if(!arr[i]) anwser++;

        return anwser;
    }
	    
}
	
