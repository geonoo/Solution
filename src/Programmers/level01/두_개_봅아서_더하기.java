package Programmers.level01;

import java.util.*;

public class 두_개_봅아서_더하기 {
		
    public static void main(String[] args) {
    	
//    	[2,1,3,4,1]	[2,3,4,5,6,7]
//    	[5,0,2,7]	[2,5,7,9,12]
    	
    	int[] numbers = {5,0,2,7};
    	int[] rtn = solution2(numbers);
    	for (int i = 0; i < rtn.length; i++) {
    		System.out.println(rtn[i]);
		}
    	
    	
    }

	static public int[] solution3(int[] numbers) {
		Set<Integer> ts = new TreeSet<>();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				ts.add(numbers[i]+numbers[j]);
			}
		}

		int[] anwser = new int[ts.size()];
		Iterator<Integer> it = ts.iterator();
		for (int i = 0; it.hasNext(); i++)
			anwser[i] = it.next();

		return anwser;
	}

	static public int[] solution2(int[] numbers) {
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				hs.add(numbers[i]+numbers[j]);
			}
		}

		int[] anwser = new int[hs.size()];
		Iterator<Integer> iterator = hs.iterator();
		int i = 0;
		while (iterator.hasNext()) {
			anwser[i++] = iterator.next();
		}

		Arrays.sort(anwser);

		return anwser;
	}
    
    static public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if(!list.contains(numbers[i]+numbers[j])) {
					list.add(numbers[i]+numbers[j]);
				}
			}
		}
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
        
        Arrays.sort(answer);
        
        return answer;
    }
	    
	    
}
	
