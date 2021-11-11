package s20211110;

public class BigSquare {

	public static void main(String[] args) {
//		[[0,1,1,1],[1,1,1,1],[1,1,1,1],[0,0,1,0]]	9
//		[[0,0,1,1],[1,1,1,1]]	4
		
		int[][] borad = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
		
		System.out.println(solution(borad));
		
	}
	
	
	static public int solution(int [][]board){
		int ans = 0;
		int row = board.length;
		int col = board[0].length;
		
		int[][] arr = new int[row+1][col+1];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i+1][j+1] = board[i][j];
			}
		}
		
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[0].length; j++) {
				if(arr[i][j] != 0) {
					int up = arr[i-1][j];
					int left = arr[i][j-1];
					int leftUp = arr[i-1][j-1];
					arr[i][j] = Math.min(Math.min(up, left),leftUp)+1;
					ans = Math.max(ans, arr[i][j]);
				}
			}
		}
		
        return ans*ans;
    }
	
}
