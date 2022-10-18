package Programmers;

import java.util.*;

public class test02_0918 {

    public static void main(String[] args) {
//        {{2, 3, 4, 0, 1}, {1, 4, 3, 2, 0},{4, 1, 0, 2, 3}, {3, 2, 1, 4, 0},{0, 3, 2, 1, 4}}
        int[][] orders = {{2, 3, 4, 0, 1}, {1, 4, 3, 2, 0},{4, 1, 0, 2, 3}, {3, 2, 1, 4, 0},{0, 3, 2, 1, 4}};
//        [4, 3]

//        {{2, 1, 0, 3}, {3, 2, 0, 1}, {3, 0, 2, 1}, {2, 3, 0, 1}}
//        [1, 3]
        System.out.println(Arrays.toString(solution(orders)));
    }
    static int majority;
    static String outs;
    static public int[] solution(int[][] orders) {
        int[] answer = new int[2];
        majority = (orders.length % 2 == 0) ? orders.length/2 : (orders.length+1)/2;
        outs = "";
        int vote = 0;
        List<Stack<Integer>> list = new ArrayList<>();
        for (int i = 0; i < orders.length; i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j = orders[i].length-1; j >= 0; j--) {
                stack.push(orders[i][j]);
            }
            list.add(stack);
        }

        election(list);
        System.out.println(outs);
        election(list);
        System.out.println(outs);
        return answer;
    }

    static class Vote{
        private int num;
        private int cnt;

        public Vote(int num, int cnt){
            this.num = num;
            this.cnt = cnt;
        }
    }
    static public int election(List<Stack<Integer>> list){
        List<Integer> arr = new ArrayList<>();
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i).pop();

            while (outs.indexOf(a+"") >= 0){
                a = list.get(i).pop();
            }
            arr.add(a);
        }
        Set<Integer> set = new HashSet<Integer>(arr);
        List<Vote> voteList = new ArrayList<>();
        for (Integer c : set) {
            int cnt = Collections.frequency(arr, c);
            System.out.println(c+":"+cnt);
            voteList.add(new Vote(c, cnt));
        }
        Comparator<Vote> comparator = new Comparator<Vote>() {
            @Override
            public int compare(Vote o1, Vote o2) {
                if (o1.cnt == o2.cnt){
                    return o2.num-o2.num;
                }else{
                    return o2.cnt-o1.cnt;
                }

            }
        };

        Collections.sort(voteList, comparator);
        if (voteList.get(0).cnt >= majority){
            return voteList.get(0).num;
        }

        outs += voteList.get(voteList.size()-1).num+"";
        return -1;
    }
}
