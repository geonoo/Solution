package baekjoon;

public class s4678 {
    public static void main(String[] args) {
        boolean[] arr = new boolean[10100];
        for (int i = 1; i <= 10000; i++) {
            if(i < 10){
                arr[i+(i%10)] = true;
            }else if(i < 100){
                arr[i+(i/10)+(i%10)] = true;
            }else if(i < 1000){
                arr[i+(i/100)+(i%10)+((i/10)%10)] = true;
            }else{
                arr[i+(i/1000)+((i/10)%10)+(((i/10)/10)%10)+(i%10)] = true;
            }
        }

        for (int i = 1; i <= 9999 ; i++)
            if(!arr[i]) System.out.println(i);
    }
}
