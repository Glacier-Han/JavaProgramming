//조건문
//온도를 입력받아 32도 이상이면 폭염 주의
//if(조건){
//	조건이 참이면 실행할 문장;...
//	}
	
import java.util.Scanner;

class Week4T3 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		double tmpr;
		
		System.out.print("온도");
		tmpr = s.nextDouble();
		
		if(tmpr>=32) System.out.println("폭염주의보");
		else System.out.println("정상");
		
		//속도를 입력받아 40이상 60이하이면 적정속도입니다 출력. 속도에 상관없이 안전운행하세요 출력
		
		System.out.print("속도 : ");
		int speed;
		speed = s.nextInt();
		if ((speed <= 60 && speed >=40)){
		System.out.print("적정속도 입니다.");
		}
		else {
			System.out.print("안전운행하세요");
		}
		
	}
}

