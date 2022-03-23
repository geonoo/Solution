package Programmers.level02;

public class 수학공부 {
    public static void main(String[] args) {
//15	4
        System.out.println(solution(15));


    }

    static public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <=n ; j++) {
                sum +=j;
                if(sum == n){
                    answer++;
                    break;
                }else if(sum > n){
                    break;
                }
            }
        }

        return answer;
    }
}
