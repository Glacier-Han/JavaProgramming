//���� �ϳ� �Է¹޾� �빮��, �ҹ���, ����, ��Ÿ���� �� ��������� ����ϱ�
import java.util.Scanner;

class InputChar{
	public static void main(String[] args){
		
		
		/*
		���ڿ� ���� �Լ� - �߰���� ������ ����
		equals() : ���ڿ� ���� ��
		equalsIgnoreCase : ���ڿ� ���� ��, ��ҹ��� ����
		charAt(index) : �ش� �ε��� ( ����, 0���ͽ���) �� ���� ��ȯ
		length() : ���ڿ��� ����
		*/
		
		Scanner s = new Scanner(System.in);
		char c;
		
		System.out.println("abc".equals("ABC")); 
		System.out.println("abc".equalsIgnoreCase("ABC")); //��ҹ��� ���� X
		
		//----------------------------------------------------------------
		
		c = s.next().charAt(0); //�߰���翡 ���ڿ� ���� �Լ� �� ����.
		
		if( c>='A' && c<='Z'){ //C�� A���� Z���� 
			System.out.println("�빮�� �Դϴ�");
		}
		
		else if( c>='a' && c<='z'){
			System.out.println("�ҹ��� �Դϴ�");
		}
		
		else if( c>='0' && c<='9' ){ //�ƽ�Ű�ڵ� 0���� 9���� ����
			System.out.println("���� �Դϴ�");
		}
		
		else {
			System.out.println("��Ÿ���� �Դϴ�");
		}
		
	}
}
