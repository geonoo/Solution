package Programmers;

import java.util.*;

public class 구명보트 {

	public static void main(String[] args) {
		
		int[] people = {70, 50, 80};
		int limit = 100;
		
		System.out.println(solution(people, limit));
	}
	
//	[70, 50, 80, 50]	100	3
//	[70, 80, 50]	100	3
	static public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int min = 0;
        
        for (int max = people.length - 1; min <= max; max--){
            if (people[min] + people[max] <= limit) min++;
            answer++;
        }
        
        return answer;
    }

}
