//조건문
//온도를 입력받아 32도 이상이면 폭염 주의
//if(조건){
//	조건이 참이면 실행할 문장;...
//	}
	
import java.util.Scanner;

class Ifstudy {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		double tmpr;
		
		System.out.print("온도 : ");
		tmpr = s.nextDouble();
		
		if(tmpr>=32) System.out.println("폭염주의보");
		else System.out.println("정상");
		
		//속도를 입력받아 40이상 60이하이면 적정속도입니다 출력. 속도에 상관없이 안전운행하세요 출력
		
		System.out.print("속도 : ");
		int speed;
		speed = s.nextInt();
		if ((speed <= 60 && speed >=40)){
			System.out.println("적정속도 입니다.");
		}
		else {
			System.out.println("안전운행하세요");
		}
		
		//점수를 입력받아 합/불 여부 출력. 합격선은 60점
		
		System.out.print("점수 : ");
		int score;
		score = s.nextInt();
		if (score >= 60){
			System.out.println("합격!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
		else System.out.println("다시해라!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
		//성적이 90점이상이면 A, 80이상 90미만은 B, 그이하는 C
		if (score >= 90) System.out.println("A 입니다.");
		else if (score >= 80) System.out.println("B 입니다.");
		else System.out.println("C 입니다.");
		
		//운전면허 몇종, 점수 입력받아 합/불 여부 출력. 1종의 경우 70, 2종은 60점이상이 합격
		//nested-if (중첩if문) : 조건문 안에 조건문 포함
		int cert, certs;
		System.out.println("운전면허 종류, 시험점수를 입력하세요");
		cert = s.nextInt();
		certs = s.nextInt();
		
		if(cert == 1){
			if(certs >= 70) System.out.println("1종 합격.");
			else System.out.println("1종 불합격.");
		}
		
		else if(cert == 2){
			if(certs >= 60) System.out.println("2종 합격.");
			else System.out.println("2종 불합격.");
		}
		
		else System.out.println("제대로 입력해라");
			

		
	}
}

