package baekjoon;

import java.util.Scanner;

public class s10871 {
//    10 5
//    1 10 4 9 2 3 8 5 7 6
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int x = sc.nextInt();

        for (int i = 0; i < len; i++) {
            int a = sc.nextInt();
            if(a < x){
                System.out.print(a+" ");
            }
        }
    }


}
