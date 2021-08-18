package s20210818;

public class Grades {
		
    public static void main(String[] args) {
    	int[][] arr = {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};
    	System.out.println(solution(arr));
    }
    
    static String solution(int[][] scores) {
    	String answer = "";
    	for (int i = 0; i < scores.length; i++) {
    		int max = 0;
    		int min = 0;
    		int sum = 0;
    		int len = scores.length;
			for (int j = 0; j < scores[i].length; j++) {
				if(scores[i][i] > scores[j][i]) {
					max++;
				}else if(scores[i][i] < scores[j][i]) {
					min++;
				}
				sum += scores[j][i];
				
			}
			
			if(max == (scores.length-1) || min == (scores.length-1)) {
				sum -= scores[i][i];
				len--;
			}
			
			answer += grade(sum/len);
		}
        
        return answer;
    }
	
    static String grade(double num) {
    	
    	String a = "A";
    	
    	if(num >= 90) {
    		a = "A";
    	}else if(num >= 80 && num < 90) {
    		a = "B";
    	}else if(num >=70 && num < 80) {
    		a = "C";
    	}else if(num >= 50 && num < 70){
    		a = "D";
    	}else {
    		a = "F";
    	}
    	
    	return a;
    }
    
	    
}
	
