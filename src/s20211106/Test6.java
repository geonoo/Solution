package s20211106;

public class Test6 {

	public static void main(String[] args) {
//		3.5	[ ["홍콩", "11PM", "9AM"], ["엘에이", "3PM", "2PM"] ]	"홍콩"
		
//		요일	출근 시간	퇴근 시간
//		월	1PM	6PM
//		금	9:30AM	6PM
		
		String[][] plans = {{"홍콩", "11PM", "9AM"}, {"엘에이", "3PM", "2PM"}};
		System.out.println(solution(3.5, plans));
	}
	
	
	static public String solution(double time, String[][] plans) {
        String answer = "";
        
        for (int i = 0; i < plans.length; i++) {
        	double s = 18;
        	double e = 13;
        	
        	double start = Double.parseDouble(plans[i][1].substring(0, plans[i][1].length()-2));
        	double end = Double.parseDouble(plans[i][2].substring(0, plans[i][2].length()-2));
        	if(plans[i][1].contains("PM")) {
        		start = Double.parseDouble(plans[i][1].substring(0, plans[i][1].length()-2))+12;
        	}
        	if(plans[i][2].contains("PM")) {
        		end = Double.parseDouble(plans[i][2].substring(0, plans[i][2].length()-2))+12;
        	}
        	
        	if(start < s) {
        		time -= s - start;
        	}
        	if(end > e) {
        		time -= end - e;
        	}
        	
        	if(time < 0) {
        		continue;
        	}else {
        		System.out.println(plans[i][0]);
        		answer = plans[i][0];
        	}
        	
		}
        
        return answer;
    }
}
