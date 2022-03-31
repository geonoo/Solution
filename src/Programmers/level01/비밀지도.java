package Programmers.level01;

public class 비밀지도 {
		
    public static void main(String[] args) {
//    	5
//    	[9, 20, 28, 18, 11]
//    	[30, 1, 21, 17, 28]
//    	["#####","# # #", "### #", "# ##", "#####"]
    	
//    	6
//    	[46, 33, 33 ,22, 31, 50]
//    	[27 ,56, 19, 14, 14, 10]
//    	["######", "### #", "## ##", " #### ", " #####", "### # "]
    	
    	int[] arr1 = {9, 20, 28, 18, 11};
    	int[] arr2 = {30, 1, 21, 17, 28};
//    	solution(5, arr1, arr2);
    	for (String s : solution3(5, arr1, arr2)) {
    		System.out.println(s);
		}
	}

	static public String[] solution3(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];

		String[] sArr1 = new String[n];
		String[] sArr2 = new String[n];
		for (int i = 0; i < n; i++) {
			String a = Integer.toBinaryString(arr1[i]);
			int lenA = n - a.length();;
			for (int j = 0; j < lenA; j++)  a = "0"+a;
			sArr1[i] = a;

			String b = Integer.toBinaryString(arr2[i]);
			int lenB = n - b.length();;
			for (int j = 0; j < lenB; j++)  b = "0"+b;
			sArr2[i] = b;
		}

		for (int i = 0; i < n; i++) {
			String s = "";
			for (int j = 0; j < n; j++) {
				boolean check = sArr1[i].charAt(j) == '0' && sArr2[i].charAt(j) == '0';
				s += check ? " " : "#";
			}
			answer[i] = s;
		}

		return answer;
	}
    
    static public String[] solution(int n, int[] arr1, int[] arr2) {
    	String[] answer = new String[n];
    	String[] t1 = new String[n];
    	String[] t2 = new String[n];
    	
    	for (int i = 0; i < t2.length; i++) {
    		t1[i] = Integer.toBinaryString(arr1[i]);
        	t2[i] = Integer.toBinaryString(arr2[i]);
        	
        	String zero = "";
    		for (int j = 0; j < n-t1[i].length(); j++) {
    			zero += "0";
    		}
//    		System.out.println(zero+t1[i]);
    		t1[i] = zero+t1[i];
    		zero = "";
    		for (int j = 0; j < n-t2[i].length(); j++) {
    			zero += "0";
    		}
//    		System.out.println(zero+t2[i]);
    		t2[i] = zero+t2[i];
		}
    	
    	for (int i = 0; i < t2.length; i++) {
			for (int j = 0; j < t2[i].length(); j++) {
				if(j==0) answer[i] = "";
				if(t1[i].charAt(j) == '1' || t2[i].charAt(j) == '1') {
					answer[i] += "#";
				}else {
					answer[i] += " ";
				}
			}
		}
    	
    	return answer;
    }
    
    
    static public String[] solution2(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] t1 = new String[n];
        String[] t2 = new String[n];
        
        for (int i = 0; i < arr1.length; i++) {
        	t1[i] = Integer.toBinaryString(arr1[i]);
        	t2[i] = Integer.toBinaryString(arr2[i]);
        	
        	System.out.println(t1[i]);
        	System.out.println(t2[i]);
        	
    		String zero = "";
    		for (int j = 0; j < n-t1[i].length(); j++) {
    			zero += "0";
			}
    		t1[i] = (zero + t1[i]).substring((zero + t1[i]).length()-n, (zero + t1[i]).length());
    		
    		zero = "";
    		for (int j = 0; j < n-t2[i].length(); j++) {
    			zero += "0";
			}
    		t2[i] = (zero + t2[i]).substring((zero + t2[i]).length()-n, (zero + t2[i]).length());
    		
        	for (int j = 0; j < t1[i].length(); j++) {
				if(t1[i].charAt(j) == '0' && t2[i].charAt(j) == '0') {
					answer[i] = (answer[i] == null) ? " " : answer[i] + " ";
				}else {
					answer[i] = (answer[i] == null) ? "#" : answer[i] + "#";
				}
			}
        	
		}
        
        return answer;
    }
	    
	    
}
	
