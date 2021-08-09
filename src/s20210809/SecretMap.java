package s20210809;

public class SecretMap {
		
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
    	for (String s : solution(5, arr1, arr2)) {
    		System.out.println(s);
		}
    }
    
    static public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] t1 = new String[n];
        String[] t2 = new String[n];
        
        for (int i = 0; i < arr1.length; i++) {
        	t1[i] = Integer.toBinaryString(arr1[i]);
        	t2[i] = Integer.toBinaryString(arr2[i]);
        	
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
	
