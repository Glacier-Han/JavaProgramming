import java.util.Scanner;

class PrintNbr{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int userInput, qou;
		String rslt;
		
		System.out.print("1�� �̸��� ����: ");
		userInput = s.nextInt();
		
		qou = userInput/10000; //���� ����Ͽ� ����� �뵵
		userInput %=10000; //���� ������ �������� ������ õ, ��, �� ������ �ٽ� ���� ����ؾ� �ϹǷ� ���� ����
		
		rslt = qou>1?qou+"�� ":(qou==1?"�� ":"");
		//���� 1���� ũ�ٸ�(��: 321509) �� "�� " ���� �������� ����(32��) 
		//�ƴ϶�� ���� 1���� �ƴϸ� �ƿ� ���� �� �Ǵ�
			//���� 1�̶�� ������ "�� "���� ����
			//���� 0�̶�� �� �������� ����
		System.out.print(rslt);
		
		qou = userInput/1000; 
		userInput %=1000;
		rslt = qou>1?qou+"õ ":(qou==1?"õ ":"");
		System.out.print(rslt);
		
		qou = userInput/100; 
		userInput %=100;
		rslt = qou>1?qou+"�� ":(qou==1?"�� ":"");
		System.out.print(rslt);
		
		qou = userInput/10; 
		userInput %=10;
		rslt = qou>1?qou+"�� ":(qou==1?"�� ":"");
		System.out.print(rslt);
		System.out.printf("%s\n", userInput!=0?userInput:"");
		
		/*
	//	�Ǵ� �Ʒ��� ���� ������ ���Ḹ �ϰ� �������� �ѹ��� ����ϴ� �͵� ����
		Scanner s = new Scanner(System.in);
		int userInput, qou;
		String rslt;
		
		System.out.print("1�� �̸��� ����: ");
		userInput = s.nextInt();
		
		qou = userInput/10000; //���� ����Ͽ� ����� �뵵
		userInput %=10000; //���� ������ �������� ������ õ, ��, �� ������ �ٽ� ���� ����ؾ� �ϹǷ� ���� ����
		
		rslt = qou>1?qou+"�� ":(qou==1?"�� ":"");
		//���� 1���� ũ�ٸ�(��: 321509) �� "�� " ���� �������� ����(32��) 
		//�ƴ϶�� ���� 1���� �ƴϸ� �ƿ� ���� �� �Ǵ�
			//���� 1�̶�� ������ "�� "���� ����
			//���� 0�̶�� �� �������� ����
		
		qou = userInput/1000; 
		userInput %=1000;
		rslt += qou>1?qou+"õ ":(qou==1?"õ ":"");
		
		qou = userInput/100; 
		userInput %=100;
		rslt += qou>1?qou+"�� ":(qou==1?"�� ":"");
		
		qou = userInput/10; 
		userInput %=10;
		rslt += qou>1?qou+"�� ":(qou==1?"�� ":"");
		rslt += userInput!=0?userInput:"";
		
		System.out.println(rslt);
		
		*/
	}
}