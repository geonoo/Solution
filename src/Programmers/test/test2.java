package Programmers.test;

import java.util.Arrays;

public class test2 {

	public static void main(String[] args) {
		
		String[] records = {"john share", "mary share", "jay share", "james comment", "lee share", "check notification", "sally comment", "laura comment", "check notification", "will share", "ruby share", "check notification"};
		
//		[jay shared your post, mary commented on your post, james shared your post, lee and 2 others shared your post, sally and alice commented on your post]
//		[jay shared your post, mary commented on your post, james shared your post, lee and 2 others shared your post, sally and alice commented on your post]
		
//		["john share", "mary share", "jay share", "james comment", "lee share", "check notification", "sally comment", "laura comment", "check notification", "will share", "ruby share", "check notification"]
		
		
//		[lee shared your post, james and 2 others commented on your post, john and 4 others shared your post]
//		[lee shared your post, james and 2 others commented on your post, john and 4 others shared your post]
//		
		System.out.println(Arrays.toString(solution(records)));
		
	}
	
//	알림은 한 줄에 하나씩 표시되며, 나중에 생성된(즉, 더 최근에 발생한) 알림일 수록 아래쪽에 표시됩니다.
//	이때, 당신은 알림창에서 가장 최근(가장 밑에 있는) 알림부터 한 번에 하나씩 보관함으로 이동할 수 있습니다.
//	A and B commented on your post", "A and B shared your post"와 같이 표시합니다.
//	"A and N others shared your post", "A and N others commented on your post"와 같이 표시합니다.
	
//	보관함을 리턴시킨다.
	
	static String arim = "";
    static String bogan = "";
	static public String[] solution(String[] records) {
        
        for (int i = 0; i < records.length; i++) {
        	String[] tmp = records[i].split(" ");
        	logic(tmp);
//        	System.out.println("arim : " + arim);
//        	System.out.println("bogan : " + bogan);
        }
        
        String answer[] = bogan.split("\\|");
        
		return answer;
	}
	
	static public void logic(String[] tmp) {
		if(arim.isEmpty()) {
			if(tmp[1].equals("share")) {
				arim += tmp[0] + " shared your post|";
			}else if(tmp[1].equals("comment")) {
				arim += tmp[0] + " commented on your post|";
			}
		}else {
			if(tmp[1].equals("share")) {
				String[] a = arim.substring(0, arim.length()-1).split("\\|");
				if(a[a.length-1].contains("share")) {
					arim = "";
					for (int j = 0; j < a.length-1; j++) {
						arim += a[j] + "|";
					}
					if(a[a.length-1].contains("others")) {
						arim += a[a.length-1].split(" ")[0] + " and " + (Integer.parseInt(a[a.length-1].split(" ")[2])+1) + " others shared your post|";
					}else {
						if(a[a.length-1].contains("and")) {
							arim += a[a.length-1].split(" ")[0] + " and " + 2 + " others shared your post|";
						}else {
							arim += a[a.length-1].split(" ")[0] + " and " + tmp[0] + " shared your post|";
						}
					}
				}else if(a[a.length-1].contains("comment")) {
					arim +=  tmp[0]+" shared your post|";
				}
				
			}else if(tmp[1].equals("comment")) {
				String[] a = arim.substring(0, arim.length()-1).split("\\|");
				if(a[a.length-1].contains("share")) {
					arim +=  tmp[0]+" commented on your post|";
				}else if(a[a.length-1].contains("comment")) {
					arim = "";
					for (int j = 0; j < a.length-1; j++) {
						arim += a[j] + "|";
					}
					if(a[a.length-1].contains("others")) {
						arim += a[a.length-1].split(" ")[0] + " and " + (Integer.parseInt(a[a.length-1].split(" ")[2])+1) + " others commented on your post|";
					}else {
						if(a[a.length-1].contains("and")) {
							arim += a[a.length-1].split(" ")[0] + " and " + 2 + " others commented on your post|";
						}else {
							arim += a[a.length-1].split(" ")[0] + " and " + tmp[0] + " commented on your post|";
						}
					}
				}
			}else {
				String[] a = arim.substring(0, arim.length()-1).split("\\|");
				arim = "";
				for (int j = 0; j < a.length-1; j++) {
					arim += a[j] +"|";
				}
				bogan += a[a.length-1] +"|";
			}
		}
			
	}
}
