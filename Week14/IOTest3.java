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
  
  class IOTest3{
	  public static void main(String [] args) throws Exception{
		  
		  if(args.length != 4) {
			  System.out.println("���� : java IOTest3 original2.txt replace2.txt hiworld HELLOWORLD");
			  System.exit(1);
		  }
		  
		  File original2, replace2;
		  original2 = new File(args[0]);
		  replace2 = new File(args[1]);
		  
		  if(original2.exists() == false){
			  System.out.println("���������� �����ϴ�.");
			   System.exit(2);
		  }
		  
		  if(replace2.exists() == true){
			  System.out.println("��ü�� ������ �̹� �ֽ��ϴ�.");
			   System.exit(3);
		  }
		  
		  Scanner sc = new Scanner(original2);
		  PrintWriter pw = new PrintWriter(replace2);
		  
		  while(sc.hasNext() == true){
			  pw.println(sc.nextLine().replaceAll(args[2], args[3]));
			  
		  }
		  
		  sc.close();
		  pw.close();
		  System.out.println("replace complete");
		  
	  }
  }
  
		  