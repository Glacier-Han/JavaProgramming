import java.util.Scanner;
import java.util.Random;

class RandomGame {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int userInput;
		int dap;
		dap = ran.nextInt(100)+1;
		System.out.print("���� ������ : ");
		userInput = sc.nextInt();
		
		if(userInput <= dap) System.out.println("���亸�� �۳׿�. ���� : " + dap);
		else if(userInput >= dap) System.out.println("���亸�� ũ�׿�. ���� : " + dap);
		else if(userInput == dap) System.out.println("�����Դϴ�!!!!");
		
		//--------------------------------
		
		//==���ڿ� ���� �� ���� �ʰ� �ּ� ����
		//���ڿ������� .equals() �� �� ����
		//"Hello".equals("Hi") �� ����
		
		String cert;
		int score;
		System.out.print("�������� ������ �Է��Ͻÿ� : ");
		cert = sc.next();
		System.out.print("�������� �ʱ���� ������ �Է��Ͻÿ� : ");
		score = sc.nextInt();
		if(cert.equals("1��")){
			if(score >= 70) System.out.println("1�� �հ�.");
			else System.out.println("1�� ���հ�.");
		}
		else if(cert.equals("2��")){
			if(score >= 60) System.out.println("2�� �հ�.");
			else System.out.println("2�� ���հ�.");
		}
	}
}
		