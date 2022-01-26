package Programmers;
import java.util.*;

public class 압축 {

	public static void main(String[] args) {
//		KAKAO	[11, 1, 27, 15]
//		TOBEORNOTTOBEORTOBEORNOT	[20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34]
//		ABABABABABABABAB	[1, 2, 27, 29, 28, 31, 30]
		System.out.println(Arrays.toString(solution("KAKAO")));
	}
	
	static public int[] solution(String msg) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		char c = 'A';
		for (int i = 1; i < 27; i++) {
			map.put(c + "", i);
			c += 1;
		}
		int startin = 27;
		
		boolean flag = false;
		for (int i = 0; i < msg.length(); i++) {
			String word = msg.charAt(i)+"";
			while (map.containsKey(word)) {
				i++;
				if(i == msg.length()){
                    flag = true;
                    break;
                }
                word += msg.charAt(i);
            }
            if(flag){
                arr.add(map.get(word));
                break;
            }
            //현재 word에는 지금 사전에 넣을 단어이므로 뒤에서 문자 하나를 제거해야 사전에 있는 단어이다.
            arr.add(map.get(word.substring(0,word.length()-1)));
            //사전에는 현재 순서보다 +1된 값을 더한다.
            map.put(word,startin++);
            // 현재 i는 단어를 만들면서 다음문자를 가리키고 있기 때문에 -1을 해줘야 한다.
            i--;
        }

        int[] answer = new int[arr.size()];
        for(int i = 0; i<arr.size();i++){
            answer[i] = arr.get(i);
        }
		return answer;
    }

}
