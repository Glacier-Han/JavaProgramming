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

 class Week14Test2_P1{
   public static void main(String [] args) throws Exception{

     if(args.length != 4){
       System.out.println("[����]");
       System.exit(1);
     }

     File origin = new File("original.java");
     File replace = new File("Replace.java");


     if(replace.exists() == true) {
       System.out.println("already");
       System.exit(1);
     }

     if(origin.exists() == false) {
       System.out.println("nofile");
       System.exit(1);
     }

     Scanner sc = new Scanner(origin);
     PrintWriter pw = new PrintWriter(replace);

     while(sc.hasNext() == true){
       pw.println(sc.nextLine().replaceAll(args[2], args[3]));

     }

     sc.close();
     pw.close();
     System.out.println("Complete");
   }
 }
