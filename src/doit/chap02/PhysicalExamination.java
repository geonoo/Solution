package doit.chap02;

import java.util.Arrays;
import java.util.Scanner;

public class PhysicalExamination {
	
	static final int VMAX = 21;
	
	static class PhyscData {
		String name;
		int height;
		double vision;
		
		PhyscData(String name, int height, double vision){
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	//평균 키 
	static double aveHeight(PhyscData[] dat) {
		double sum = 0;
		
		for (int i = 0; i < dat.length; i++) {
			sum += dat[i].height;
		}
		return sum / dat.length;
	}
	//시력 분포 
	static void distVision(PhyscData[] dat, int[] dist) {
		int i = 0;
		
		dist[i] = 0;
		for (i = 0; i < dat.length; i++) {
			if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
				dist[(int)(dat[i].vision * 10)]++;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		PhyscData[] x = {
				new PhyscData("ABC", 161, 0.4),
				new PhyscData("DEF", 161, 0.4),
				new PhyscData("GHI", 161, 0.5),
				new PhyscData("JKL", 161, 1.5),
				new PhyscData("MNO", 161, 0.7),
				new PhyscData("PQR", 161, 0.8),
				new PhyscData("STU", 161, 1.3)
		};
		int[] vdist = new int[VMAX];
		
		System.out.println("신체검사 리스트 ");
		System.out.println("이름       키   시력");
		System.out.println("---------------------");
		for (int i = 0; i < x.length; i++) {
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
		}
		
		System.out.printf("\n평균 키 : %5.1fcm\n", aveHeight(x));
		
		distVision(x, vdist);
		
		System.out.println("\n시력 분포 ");
		for (int i = 0; i < VMAX; i++) {
			System.out.printf("%3.1f~:%2d명\n", i / 10.0, vdist[i]);
		}
		
		System.out.println(Arrays.toString(vdist));
		
	}
}
