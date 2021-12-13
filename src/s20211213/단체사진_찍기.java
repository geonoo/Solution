package s20211213;

public class 단체사진_찍기 {

	public static void main(String[] args) {
		
//		2	["N~F=0", "R~T>2"]	3648
//		2	["M~C<2", "C~M>1"]	0
		
		String[] data = {"N~F=0", "R~T>2"};
		
		System.out.println(solution(2, data));
		
	}
	
	static int answer = 0;
	static String[] friends = {"A", "C", "F", "J", "M", "N", "R", "T"};

    static public int solution(int n, String[] data) {
        boolean[] isVisited = new boolean[8];
        dfs("", isVisited, data);
        return answer;
    }

    static public void dfs(String names, boolean[] isVisited, String[] datas) {
        if (names.length() == 7) {
            if (check(names, datas)) { // 조건만족 체크
                answer++;
            }
            return;
        }
        for (int i = 0; i < 8; i++) { // 조합
            if (!isVisited[i]) {
                isVisited[i] = true;
                String name = names + friends[i];
                dfs(name, isVisited, datas);
                isVisited[i] = false;
            }
        }
    }

    // 조건대로 섰는지 체크
    static public boolean check(String names, String[] datas) {
        for (String data : datas) {
            int position1 = names.indexOf(data.charAt(0)); // 프렌즈 포지션1
            int position2 = names.indexOf(data.charAt(2)); // 프렌즈 포지션2
            char op = data.charAt(3); // 수식
            int index = data.charAt(4) -'0'; // 간격
            if (op == '=') {
                if (!(Math.abs(position1 - position2) == index+1)) return false; //둘 포지션 차이를 구하기 위해선 index+1 을 해야함에 주의
            } else if (op == '>') {
                if (!(Math.abs(position1 - position2) > index+1)) return false;
            } else if (op == '<') {
                if (!(Math.abs(position1 - position2) < index+1)) return false;
            }
        }
        return true;
    }

}
