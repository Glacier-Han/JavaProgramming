//���ǹ�
//�µ��� �Է¹޾� 32�� �̻��̸� ���� ����
//if(����){
//	������ ���̸� ������ ����;...
//	}
	
import java.util.Scanner;

class Ifstudy {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		double tmpr;
		
		System.out.print("�µ� : ");
		tmpr = s.nextDouble();
		
		if(tmpr>=32) System.out.println("�������Ǻ�");
		else System.out.println("����");
		
		//�ӵ��� �Է¹޾� 40�̻� 60�����̸� �����ӵ��Դϴ� ���. �ӵ��� ������� ���������ϼ��� ���
		
		System.out.print("�ӵ� : ");
		int speed;
		speed = s.nextInt();
		if ((speed <= 60 && speed >=40)){
			System.out.println("�����ӵ� �Դϴ�.");
		}
		else {
			System.out.println("���������ϼ���");
		}
		
		//������ �Է¹޾� ��/�� ���� ���. �հݼ��� 60��
		
		System.out.print("���� : ");
		int score;
		score = s.nextInt();
		if (score >= 60){
			System.out.println("�հ�!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
		else System.out.println("�ٽ��ض�!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
		//������ 90���̻��̸� A, 80�̻� 90�̸��� B, �����ϴ� C
		if (score >= 90) System.out.println("A �Դϴ�.");
		else if (score >= 80) System.out.println("B �Դϴ�.");
		else System.out.println("C �Դϴ�.");
		
		//�������� ����, ���� �Է¹޾� ��/�� ���� ���. 1���� ��� 70, 2���� 60���̻��� �հ�
		//nested-if (��øif��) : ���ǹ� �ȿ� ���ǹ� ����
		int cert, certs;
		System.out.println("�������� ����, ���������� �Է��ϼ���");
		cert = s.nextInt();
		certs = s.nextInt();
		
		if(cert == 1){
			if(certs >= 70) System.out.println("1�� �հ�.");
			else System.out.println("1�� ���հ�.");
		}
		
		else if(cert == 2){
			if(certs >= 60) System.out.println("2�� �հ�.");
			else System.out.println("2�� ���հ�.");
		}
		
		else System.out.println("����� �Է��ض�");
			

		
	}
}

