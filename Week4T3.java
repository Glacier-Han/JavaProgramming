//���ǹ�
//�µ��� �Է¹޾� 32�� �̻��̸� ���� ����
//if(����){
//	������ ���̸� ������ ����;...
//	}
	
import java.util.Scanner;

class Week4T3 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		double tmpr;
		
		System.out.print("�µ�");
		tmpr = s.nextDouble();
		
		if(tmpr>=32) System.out.println("�������Ǻ�");
		else System.out.println("����");
		
		//�ӵ��� �Է¹޾� 40�̻� 60�����̸� �����ӵ��Դϴ� ���. �ӵ��� ������� ���������ϼ��� ���
		
		System.out.print("�ӵ� : ");
		int speed;
		speed = s.nextInt();
		if ((speed <= 60 && speed >=40)){
		System.out.print("�����ӵ� �Դϴ�.");
		}
		else {
			System.out.print("���������ϼ���");
		}
		
	}
}

