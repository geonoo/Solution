package Programmers.test;

public interface Moveable {
	int move();
    int stop();
}

class Ball implements Moveable{

	@Override
	public int move() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int stop() {
		// TODO Auto-generated method stub
		return 0;
	}
//    int move(){
//        System.out.println("공이 움직인다.");
//    }
//    int stop(){
//        System.out.println("공이 멈춘다.");
//    }
}
