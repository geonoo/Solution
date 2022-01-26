package Programmers;

import java.util.Scanner;

	public class RectangleStar {
		
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        
	        for (int i=0; i<b; i++) {
	        	if(i!=0) System.out.println("");
				for(int j=0;j<a; j++) {
					System.out.print("*");
				}
			}
	    }
	}
	
