package doit.d_four.one;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(64);
		
		while (true) {
			System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
			System.out.print("1.푸시  2.팝  3.피크  4.덤프  5.인덱스오브  6.클리어  7.비었는지  8.꽉찾는지  0.종료 ");
			
			int menu = stdIn.nextInt();
			if(menu == 0) break;
			
			int x;
			switch (menu) {
			case 1:
				System.out.print("데이터 : ");
				x = stdIn.nextInt();
				try {
					s.push(x);
				}catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찾습니다. ");
				}
				break;
			case 2:
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다. ");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
			case 3:
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다. ");
				}catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다. ");
				}
				break;
			case 4:
				s.dump();
				break;
			case 5 : 
				System.out.println("찾으시는 값 : ");
				int i = stdIn.nextInt();
				x = s.indexOf(i);
				if(x < 0) {
					System.out.println("찾으 시는 값이 없습니다.");
				}else {
					System.out.println("찾으시는 값은 s[" + x + "] 위치에 있습니다.");
				}
				break;
			case  6 : 
				s.clear();
				System.out.println("클리어 되었습니다.");
				break;
			case 7 : 
				if(s.isEmpty()) {
					System.out.println("비어있습니다.");
				}else {
					System.out.println("비어있지 않습니다.");
				}
				break;
			case 8 : 
				if(s.ifFull()) {
					System.out.println("꽉");
				}else {
					System.out.println("안꽉참 ");
				}
				break;
			default:
				break;
			}
		}
	}

}
