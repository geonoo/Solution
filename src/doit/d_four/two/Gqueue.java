package doit.d_four.two;

public class Gqueue<E> {
	private int max;
	private int front;
	private int rear;
	private int num;
	private E[] que;
	
	public static class EmptyGqueException extends RuntimeException {
		public EmptyGqueException() {
		}
	}

	public static class OverflowGqueException extends RuntimeException {
		public OverflowGqueException() {
		}
	}
	
	public Gqueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = (E[])new Object[max];
		}catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public E enque(E x) throws OverflowGqueException{
		if(num >= max)
			throw new OverflowGqueException();
		que[rear++] = x;
		num++;
		if(rear == max)
			rear = 0;
		return x;
	}
	
	public E deque() throws EmptyGqueException{
		if(num <= 0) {
			throw new EmptyGqueException();
		}
		E x = que[front++];
		num--;
		if(front == max)
			front = 0;
		return x;
	}
	
	public E peek() throws EmptyGqueException{
		if(num <= 0)
			throw new EmptyGqueException();
		return que[front];
	}
	
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if(que[idx].equals(x))
				return idx;
		}
		return -1;
	}
	
	public void clear() {
		num = front = rear = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return num;
	}
	
	public boolean isEmpty() {
		return num <= 0;
	}
	
	public boolean isFull() {
		return num >= max;
	}
	public void dump() {
		if(num <= 0) {
			System.out.println("큐가 비어 있습니다. ");
		}else {
			for (int i = 0; i < num; i++) {
				System.out.print(que[(i + front) % max] + " ");
			}
			System.out.println();
		}
	}
	public int search(E x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if(x.equals(que[idx])) {
				return i+1;
			}
		}
		return 0;
	}
	
}

