import java.util.Scanner;

class IfInit{
	public static void main(String[] args){
		
		/*����ڷκ��� ������ ����(int input)�� �Է� �޾� �� ���� ���� int�� ���� b�� �Ʒ��� ���� �ʱ�ȭ�Ͻÿ�
		-����� b�� 1��
		-������ b�� -1��
		-0�̸� b�� 0 ����
		*/
		int input,b;
		System.out.print("���� : ");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		if(input>0)
			b=1;
		else if(input<0)
			b= -1;
		else //else if�� ������ �̿��� ��쵵 �ִٰ� �����Ϸ��� �Ǵ�. ���ǹ��� ���ؼ� �ʱ�ȭ�� �Ҷ��� �ݵ�� else�� ��������.
			b=0;
		
		System.out.println(b);
		
	}
}
