import java.io.*;
import java.util.*;

class WriteTest{
	public static void main(String [] args) throws Exception{
		//"����.txt" ���Ͽ� �л� 3���� �̸��� ���� ����
		
		/*
		�̸� ����
		*/
		
		File file = new File("����.txt");
		PrintWriter pw = new PrintWriter(file); //��½�Ʈ��
		
		pw.print("���ؿ� ");
		pw.println("97");
		pw.print("�ս��� ");
		pw.println("99");
		pw.print("������ "); //���๮�ڵ� �� �޶� println���°� ��õ
		pw.println("92");
		
		pw.close(); //���ܹ߻��ϱ⶧���� close �ؾ���. Ȥ�� ���� �ڿ� throws Exception �ϱ� (����ó��) , close() �� �����μ� ���ۿ� �ִ� ���� ���Ͽ� ���� �� ���� ���.
		System.out.println("���� �Ϸ�. " + file.getName() + "�� Ȯ���ϼ���");
		
		
	}
}