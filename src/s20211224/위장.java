package s20211224;

import java.util.HashMap;

public class 위장 {

	public static void main(String[] args) {
//		[["yellowhat", "headgear"], ["bluesunglasses", "eyewear"], ["green_turban", "headgear"]]	5
//		[["crowmask", "face"], ["bluesunglasses", "face"], ["smoky_makeup", "face"]]	3
		
		String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		
		System.out.println(solution(clothes));
		
	}
	
	static public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < clothes.length; i++) {
        	map.put(clothes[i][1], map.get(clothes[i][1])+"|"+clothes[i][0]);
        }
        
            for (String key : map.keySet()) {
            	answer *= map.get(key).split("\\|").length;
    		}
        
        return answer-1;
    }

}
