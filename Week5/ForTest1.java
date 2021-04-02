import java.util.Scanner;

class ForTest1{
	public static void main(String[] args){
		
		String input;
		int leng ;
		int lenginput;
		char resu;
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		input = sc.nextLine();
		leng = (int)input.length();
		
		while(true){
			System.out.print("x : ");
			lenginput = sc.nextInt();
			if(lenginput > 0){
				if(lenginput <= leng)
				break;	
			}
			
			System.out.println("[입력오류] x는 문자열의 길이 이하의 양의 정수만 유효합니다.");
		}
		resu = input.charAt(lenginput-1);
		System.out.println("입력하신 문자열 " + input + "에서 " + lenginput + "번 째 문자는 '" + resu +"' 입니다 ");
		
		
	}
}
