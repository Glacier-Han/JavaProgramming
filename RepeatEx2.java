import java.util.Scanner;

class RepeatEx2{
	public static void main(String[] args){
		//�����ϳ� �Է¹޾� �״������ϰ� q�� Q�� �ԷµǸ� ���α׷�����
		
		char input;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("���� : ");
			input = sc.next().charAt(0);
			if(input == 'q' || input == 'Q')
				break;
			System.out.println("�Է��Ͻ� ���ڴ� : " + input + "�Դϴ�.");
		}
		System.out.print("���α׷��� �����մϴ�. ");
		System.exit(0);
	}
}
