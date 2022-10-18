package Programmers;

import java.util.*;

public class test01_0918 {

    public static void main(String[] args) {
        String[] students = {"ALALLAAPAA", "ALLLAAAPAA", "APAPALLAAA"};
        //[3, 1, 2]

        // {"ALALLAAPAA", "ALLLAAAPAA", "APAPALLAAA"}
        // [1, 2, 3]
        System.out.println(Arrays.toString(solution(students)));
    }

    static public class Attendance {
        private int num;
        private int score;

        public Attendance(int num, int score){
            this.num = num;
            this.score = score;
        }
    }

    static public int[] solution(String[] students) {
        int[] answer = new int[students.length];
        List<Attendance> list = new ArrayList<>();
        for (int i = 0; i < students.length; i++) {
            int score = 10;
            int A = countChar(students[i], 'A');
            int L = countChar(students[i], 'L');
            int P = countChar(students[i], 'P');

            score += A;
            P += L/2;
            score -= P;

            if (P >= 3)
                score = 0;
            list.add(new Attendance(i+1, score));
        }
        Comparator<Attendance> comparator = new Comparator<Attendance>() {
            @Override
            public int compare(Attendance o1, Attendance o2) {
                if (o1.score == o2.score){
                    return o1.num - o2.num;
                }else{
                    return o2.score - o1.score;
                }
            }
        };

        Collections.sort(list, comparator);

        int i = 0;
        for (Attendance attendance : list){
            answer[i++] = attendance.num;
        }

        return answer;
    }

    public static int countChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
