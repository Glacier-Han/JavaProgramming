import java.io.*;
import java.util.*;

class ReadTest{
	public static void main(String [] args) throws FileNotFoundException{
		//"����.txt" ���Ͽ� �ۼ��� �л� 4���� �̸��� ���� �о����
		File f2 = new File("LineTest.txt");
		File f = new File("����.txt");
		int numOfStdts = 0;
		double sum = 0;
		Scanner s = new Scanner(f); //System.in -> Ű���� �д� ��Ʈ��. ���� �о������ ���ϳֱ�
		
		if(f.exists() == false){
			System.out.println(f.getName() + " ������ �������� �ʾƼ� �����մϴ�");
			System.exit(1);
		}
		
		else{
			/*
			System.out.println(s.nextLine());
			System.out.println(s.nextLine());
			System.out.println(s.nextLine());
			*/
			
			while(s.hasNext() == true){
				//���ϳ����� �����Ѵٸ�
				System.out.println(s.nextLine()); //���� ��հ���Ϸ��� �̸����� ���κҷ��;���
				s.next();
				sum += s.nextInt();
				numOfStdts++;
			}
			
			System.out.printf("%d�� �л��� ��� : %.2f\n", numOfStdts, sum/numOfStdts);
		}
	}
}	