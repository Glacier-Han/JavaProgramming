import java.util.Scanner;

class Hw2p2 {
	public static void main(String[] args){
		
		int a;
		int feet;
		double inch;
		System.out.printf("Ű : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		inch = a/2.54;
		feet = (int)(inch/12);
		inch -= feet*12;
		
		System.out.printf("%d�� %d��Ʈ %f��ġ�Դϴ�.",a, feet, inch);
		
		
		//--------------------------------------------------------------
		
		int b, abs;
		System.out.printf("���� : ");
		Scanner sc2 = new Scanner(System.in);
		b = sc2.nextInt();
		if ((b & 0x80000000) == 0){
			abs = b;
			System.out.printf("%d��(��) ����Դϴ�. �̼��� ������ %d�̰�, ", b, abs);
		
		}
		else {
			abs = -b;
			System.out.printf("%d��(��) �����Դϴ�. �̼��� ������ %d�̰�, ",b ,abs);
		}
		
		System.out.printf("\n\t������ 4�� ���� ���� %d�̰�,\n\t\t�������� %d�Դϴ�.", abs>>2, abs&3);

	}
}