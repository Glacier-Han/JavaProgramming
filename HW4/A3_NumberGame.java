import java.util.*;

class NumberGame{
	public static void main(String [] args){
		int usr, randomNbr, cnt = 0;
		//usr: 사용자가 입력한 예측값
		//randomNbr: 프로그램에서 생성한 난수 
		//cnt: 사용자 예측 시도 횟수 
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		//난수 생성
		randomNbr = r.nextInt(101)-50;
		System.out.println(randomNbr);
		
		
		//사용자로부터 예측값 입력받기: 일치할때까지
		while(true){
			System.out.print("예측값: ");
			usr = s.nextInt();
			cnt++;//사용자로가 입력한다면 시도 횟수 한번 증가
			if(usr==randomNbr) //생성값과 입력값이 일치한다면 탈출
				break; 
			else if(usr>randomNbr) 
				System.out.println("랜덤 넘버는 좀 더 작은 값입니다. 다시 시도해주세요. ");
			else 
				System.out.println("랜덤 넘버는 좀 더 큰 값입니다. 다시 시도해주세요. ");
		}
		
		System.out.printf("정답입니다. 총 %d회만에 맞추셨습니다.\n", cnt);
	}
}