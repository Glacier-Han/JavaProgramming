import java.util.Scanner;

class H4p2q4{
	public static void main(String[] args){
		
		int type, score;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("��: ");
			type = sc.nextInt();
			
			if(type == 1 || type == 2) {
				break;
			}
			System.out.println("[�Է¿���] 0���̻� 100�������� ���� ��ȿ");
		}
		
			
			
		while(true) {
			System.out.print("����: ");
			score = sc.nextInt();
			if(score>=0 && score <=100)
				break;
			System.out.println("[�Է¿���] 0�� �̻� 100�� ������ ���� ��ȿ�մϴ�. \n�ٽ� �Է����ּ���.");
		}
		
		if(type == 1){
				
				if(score >= 70) {
					System.out.println("�հ�");
				}
				
				else {
					System.out.println("���հ�");
				}
				
			}
			
		else {
			if(score >= 60) {
				System.out.println("�հ�");
			}
				
			else {
				System.out.println("���հ�");
			}
			
		}
	}
		
		
}
