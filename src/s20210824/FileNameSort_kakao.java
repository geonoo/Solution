package s20210824;

import java.util.Arrays;
import java.util.Comparator;

public class FileNameSort_kakao {
		
    public static void main(String[] args) {
//    	foo9.txt	foo	9	.txt
//    	foo010bar020.zip	foo	010	bar020.zip
//    	F-15	F-	15	(빈 문자열)
    	
//    	입력: ["F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"]
//    	출력: ["A-10 Thunderbolt II", "B-50 Superfortress", "F-5 Freedom Fighter", "F-14 Tomcat"]
    	
    	String[] a = {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
    	
    	System.out.println(Arrays.toString(solution(a)));
    }
    
    static public String[] solution(String[] files) {
        
    	Arrays.sort(files, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				String[] file1 = separator(o1);
				String[] file2 = separator(o2);
				
				int com = file1[0].toLowerCase().compareTo(file2[0].toLowerCase());
				
				if(com == 0) {
					return Integer.parseInt(file1[1]) - Integer.parseInt(file2[1]);
				}else {
					return com;
				}
			}
    		
    		private String[] separator(String a) {
    			String head = a.split("[0-9]")[0];
    			
    			String num = "";
    			String temp = a.substring(head.length());
    			for(int i=0; i<temp.length(); i++) {
    				if(numCheck((temp.charAt(i)+"")) && num.length() < 5) {
    					num += temp.charAt(i)+"";
    				}else {
    					break;
    				}
    			}
    			
    			String tail = a.substring(head.length()+num.length());
    			
    			String file[] = {head, num, tail};
    			
				return file;
    		}
    		
		});
        
        return files;
    }
	    
    
    private static boolean numCheck(String a) {
    	
    	try {
			Integer.parseInt(a);
		} catch (NumberFormatException e) {
			return false;
		}
    	
    	return true;
    }
    
}
	
