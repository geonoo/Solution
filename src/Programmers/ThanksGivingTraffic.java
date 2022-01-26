package Programmers;

import java.text.*;

public class ThanksGivingTraffic {
	public static void main(String[] args) throws ParseException {
		
		String[] lines = {
				"2016-09-15 20:59:57.421 0.351s",
				"2016-09-15 20:59:58.233 1.181s",
				"2016-09-15 20:59:58.299 0.8s",
				"2016-09-15 20:59:58.688 1.041s",
				"2016-09-15 20:59:59.591 1.412s",
				"2016-09-15 21:00:00.464 1.466s",
				"2016-09-15 21:00:00.741 1.581s",
				"2016-09-15 21:00:00.748 2.31s",
				"2016-09-15 21:00:00.966 0.381s",
				"2016-09-15 21:00:02.066 2.62s"
				};
		System.out.println(solution(lines));
	}
	
	//추석 트래픽 조사 
	static public int solution(String[] lines) throws ParseException {
        int max = 0;
        
        SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss.SSS");
        
        int[] count = new int[lines.length];
        
        for (int i = 0; i < lines.length; i++) {
        	
        	long fTime = f.parse(lines[i].split(" ")[1]).getTime();
        	
        	for (int j = i; j < lines.length; j++) {
				
        		long eTime = f.parse(lines[j].split(" ")[1]).getTime();
        		double sec = Double.parseDouble(lines[j].split(" ")[2].substring(0, lines[j].split(" ")[2].length()-1));
        		
        		eTime = (long)(eTime - sec*1000) + 1;
        		
        		
        		if(fTime + 1000 > eTime) {
        			count[i] += 1;
        			max = Math.max(max, count[i]);
        		}
        		
        		
			}
        	
		}
        
        return max;
    }
	
}
