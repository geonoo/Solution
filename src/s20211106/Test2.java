package s20211106;

import java.text.*;

public class Test2 {

	public static void main(String[] args) throws ParseException {
//		["08:30", "09:00", "14:00", "16:00", "16:01", "16:06", "16:07", "16:11"]	"02:20"
//		["01:00", "08:00", "15:00", "15:04", "23:00", "23:59"]	"02:44"
		
		String[] log =  {"08:30", "09:00", "14:00", "16:00", "16:01", "16:06", "16:07", "16:11"};
		System.out.println(solution(log));
	}
	
	static public String solution(String[] log) throws ParseException {
        SimpleDateFormat f = new SimpleDateFormat("HH:mm");
        
        
        long ans = 0;
        for (int i = 0; i < log.length; i+=2) {
        	long bTime = f.parse(log[i]).getTime();
			long time = f.parse(log[i+1]).getTime();
			
			if(time - bTime < 300000) {
				
			}else if(time - bTime > 6300000){
				ans += 6300000;
			}else {
				ans += time - bTime;
			}
		}
        
        if((ans / 60000) / 60 < 10) {
        	return "0"+(ans / 60000) / 60+":"+((ans / 60000) % 60);
        }else {
        	return (ans / 60000) / 60+":"+((ans / 60000) % 60);
        }
    }
}
