package doit.chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q7 {

	
	static class PhyscData{
		private String name;
		private int height;
		private double vision;
		
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		public String toString() {
			return name + " " + height + " " + vision;
		}
		
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData>{
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? 1 :
					   (d1.height < d2.height) ? -1 : 0;
			}
		}
		
		public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();
		
		private static class VisionOrderComparator implements Comparator<PhyscData>{
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.vision > d2.vision) ? -1 :
					   (d1.vision < d2.vision) ? 1 : 0;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		PhyscData[] x = { new PhyscData("a", 162, 1.2), new PhyscData("b", 172, 1.1), new PhyscData("d", 189, 0.1) };
		
		System.out.println("cm?");
		int height = stdIn.nextInt();
		int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);
		if(idx < 0)
			System.out.println("요소가 없습니다.");
		else {
			System.out.println("x[" + idx + "]에 있습니");
			System.out.println("찾은 데이터 : " + x[idx]);
		}
		
		System.out.println("vision?");
		double vision = stdIn.nextDouble();
		int idx2 = Arrays.binarySearch(x, new PhyscData("", 0, vision), PhyscData.VISION_ORDER);
		if(idx2 < 0)
			System.out.println("요소가 없습니다.");
		else {
			System.out.println("x[" + idx2 + "]에 있습니");
			System.out.println("찾은 데이터 : " + x[idx2]);
		} 
		
		
	}

}
