package s20210713;
import java.util.Stack;

public class puppetDraw {
	public static void main(String[] args) throws Exception {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		System.out.println("answer : " + solution(board, moves) + "");
		
	}

//ÀÎÇü»Ì±â
public static int solution(int[][] board, int[] moves) {
	 int answer = 0;
	 Stack<Integer> basket = new Stack<Integer>();
	 
	 for(int j=0; j<moves.length; j++) {
		 for(int i=0; i<board.length; i++) {
			 if(board[i][moves[j]-1] != 0) {
				 
				 if(basket.isEmpty()) {
					 basket.push(board[i][(moves[j]-1)]);
				 }else {
					 if(basket.peek() ==  board[i][(moves[j]-1)]){
						 basket.pop();
						 answer += 2;
					 }else {
						 basket.push(board[i][(moves[j]-1)]);
					 }
				 }
				 
				 board[i][(moves[j]-1)] = 0;
				 break;
			 }
		 }
		 
	 }
        
	 return answer;
	 
    }
}
