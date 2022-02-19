package Programmers.test;

public class Ex{
    public static void main(String args[]) {
        try {
//            m1(10, 0);
            System.out.print("a");
        } catch (Exception e) {
            System.out.print("b");
        } finally {
            System.out.print("c");
        }
        System.out.println("d");
    }
    
    public static int m1(int data1, int data2) throws Exception {
//    	해당 메소드를 쓰는 모든 상위 메소드에 예외처리 또는 같은 throws 처리를 해주어야 한다.
        return m2(data1, data2);
    }
    
    public static int m2(int data1, int data2) throws Exception {
        int result = data1 / data2;
        return result;
    }
}
