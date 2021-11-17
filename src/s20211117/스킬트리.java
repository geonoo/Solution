package s20211117;

import java.util.ArrayList;
import java.util.List;

public class 스킬트리 {

	public static void main(String[] args) {
//		"CBD"	["BACDE", "CBADF", "AECB", "BDA"]	2
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		System.out.println(solution("CBD", skill_trees));
		
	}
	
	static List<Character> list = new ArrayList<Character>();
	static public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        
        for (int i = 0; i < skill.length(); i++) {
        	list.add(skill.charAt(i));
		}
        
        for (int i = 0; i < skill_trees.length; i++) {
        	int skidx = 0;
			for (int j = 0; j < skill_trees[i].length(); j++) {
				int chk = skillChk(skill_trees[i].charAt(j),skidx);
				if(chk == skidx) {
					skidx++;
				}else if(chk > -1) {
					break;
				}
				
				if(j == skill_trees[i].length()-1) {
					answer++;
				}
				
			}
		}
        
        return answer;
    }
	
	static int skillChk(char s, int skidx) {
		
		for (int i = skidx; i < list.size(); i++) {
			if(s == list.get(i)) {
				return i;
			}
		}
		
		return -1;
	}

}
