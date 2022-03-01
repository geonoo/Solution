package Programmers.level01;

public class 중간값 {
    public static void main(String[] args) {
//        "abcde"	"c"
//"qwer"	"we"
        System.out.println(solution("qwer"));
    }

    static public String solution(String s) {
        String answer = "";

        if(s.length()%2 == 0){
            answer += s.charAt(s.length()/2-1)+s.charAt(s.length()/2);
        }else answer += s.charAt(s.length() / 2);
        return answer;
    }

}
