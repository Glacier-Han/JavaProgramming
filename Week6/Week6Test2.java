import java.util.Scanner;

class Week6Test2{
	public static void main(String[] args){
		//�ݺ����ǽ����� 3,4��
		// \b�� Ŀ�� ������ ��ĭ ����
		// \r�� Ŀ�� �������� ����
		
		//3�� 
		int a, b,num, tem;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a: ");
		a = sc.nextInt();
		System.out.print("b: ");
		b = sc.nextInt();
		
		if(a>b) {
			tem = a;
			a = b;
			b = tem;
		}
		
		for(int i=a; i<=b; i++){
			System.out.printf("%d�� ���: ",i);
			for(int j=1; j<=i; j++){
				if(i%j == 0) System.out.print(j + ", ");
			}
			System.out.println("\b\b "); //�齽���� �ι��ؼ� �޸��ڸ��� �������� ó��
		}
		
		System.out.println("\n----------------------------");
		//4��
		String input;
		int count = 0;
		char c;
		
		System.out.print("���ڿ�: ");
		input = sc.nextLine();
		input = sc.nextLine();
		System.out.print("����: ");
		c = sc.next().charAt(0);
		
		for(int i=0; i<input.length(); i++){
			if(input.charAt(i) == c) {
				System.out.print((i+1) + "��° ");
				count++;
			}
		}
		
		System.out.printf("���ڿ� %s���� ���� %s�� %d�� �˻��Ǿ����ϴ�.",input,c,count);
		
		System.out.println("\n----------------------------");
		//���̾�
		int input3;
		System.out.printf("���� ��:");
		input3 = sc.nextInt();
		for(int i=1; i<=input3/2+1; i++){
			for(int s=0; s<(input3/2+1) - i; s++) System.out.print(" ");
			for(int s=0; s<2*i - 1; s++) System.out.print("*");
		
			System.out.print("\n");
		}
		for(int i=input3/2; i>0; i--){
			for(int s=(input3/2+1) - i; s>0; s--) System.out.print(" ");
			for(int s=2*i - 1; s>0; s--) System.out.print("*");
		
			System.out.print("\n");
		}
		
	}
}