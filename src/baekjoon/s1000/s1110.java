package baekjoon.s1000;

import java.util.Scanner;

public class s1110 {
//    26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다.
//    6+8 = 14이다. 새로운 수는 84이다.
//    8+4 = 12이다. 새로운 수는 42이다.
//    4+2 = 6이다. 새로운 수는 26
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int one = (num % 10)*10 + (((num / 10) + (num % 10)) % 10);
        int cnt = 1;
        while (num != one){
            one = (one % 10)*10 + (((one / 10) + (one % 10)) % 10);
            cnt++;
        }
        System.out.println(cnt);

    }
}
