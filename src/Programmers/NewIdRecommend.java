package Programmers;

public class NewIdRecommend {
		
    public static void main(String[] args) {
//    	1	"...!@BaT#*..y.abcdefghijklm"	"bat.y.abcdefghi"
//    	2	"z-+.^."	"z--"
//    	3	"=.="	"aaa"
//    	4	"123_.def"	"123_.def"
//    	5	"abcdefghijklmn.p"	"abcdefghijklmn"
    	System.out.println(solution("abcdefghijklmn.p"));
    	
    	//bat.y.abcdefghi
    	//bat.y.abcdefghi

    }
    
    static public String solution(String new_id) {
    	
    	
    	//1
    	new_id = new_id.toLowerCase();
    	//2
    	new_id = new_id.replaceAll("[^a-z0-9\\.\\_\\-]", "");
    	//3
    	new_id = new_id.replaceAll("\\.+", ".");
    	
    	//4
    	if(new_id.charAt(0) == '.') new_id = new_id.substring(1,new_id.length());
    	if(new_id.length() > 0) if(new_id.charAt(new_id.length()-1) == '.') new_id = new_id.substring(0,new_id.length()-1);
    	//5
        if(new_id.length() == 0) new_id ="a";
        //6
        if(new_id.length() > 15) new_id = new_id.substring(0, 15);
        //7
        if(new_id.length() < 3) {
        	int len = 3-new_id.length();
        	for (int i = 0; i < len; i++) {
        		new_id += new_id.charAt(new_id.length()-1);
			}
        }
        
        //4 한번더
        if(new_id.charAt(0) == '.') new_id = new_id.substring(1,new_id.length());
    	if(new_id.length() > 0) if(new_id.charAt(new_id.length()-1) == '.') new_id = new_id.substring(0,new_id.length()-1);
    	
    	
        
        return new_id;
    }
	    
    static String convert(String new_id) {
    	//4
    	if(new_id.charAt(0) == '.') new_id = new_id.substring(1,new_id.length());
    	if(new_id.length() > 0) if(new_id.charAt(new_id.length()-1) == '.') new_id = new_id.substring(0,new_id.length()-1);
    	//5
        if(new_id.length() == 0) new_id ="a";
        //6
        if(new_id.length() > 15) new_id = new_id.substring(0, 15);
        //7
        if(new_id.length() < 3) {
        	int len = 3-new_id.length();
        	for (int i = 0; i < len; i++) {
        		new_id += new_id.charAt(new_id.length()-1);
			}
        }
		return new_id;
    }
}
	
