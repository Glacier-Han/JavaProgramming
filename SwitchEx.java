import java.util.Scanner;

class SwitchEx{
	public static void main(String[] args){
		/*
		switch(����){ //������ char, ����, ���ڿ� ��밡��
			case 1:case 3: case:5 ,,,,etc
				System.out.println("31");
				break;  //case���� �ѹ� �ɷ����� �ؿ� �ڵ� �� �����ؼ� break ����� ���� (�߰�ȣ �ʿ����)
			
			
			case 4: case 6: case8,,,,,, etc
				System.out.println("30");
			
			
			case 2
				System.out.println("28");
			
			
			default:
				System.out.println("����ε� �� �Է�");
			
			
		}
		
		*/
		
		//�Է��� �޿� �����ϴ� ���� �� ��� �ڵ� (����ġ�� ���)
		
		int year;
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵ : ");
		year = sc.nextInt();
		System.out.print("�� : ");
		month = sc.nextInt();
		
		switch(month){
			case 1:case 3:case5: case7: case9: case11: 
				System.out.println(year + "�� "+month + "���� 31�ϱ��� �ֽ��ϴ�.");
				break;
			
			case 4: case 6: case 8: case 10: case 12:
				System.out.println(year + "�� "+month + "���� 30�ϱ��� �ֽ��ϴ�.");
				break;
				
			case 2:
				if((year%4 ==0) && (year%100 != 0) || (year%400 == 0)){
					
					System.out.println(year + "�� "+month + "���� 29�ϱ��� �ֽ��ϴ�.");
				}
				else {
					System.out.println(year + "�� "+month + "���� 28�ϱ��� �ֽ��ϴ�.");
				}
				break;
			default: System.out.println("�׷� ���� �����");
				return; //�Լ� ���� (main�ܿ���)
				//System.exit(1); --> ���α׷� ����, System.exit(����); �������� : 0
		}		
		
	}
}
