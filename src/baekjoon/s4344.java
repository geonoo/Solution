package baekjoon;

import java.util.Scanner;

public class s4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] rtn = new double[n];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int[] arr = new int[num];
            double sum = 0;
            for (int j = 0; j < num; j++) {
                int a = sc.nextInt();
                sum += a;
                arr[j] = a;
            }
            double avr = sum/num;
            double cnt = 0;
            for (int j = 0; j < num; j++) {
                if(avr < arr[j]){
                    cnt++;
                }
            }
            rtn[i] = (cnt/num) * 100;
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%.3f", Math.round(rtn[i]*1000)/1000.0);
            System.out.print("%\n");
        }
    }
}
