//���� ����, x�Է¹޾� x���� ���� ���

import java.util.Scanner;

class Week4T1 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int weekday;
		int x;
		System.out.printf("���� ���� : " );
		weekday = sc.nextInt();
	
		System.out.printf("x : " );
		x = sc.nextInt();
		
		System.out.printf("���÷κ��� %d�� �Ĵ� %d �Դϴ�.",x, (weekday+x)%7 );
		
	}
}

