package groom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피라미드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        input -= 1;
        if (input == 0){
            System.out.println(1);
        }
        input -= 5;
        if (input == 0){
            System.out.println(2);
        }else if(input < 0){
            System.out.println(1);
        }else{
            int n = 2;
            while (input > 0){
                int temp = (n+1)*(n+1);
                if (input - temp < 0){
                    break;
                }
                input -= temp;
                n++;
            }
            System.out.println(n);
        }
    }
}
