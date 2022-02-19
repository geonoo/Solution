package Programmers.test;

public class Book{
    static int cnt ; 
    int bookNo ; 

    int getBookNo(){
        return bookNo; 
    }
    static int getCnt() {
        return cnt; 
    }
    void print(){
        System.out.print(" 총 권수 :" + cnt); 
        System.out.println( " 책 번호 : "+ bookNo);
    }
    
    //답 : 스태틱으로 선언한 메소드에서는 스테틱으로 선언하지않은 필드는 불러오지 못
    static void printData(){
        System.out.print(" 총 권수 :" + cnt);
//        System.out.println( " 책 번호 : "+ bookNo); //오류
//        왜 오류가 나는지 공부하기 
    }
}