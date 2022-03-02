package Programmers.level01;

public class 행렬의_덧셈 {
		
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
	        	for(int j=0; j<arr1[i].length; j++) {
	        		answer[i][j] = arr1[i][j] + arr2[i][j]; 
	        	}
	        }
	        
	        return answer;
	    }

//		[[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
//		[[1],[2]]	[[3],[4]]	[[4],[6]]
		static public int[][] solution2(int[][] arr1, int[][] arr2){
			int[][] answer = new int[arr1.length][arr1[0].length];

			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr1[0].length; j++) {
					answer[i][j] = arr1[i][j] + arr2[i][j];
				}
			}

			return answer;
		}


	}
	
