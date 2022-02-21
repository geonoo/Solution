package Programmers.level01;

public class 부족한_금액_계산하기 {
		
    public static void main(String[] args) {
    	
    	System.out.println(solution(3,20,4));
    	
    }
    
    static public long solution(int price, int money, int count) {
        
        long sum = 0;
        for (int i = 1; i <=count; i++) {
			sum += price * i; 
		}
        
        return (money-sum < 0) ? sum - money : 0;
    }
	    
	    
}