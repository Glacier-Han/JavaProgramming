import java.util.Scanner;

class Test2 {
	public static void main(String[] args){
		
		int a,b;
		double r;
		
		System.out.printf("���簢���� ����(����): ");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		System.out.printf("���簢���� ����(����): ");
		b = s.nextInt();
		System.out.printf("���� ������(�Ǽ�): ");
		r = s.nextDouble();
		
		System.out.printf("\n----------�ѷ� ��� ���----------\n");
		System.out.printf("���簢���� �ѷ�: %1$d(%1$#o, %1$#x)\n", 2*a+2*b);
		System.out.printf("���� �ѷ�: %.3f", 2*r*3.14);

		
		
		
		
	}
}