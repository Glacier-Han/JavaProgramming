import java.util.Scanner;

class DriversLicense{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int score, type;
		
		while(true){
			System.out.print("��: ");
			type = s.nextInt();
			if(type == 1 || type ==2)
				break;
			System.out.println("[�Է¿���] 1, 2 ���� ��ȿ�մϴ�. \n�ٽ� �Է����ּ���.");
		}
		while(true){
			System.out.print("����: ");
			score = s.nextInt();
			if(score>=0 && score <=100)
				break;
			System.out.println("[�Է¿���] 0�� �̻� 100�� ������ ���� ��ȿ�մϴ�. \n�ٽ� �Է����ּ���.");
		}
		
		if(type==1){
			if(score>=70)
				System.out.println("�հ��Դϴ�.");
			else
				System.out.println("���հ��Դϴ�.");
		}else{//�� ��쿣 type�� 1, 2�� ��� �ۿ� �����Ƿ� �� else-if�� �� �ʿ䰡 ����.
			if(score>=60)
				System.out.println("�հ��Դϴ�.");
			else
				System.out.println("���հ��Դϴ�.");
		}
		
	}
}