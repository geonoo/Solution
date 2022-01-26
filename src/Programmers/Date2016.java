package Programmers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date2016 {
	
	public static void main(String[] args) throws Exception {
		
		int a = 5;
		int b = 24;
		
		System.out.println(solution(a, b));
		
	}
	
	
	static String solution(int a, int b) throws ParseException {
		String m = a < 10 ? "0"+a : a+"";
		String d = b < 10 ? "0"+b : b+"";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date nDate = dateFormat.parse("2016-"+m+"-"+d);
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(nDate);
		int rtn = cal2.get(Calendar.DAY_OF_WEEK);
		String rtnNm = "";
		switch (rtn) {
		case 1: rtnNm = "SUN"; break;
		case 2: rtnNm = "MON"; break;
		case 3: rtnNm = "TUE"; break;
		case 4: rtnNm = "WED"; break;
		case 5: rtnNm = "THU"; break;
		case 6: rtnNm = "FRI"; break;
		case 7: rtnNm = "SAT"; break;

		default: rtnNm = "SUN"; break;
		}
		
		return rtnNm;
	    
	 }
	
}
