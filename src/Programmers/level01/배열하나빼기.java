package Programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열하나빼기 {
    public static void main(String[] args) {
//        [4,3,2,1]	[4,3,2]
//[10]	[-1]
        int[] a = {4,3,2,1};
        System.out.println(Arrays.toString(solution(a)));
    }

    static public int[] solution(int[] arr) {

        int[] answer = {};

        if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[arr.length-1];
        }

        int min = arr[0];
        int idx = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
                idx = i;
            }
            list.add(arr[i]);
        }

        list.remove(idx);

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
