import java.io.*;
import java.util.*;

/*
1.�л��鼺��.txt ���Ͽ��� �л����� ������ �Է¹޾� �� �л��� ����� ���.txt�� ������ ��.

2.Ŀ�ǵ���ο��� �������ϸ� ���纻���ϸ��� �޾� ���������� ���纻�� ���� ��. 
 ���࿹��) java CopyFile original.java copy.java
  - Ŀ�ǵ������ ���ڰ� 2���� �ƴ϶�� ����ڿ��� ������ �˸��� ���α׷� ����
  - ���������� �������� �ʴ´ٸ� �� ����� �˸��� ���α׷� ����
  - ���纻������ �̹� �����Ѵٸ� �� ����� �˸��� ���α׷� ����
  - ���� �� "����Ϸ�. ������ Ȯ�����ּ���."��� �޽��� ���
  
3.Ŀ�ǵ���ο��� �������ϸ� ��ü�����ϸ� ���ܾ� �Ŵܾ �޾� �������Ͽ��� �ܾ� ��ü �� ��ü�����Ͽ� ������ ��. 
 ���࿹��) java ReplaceFile original.java Replace.java System.out HELLO
  - Ŀ�ǵ������ ���ڰ� 4���� �ƴ϶�� ����ڿ��� ������ �˸��� ���α׷� ����
  - ���������� �������� �ʴ´ٸ� �� ����� �˸��� ���α׷� ����
  - ��ü�������� �̹� �����Ѵٸ� �� ����� �˸��� ���α׷� ����
  - ���� �� "�ܾ� ��ü�Ϸ�. ������ Ȯ�����ּ���."��� �޽��� ���
  */
  
  class IOTest1{
	  public static void main(String [] args) throws Exception{
				  
		  //1��
		  String name;
		  int numOfSt = 0;
		
		  File f1 = new File("�л��鼺��.txt");
		  File f2 = new File("���.txt");
		  Scanner s1 = new Scanner(f1);
		  PrintWriter pw1 = new PrintWriter(f2);
		  
		  s1.nextLine();
		  
		  while(s1.hasNext() == true){
			  double sum = 0; 
			  double aver = 0;
			  int sumcount = 0;
			  name = s1.next();
			  while(s1.hasNextInt() == true){
				  sum += s1.nextInt();
				  sumcount++;
			  }
			 
			  aver = sum/sumcount;
			  
			  System.out.printf("%s�� ���� ����� %.2f �Դϴ�.\n", name, aver);
			  
			  //pw1.printf("%s�� ���� ����� %.2f �Դϴ�.\n", name, aver); (�ü�� ���� ���๮�ڰ� �ٸ��⶧���� println + String.format ��� ��õ)
			  pw1.println(String.format("%s�� ���� ����� %.2f �Դϴ�.", name, aver));
			  numOfSt++;
		  }
		  
		  pw1.close();
		  System.out.println("��� �ۼ� �Ϸ�.");
		  
		  
		  
	  }
  }
  
  
  
  
  