package s20210804;

public class RowColumnPlus {
		
	    public static void main(String[] args) {
//	    	int[][] arr1 = {{1,2},{2,3}};
//	    	int[][] arr2 = {{3,4},{5,6}};
	    	
	    	int[][] arr1 = {{1},{2}};
	    	int[][] arr2 = {{3},{4}};
	    	
	    	int[][]  aa = solution(arr1, arr2);
	    	for (int i = 0; i < aa.length; i++) {
	    		for (int j = 0; j < aa[i].length; j++) {
	    			System.out.println(aa[i][j]);
				}
			}
	    }
	    
	    static public int[][] solution(int[][] arr1, int[][] arr2) {
	    	
	    	
	        int[][] answer = new int[arr1.length][arr1[0].length];
	        
	        for(int i=0; i<arr1.length; i++) {
	        	//System.out.println("i : " + i);
	        	for(int j=0; j<arr1[i].length; j++) {
	        		//System.out.println("j : " + j);
	        		answer[i][j] = arr1[i][j] + arr2[i][j]; 
	        	}
	        }
	        
	        return answer;
	    }
	}
	
