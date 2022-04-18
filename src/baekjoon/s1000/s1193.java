package baekjoon.s1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s1193 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int a = Integer.parseInt(br.readLine());
        int boonmo = 1, boonja = 1, cnt = 1, len = 1, temp = 0;
        boolean check = true, check2 = true;

        while (a != cnt){
            if(check && check2){
                boonmo+=1; check = false; cnt++;
            }else if(check){
                boonja += 1; check = false; cnt++;
            }else if(check2 && len != temp){
                boonmo -=1; boonja += 1; temp++; cnt++;
            }else if(check2 && len == temp){
                check2 = false; temp = 0; len++; check = true;
            }else if(len != temp){
                boonmo +=1; boonja -= 1; temp++; cnt++;
            }else{
                check2 = true; temp = 0; len++; check = true;
            }
        }

        System.out.println(boonja+"/"+boonmo);
    }
}
