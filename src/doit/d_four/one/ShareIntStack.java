package doit.d_four.one;

import java.util.EmptyStackException;

public class ShareIntStack {
	private int max1;
	private int ptr1;
	private int max2;
	private int ptr2;
	
	private int[] stk;
	
	
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	
	public ShareIntStack(int capacity1, int capacity2) {
		ptr1 = 0;
		max1 = capacity1;
		
		ptr2 = 0;
		max2 = capacity2;
		try {
			stk = new int[capacity1 + capacity2];
		}catch (OutOfMemoryError e) {
			max1 = 0;
			max2 = 0;
		}
	}
	
	public int push1(int x) throws OverflowIntStackException{
		if(ptr1 >= max1) {
			throw new OverflowIntStackException();
		}
		return stk[ptr1++] = x;
	}
	
	public int push2(int x) throws OverflowIntStackException{
		if(ptr2 >= max2) {
			throw new OverflowIntStackException();
		}
		int y = (max1+max2-1)-ptr2; 
		ptr2++;
		return stk[y] = x;
	}
	
	public int pop1() throws EmptyIntStackException{
		if(ptr1 <= 0) {
			throw new EmptyStackException();
		}
		return stk[--ptr1];
	}
	
	public int pop2() throws EmptyIntStackException{
		if((max1+max2) <= (ptr2+max1)) {
			throw new EmptyStackException();
		}
		--ptr2;
		int y = (max1 + (max2-ptr2)); 
		return stk[y];
	}
	
	
//	public int peek() throws EmptyIntStackException{
//		if(ptr <= 0) {
//			throw new EmptyIntStackException();
//		}
//		return stk[ptr - 1];
//	}
//	public int indexOf(int x) {
//		for (int i = ptr - 1; i >= 0; i--) {
//			if(stk[i] == x) {
//				return i;
//			}
//		}
//		return -1;
//	}
//	public void clear() {
//		ptr = 0;
//	}
//	public int capacity() {
//		return max;
//	}
//	public int size() {
//		return ptr;
//	}
//	public boolean isEmpty() {
//		return ptr <= 0;
//	}
//	public boolean ifFull() {
//		return ptr >= max;
//	}
//	public void dump() {
//		if(ptr <= 0)
//			System.out.println("스택이 비어 있습니다.");
//		else{
//			for (int i = 0; i < ptr; i++) {
//				System.out.print(stk[i] + " ");
//			}
//			System.out.println();
//		}
//	}
}
