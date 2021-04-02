import java.util.Scanner;

class SwitchEx{
	public static void main(String[] args){
		/*
		switch(변수){ //변수에 char, 정수, 문자열 사용가능
			case 1:case 3: case:5 ,,,,etc
				System.out.println("31");
				break;  //case문은 한번 걸러내도 밑에 코드 다 실행해서 break 해줘야 끝남 (중괄호 필요없음)
			
			
			case 4: case 6: case8,,,,,, etc
				System.out.println("30");
			
			
			case 2
				System.out.println("28");
			
			
			default:
				System.out.println("제대로된 값 입력");
			
			
		}
		
		*/
		
		//입력한 달에 존재하는 날의 수 출력 코드 (스위치문 사용)
		
		int year;
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 : ");
		year = sc.nextInt();
		System.out.print("월 : ");
		month = sc.nextInt();
		
		switch(month){
			case 1:case 3:case5: case7: case9: case11: 
				System.out.println(year + "년 "+month + "월은 31일까지 있습니다.");
				break;
			
			case 4: case 6: case 8: case 10: case 12:
				System.out.println(year + "년 "+month + "월은 30일까지 있습니다.");
				break;
				
			case 2:
				if((year%4 ==0) && (year%100 != 0) || (year%400 == 0)){
					
					System.out.println(year + "년 "+month + "월은 29일까지 있습니다.");
				}
				else {
					System.out.println(year + "년 "+month + "월은 28일까지 있습니다.");
				}
				break;
			default: System.out.println("그런 달은 없어요");
				return; //함수 종료 (main단에서)
				//System.exit(1); --> 프로그램 종료, System.exit(정수); 정상종료 : 0
		}		
		
	}
}
