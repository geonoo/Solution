package s20210831;

import java.util.ArrayList;
import java.util.Arrays;

public class BracketConversion_kakao {
	public static void main(String[] args) {
		
		
//		"(()())()"	"(()())()"
//		")("		"()"
//		"()))((()"	"()(())()"
		System.out.println(solution("(()())()("));

	}
	
	//괄호 변환 
	static public String solution(String p) {
        String answer = p;
        
        if(p.equals("")) {
        	return "";
        }
        
        String u = "", v = "";
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < p.length(); i++) {
			if(p.charAt(i) == '(') {
				cnt1++;
			}
			if(p.charAt(i) == ')') {
				cnt2++;
			}
		}
        
        int cnt = cnt1 - cnt2;
        System.out.println(cnt);
        
        String[] a = p.split("");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(a)); 
        
        if(cnt == 0) {
        	u = p;
        }else if(cnt < 0){
        	list.remove(p.lastIndexOf("("));
        	for(int i=0; i<Math.abs(cnt); i++) {
        		v += "(";
        	}
        	for (String s : list) {
    			u += s; 
    		}
        }else {
        	list.remove(p.lastIndexOf(")"));
        	v += ")";
        	for(int i=0; i<cnt; i++) {
        		v += ")";
        	}
        	for (String s : list) {
    			u += s; 
    		}
        }
        
        int yes = 0;
        
//        ))()(())(
        
        return answer;
    }
	

}
