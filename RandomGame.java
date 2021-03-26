import java.util.Scanner;
import java.util.Random;

class RandomGame {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int userInput;
		int dap;
		dap = ran.nextInt(100)+1;
		System.out.print("맞춰 보세요 : ");
		userInput = sc.nextInt();
		
		if(userInput <= dap) System.out.println("정답보다 작네요. 정답 : " + dap);
		else if(userInput >= dap) System.out.println("정답보다 크네요. 정답 : " + dap);
		else if(userInput == dap) System.out.println("정답입니다!!!!");
		
		//--------------------------------
		
		//==문자열 내용 비교 하지 않고 주소 비교함
		//문자열내용은 .equals() 로 비교 가능
		//"Hello".equals("Hi") 도 가능
		
		String cert;
		int score;
		System.out.print("운전면허 종류를 입력하시오 : ");
		cert = sc.next();
		System.out.print("운전면허 필기시험 점수를 입력하시오 : ");
		score = sc.nextInt();
		if(cert.equals("1종")){
			if(score >= 70) System.out.println("1종 합격.");
			else System.out.println("1종 불합격.");
		}
		else if(cert.equals("2종")){
			if(score >= 60) System.out.println("2종 합격.");
			else System.out.println("2종 불합격.");
		}
	}
}
		