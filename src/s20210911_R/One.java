package s20210911_R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class One {
	public static void main(String[] args) {
		
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		
		System.out.println(Arrays.toString(solution(id_list, report, 2)));
		
	}
	
//	["muzi", "frodo", "apeach", "neo"]	["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]	2	[2,1,1,0]
//	["con", "ryan"]	["ryan con", "ryan con", "ryan con", "ryan con"]	3	[0,0]
	
	//누구를 신고했는
	
	static public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        //본인이 신고당한 횟수 
        Map<String, Integer> id = new HashMap<>();
        
        //본인이 신고한 사람
        Map<String, List<String>> re = new HashMap<>();
        
        //본인의 인덱스
        Map<String, Integer> idx = new HashMap<>();
        
        for (int i = 0; i < id_list.length; i++) {
			id.put(id_list[i], 0);
			re.put(id_list[i], new ArrayList<String>());
			idx.put(id_list[i], i);
			answer[i] = 0;
		}
        
        for (int i = 0; i < report.length; i++) {
			String[] temp = report[i].split(" ");
			
			if(!re.get(temp[0]).contains(temp[1])) {
				List<String> tmp = re.get(temp[0]);
				tmp.add(temp[1]);
				re.put(temp[0], tmp);
				id.put(temp[1], id.get(temp[1])+1);
			}
			
		}
        
        for (String key : id.keySet()) {
        	if(id.get(key) >= k) {
				for (String k2 : re.keySet()) {
					if(re.get(k2).contains(key)) {
						answer[idx.get(k2)] += 1;
					}
				}
			}
		}
        
        return answer;
    }
	
	
}
