package Programmers.level01;

import java.util.Scanner;

	public class 직사각형_별그리기 {
		
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        
	        for (int i=0; i<n; i++) {
	        	if(i!=0) System.out.println("");
				for(int j=0;j<m; j++) {
					System.out.print("*");
				}
			}
	    }
	}
	
