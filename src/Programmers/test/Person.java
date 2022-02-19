package Programmers.test;

public class Person {
	int no = 10; 
    String name ; 
    
    //왜 호출되는지 공부하기
    Person(int no){
        this.no = no;
        System.out.println("Person(int no) 호출됨 ");
    }
    
    Person(int no, String name){
    	//해당 코드떄문에 첫번째 메소드가 사용됌
        this(no); 
        this.name = name; 
        System.out.println("Person(int no, String name) " +
                "호출됨 ");
    }
    
    
    public static void main(String[] args) {
        Person one = new Person(100,"김철수"); 
        System.out.println(one.no);
    }
}



