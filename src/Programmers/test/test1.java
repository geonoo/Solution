package Programmers.test;

import java.util.Arrays;
import java.util.HashMap;

public class test1 {

	public static void main(String[] args) {
//		4578	[1, 4, 99, 35, 50, 1000]	2308
//		1999	[2, 11, 20, 100, 200, 600]	2798
//		1,5,10,50,100,500,1000
		int[] arr = {2, 11, 20, 100, 200, 600};
		
		System.out.println(solution(1999, arr));
	}
	
	static public int solution(int money, int[] costs) {
		int answer = 0;

		double[] m = new double[costs.length];
		m[0] = (1 - costs[0]) / 1.0;
		m[1] = (5 - costs[1]) / 5.0;
		m[2] = (10 - costs[2]) / 10.0;
		m[3] = (50 - costs[3]) / 50.0;
		m[4] = (100 - costs[4]) / 100.0;
		m[5] = (500 - costs[5]) / 500.0;

		while (money > 0){
			int maxIdx = max(m);
			switch (maxIdx){
				case 0 :
					answer += costs[0] * (money / 1);
					money -= 1 * (money / 1);
					break;
				case 1 :
					answer += costs[1] * (money / 5);
					money -= 5 * (money / 5);
					break;
				case 2 :
					answer += costs[2] * (money / 10);
					money -= 10 * (money / 10);
					break;
				case 3 :
					answer += costs[3] * (money / 50);
					money -= 50 * (money / 50);
					break;
				case 4 :
					answer += costs[4] * (money / 100);
					money -= 100 * (money / 100);
					break;
				case 5 :
					answer += costs[5] * (money / 500);
					money -= 500 * (money / 500);
					break;
				default: break;
			}
			m[maxIdx] = -6000;
		}

		return answer;
	}

	static int max(double[] m){
		double max = -6000;
		int maxIdx = 0;
		for (int i = 0; i < m.length; i++) {
			if(max < m[i]){
				max = m[i];
				maxIdx = i;
			}
		}
		return maxIdx;
	}

}
