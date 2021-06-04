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
  
  class IOTest2{
	  public static void main(String [] args) throws Exception{
		  
		  if(args.length != 2) {
			  System.out.println("���� : java IOTest2 original.txt copy.txt");
			  System.exit(1);
		  }
		  	  
		  File original, copy;
		  original = new File(args[0]);
		  copy = new File(args[1]);
		  
		  if(original.exists() == false){
			   System.out.println("�������� " + original.getName() + "�� �������� �ʾ� ���α׷� �����ؿ�");
			   System.exit(2);
		  }
		  
		  if(copy.exists() == true){
			   System.out.println("���纻���� " + copy.getName() + "�� �̹� �����Ͽ� ���α׷� �����ؿ�");
			   System.exit(3);
		  }
		 
		  Scanner sc = new Scanner(original); //�������� �б�� ��Ʈ��
		  PrintWriter pw = new PrintWriter(copy); //���纻���� ����� ��Ʈ��
		  
		  while(sc.hasNext() == true){
			pw.println(sc.nextLine());
		  }
		  
		  pw.close();
		  sc.close();
		  System.out.println("���� �Ϸ�");
			
		  
		 
		 
			  
	  }
  }