import java.util.Scanner;

class Week4T2 {
	public static void main(String[] args){
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.printf("���� �ΰ��� �Է��Ͻÿ�");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.printf("max : %d", a>b?a:b);
		System.out.printf("�Է��Ͻ� �� ���� %d, %d�̸�, �ִ�� %s�� �� �Դϴ�.", a,b,(a>b?"��":(a==b?"����":"��")));

	}
}