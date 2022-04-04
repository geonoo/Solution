package baekjoon.s1000;

import java.util.Locale;
import java.util.Scanner;

public class s1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toUpperCase();
        int[] arr = new int[26];
        for(int i = 0; i<s.length(); i++){
            int a = s.charAt(i) - 'A';
            arr[a]++;
        }
        int max = 0;
        int maxIdx = 0;
        for (int i = 0; i < 26; i++) {
            if(max < arr[i]){
                max = arr[i];
                maxIdx = i;
            }
        }
        boolean check = false;
        for (int i = 0; i < 26; i++) {
            if(max == arr[i] && maxIdx != i){
                check = true;
                break;
            }
        }
        if(check){
            System.out.println("?");
        }else{
            System.out.println((char)(maxIdx + 65));
        }
    }
}
