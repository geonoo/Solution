package s20210827;

import java.util.*;

public class OpenChatRoom_kakao {
	public static void main(String[] args) {
		
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
//		["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]
		
//		["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]
		
		System.out.println((solution(record)));
	}
	
	//챗팅방 로그 
	static public ArrayList<String> solution(String[] record) {
		ArrayList<String> answer = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<String>();
		
        HashMap<String, String> map = new HashMap<String, String>(); 
        
        for (String s : record) {
			String[] a = s.split(" ");
			if(a[0].equals("Enter")) {
				map.put(a[1], a[2]);
				temp.add(a[1]+"님이 들어왔습니다.");
			}else if(a[0].equals("Change")) {
				map.put(a[1], a[2]);
			}else {
				temp.add(a[1]+"님이 나갔습니다.");
			}
			
		}
        
        
        for(String s : temp) {
        	String key = s.substring(0, s.indexOf("님"));
        	answer.add(s.replaceAll(key, map.get(key)));
        }
        
        return answer;
    }
	
	
}
