import java.util.Scanner;

class HW2p1 {
	public static void main(String[] args){
		
		int cm;
		
		System.out.print("Ű : ");
		Scanner s = new Scanner(System.in);
		cm = s.nextInt();
		
		System.out.printf("%dcm�� %d��Ʈ %f��ġ �Դϴ�.",cm,(int)(cm/2.54/12) ,cm/2.54);
		
		//-------------------------------------------------------2
		
		System.out.println();
		int num;
		int juldae;
		String pm;
		Scanner s2 = new Scanner(System.in);
		System.out.print("���� : ");
		num = s2.nextInt();
		
		if ((num & 0x80000000) == 0){
			pm = "���";
			juldae = num;
		}
		else {
			pm = "����";
			juldae = -1*num;
			
		}
		System.out.printf("\"%d��(��) %s�Դϴ�. �� ���� ������ %d�̰�,\n\t������ 4�� ���� ���� %d�̰�,\n\t\t�������� %d�Դϴ�.\"",num, pm, juldae, juldae/4, juldae%4);
	}
}
		