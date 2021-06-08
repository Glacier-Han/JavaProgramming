import java.util.Scanner;
import java.io.*;
class CircleTest{
	public static void main(String [] args) throws Exception{
		if(args.length<1){
			System.out.println("[Usage]java CircleTest �������������ϸ�");
			System.exit(1);
		}
		File f1 = new File(args[0]);
		if(f1.exists()==true){
			System.out.printf("\"%s\" ������ �̹� �����մϴ�. ���ο� ���ϸ��� �Է����ּ���. \n", f1.getName());
			System.exit(2);
		}
		File f2 = new File("���� �������� ����.java");
		if(f2.exists()==false){
			System.out.printf("\"%s\" ������ �������� �ʽ��ϴ�. Ȯ�����ּ���. \n", f2.getName());
			System.exit(2);
		}
		PrintWriter pw = new PrintWriter(f1);
		Scanner s = new Scanner(f2);
	
		int radius;
		double area, rslt;
		int i=0;
		
		while(s.hasNext()){
			i++;
			radius = Integer.parseInt(s.next().substring(4));//4��° ���ں��� ������ ���� �� ���ڿ��� int Ÿ������ parse!
			area = Double.parseDouble(s.next().substring(3));//3��° ���ں��� ������ ���� �� ���ڿ��� double Ÿ������ parse!
			rslt = radius*radius*3.14;
			if(rslt==area){
				pw.format("%d��° ���� ���̴� ����� ���������ϴ�: ������(%d), ����(%.2f)\r\n", i, radius, area);
			}
			else{
				pw.format("%d��° ���� ���̴� �� �� ���߽��ϴ�: �������� %d�� ���, ���̴� %.2f�� �ƴ϶� %.2f�Դϴ�.\r\n", i, radius, area, rslt);
			}
		}

		System.out.printf("�������(%s) �����Ϸ�. Ȯ�ιٶ��ϴ�. \n", f1.getAbsolutePath());//f1.getName()�ص� ����
		
		s.close();
		pw.close();
	}
}


/*
	HINT)
	���Ͽ� ��ȿ�� �����͸� �����Ȱ� �ƴ϶� ������, ���̶�� Ű���嵵 ���� ����Ǿ� �־��. 
	��ȿ�� ������ �����ϱ� ���� String Ŭ������ substring(), ���� Ŭ������ parseInt(), parseDouble() �޼ҵ带 ����ؾ� �մϴ�. 
*/
