package s20211106;

import java.util.HashMap;

public class Test3 {

	public static void main(String[] args) {
		
		String[] ings = {"r 10", "a 23", "t 124", "k 9"};
		String[] menu = {"PIZZA arraak 145", "HAMBURGER tkar 180", "BREAD kkk 30", "ICECREAM rar 50", "SHAVEDICE rar 45", "JUICE rra 55", "WATER a 20"};
		String[] sell = {"BREAD 5", "ICECREAM 100", "PIZZA 7", "JUICE 10", "WATER 1"};
//				1161
		
//		["x 25", "y 20", "z 1000"]	["AAAA xyxy 15", "TTT yy 30", "BBBB xx 30"]	["BBBB 3", "TTT 2"]	-80
		
		System.out.println(solution(ings, menu, sell));
	}
	
	//(5*145) - (a+r+r+a+a+k) * 5
	
	static public int solution(String[] ings, String[] menu, String[] sell) {
        int answer = 0;
        
        //r : 10
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        
        //PIZZA : 145
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();
        //PIZZA : arraak
        HashMap<String, String> map3 = new HashMap<String, String>();
        
       
        for (int i = 0; i < ings.length; i++) {
        	map1.put(ings[i].split(" ")[0], Integer.parseInt(ings[i].split(" ")[1]));
		}
        
        for (int i = 0; i < menu.length; i++) {
			map2.put(menu[i].split(" ")[0], Integer.parseInt(menu[i].split(" ")[2]));
			map3.put(menu[i].split(" ")[0], menu[i].split(" ")[1]);
		}
        
        for (int i = 0; i < sell.length; i++) {
			int cnt = Integer.parseInt(sell[i].split(" ")[1]);
			String key = sell[i].split(" ")[0];
			
			
			String[] a = map3.get(key).split("");
			int mc = 0;
			for(int j = 0; j<a.length; j++) {
				mc += map1.get(a[j]);
			}
			
			answer += ((map2.get(key)) * cnt) - (mc * cnt);
			
		}
        
        return answer;
    }

}
