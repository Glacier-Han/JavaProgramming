import java.util.Scanner;

class RepeatEx2{
	public static void main(String[] args){
		//문자하나 입력받아 그대로출력하고 q나 Q가 입력되면 프로그램종료
		
		char input;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("문자 : ");
			input = sc.next().charAt(0);
			if(input == 'q' || input == 'Q')
				break;
			System.out.println("입력하신 문자는 : " + input + "입니다.");
		}
		System.out.print("프로그램을 종료합니다. ");
		System.exit(0);
	}
}
