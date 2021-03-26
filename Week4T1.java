//오늘 요일, x입력받아 x일후 요일 출력

import java.util.Scanner;

class Week4T1 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int weekday;
		int x;
		System.out.printf("오늘 요일 : " );
		weekday = sc.nextInt();
	
		System.out.printf("x : " );
		x = sc.nextInt();
		
		System.out.printf("오늘로부터 %d일 후는 %d 입니다.",x, (weekday+x)%7 );
		
	}
}

