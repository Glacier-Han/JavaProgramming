//����ڷκ��� �Ǽ� �ϳ��� �Է� �ް�, �Է� ���� �Ǽ��� ������ �κ��� ���񰪰�, �� ���񰪿� ��8��
//���� ��, 8�� ���� ���� �곪������ ����Ͻÿ�.
//- ��Ʈ �����ڸ� ����� ��(*, /, % ������� �� ��).
//- �Է� ���� ���� ������� �������� Ȯ���ϴ� �������� �ε�ȣ ������� �� ��.
//- Hint. ĳ����(Casting, �� ��ȯ)�� ������ Ȱ���� ��.

import java.util.*;
class Tes123{
	public static void main(String[] args){
		System.out.print("�Ǽ�: ");
		double a;
		int inta;
		int absa;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();

		inta = (int)a;
		absa = (int)a*-1;
		if(inta>>31 == 0){
			System.out.printf("%d, %d, %d, %d\n",inta,inta<<3,inta>>3,inta&3);
		}

		else System.out.printf("%d, %d, %d, %d\n",absa,absa<<3,absa>>3,absa&3);
  }
}
