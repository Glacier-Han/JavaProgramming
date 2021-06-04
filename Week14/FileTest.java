import java.io.*;
import java.util.*;

class FileTest{
	public static void main(String [] args){
		File f1 = new File("file_ex_1.txt"); //����� : ���� ��θ� �Ϻθ� �ۼ�, �� Ŭ������ ��ġ�ϴ� ������ �ش� ������ ã��
		System.out.println("������ �ֽ��ϱ�? : " + f1.exists());
		
		System.out.println();
		
		File f2 = new File("C:\\Users\\PC00\\Desktop\\Week14\\ExampleFiles\\file_ex_1.txt");  //������ : �ش����� ��� ���� �ۼ�. \\ �ι� �ؾ��� \�ϳ��� �ν�
		System.out.println("������ �ֽ��ϱ�? : " + f2.exists());
		
		System.out.println();

		File f3 = new File("ExampleFiles\\file_ex_1.txt"); //�������� /�� ����Ŭ������ ��Ÿ���� ������� \�� ��Ÿ��. (�÷����� ������� �Ұ�)
		System.out.println("������ �ֽ��ϱ�? : " + f3.exists());
		
		System.out.println();
		
		File dire = new File("ExampleFiles");
		System.out.println("������ �̸���?: " + dire.getName());
		System.out.println("�����Դϱ�? : " + dire.isDirectory());
		
		System.out.println();
		
		File f4 = new File("ExampleFiles" + File.separator + "file_ex_1.txt"); //�̷��� File.separator ����ϸ� �÷����� ����
		System.out.println("������ �ֽ��ϱ�? : " + f4.exists());
		System.out.println("������ �̸���?: " + f4.getName());
		System.out.println("������ ũ���? : " + f4.length() + "B");
		System.out.println("�����Դϱ�? : " + f4.isDirectory());
		System.out.println("���� ������ ������? : " + new Date(f4.lastModified()));
		
		
		System.out.println();
		

		
	}
}
