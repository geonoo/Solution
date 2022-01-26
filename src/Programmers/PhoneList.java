package Programmers;

import java.util.*;

public class PhoneList {

	public static void main(String[] args) {
//		["119", "97674223", "1195524421"]	false
//		["123","456","789"]	true
//		["12","123","1235","567","88"]	false
		
		String[] phone_book = {"12","123","1235","567","88"};
		
		System.out.println(solution(phone_book));
	}
	
	
	static public boolean solution(String[] phone_book) {
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for (int i = 0; i < phone_book.length; i++) {
			map.put(phone_book[i], i);
		}
        
        for (int i = 0; i < phone_book.length; i++) {
			for (int j = 0; j < phone_book[i].length(); j++) {
				if(map.containsKey(phone_book[i].substring(0, j))) {
					return false;
				}
			}
		}
        
        return true;
    }
	
	static public boolean solution2(String[] phoneBook) {
       for(int i=0; i<phoneBook.length-1; i++) {
            for(int j=i+1; j<phoneBook.length; j++) {
                if(phoneBook[i].startsWith(phoneBook[j])) {return false;}
                if(phoneBook[j].startsWith(phoneBook[i])) {return false;}
            }
        }
        return true;
    }
}
