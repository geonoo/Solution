package doit.chap04;

import java.util.EmptyStackException;

public class Gstack {
	private int max;
	private int ptr;
	private Object[] stk;
	
	
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	
	public Gstack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new Object[max];
		}catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public Object push(Object x) throws OverflowIntStackException{
		if(ptr >= max) {
			throw new OverflowIntStackException();
		}
		return stk[ptr++] = x;
	}
	
	public Object pop() throws EmptyIntStackException{
		if(ptr <= 0) {
			throw new EmptyStackException();
		}
		return stk[--ptr];
	}
	public Object peek() throws EmptyIntStackException{
		if(ptr <= 0) {
			throw new EmptyIntStackException();
		}
		return stk[ptr - 1];
	}
	public Object indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--) {
			if(stk[i].equals(x)) {
				return i;
			}
		}
		return -1;
	}
	public void clear() {
		ptr = 0;
	}
	public int capacity() {
		return max;
	}
	public int size() {
		return ptr;
	}
	public boolean isEmpty() {
		return ptr <= 0;
	}
	public boolean ifFull() {
		return ptr >= max;
	}
	public void dump() {
		if(ptr <= 0)
			System.out.println("스택이 비어 있습니다.");
		else{
			for (int i = 0; i < ptr; i++) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
		}
	}
}
