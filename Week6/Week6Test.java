import java.util.Scanner;

class Week6Test{
	public static void main(String[] args){
		//�߰����� 1,2��
		
		//�߰����� 1��
		int input,sum1;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("1���� ū ����: ");
			input = sc.nextInt();
			if(input > 1) break;
			System.out.println("[�Է¿���]1���� ū���� �Է��ϼ���.");
		}
		
		for(int i=1; i<=input/2; i++){
			System.out.print("+" + (2*i-1) + "��");
			System.out.print("-" + (2*i) + "��");
		}
		
		System.out.println("\n----------------------------");
		
		
		
		//�߰����� 2��
		int input2, count = 0;
		double sum = 0;
		double avr;
		while(true){
			System.out.print("����: ");
			input2 = sc.nextInt();
			if(input2 == 1111) break;
			if(input2%7 != 0 && input2%2 == 1) {
				sum += input2;
				count++;
			}
			
		}
		
		avr = sum/count;
		if(sum == 0) System.out.println("������ �����ϴ� Ȧ���� �����.");
		else System.out.printf("������ �����ϴ� %d���� Ȧ������ ����� %.2f�Դϴ�.",count, avr);
			
			
			
	}
}
