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

 class Week14Test1_P1{
   public static void main(String [] args) throws Exception{

     File f1 = new File("�л��鼺��.txt");
     File f2 = new File("���.txt");
     Scanner sc = new Scanner(f1);
     PrintWriter pw = new PrintWriter(f2);

     sc.nextLine();

     while(sc.hasNext() == true){
       String name = sc.next();
       double avr = (sc.nextInt() + sc.nextInt() + sc.nextInt()) / 3;
       pw.println(String.format("%s�� ��ռ����� %.2f�Դϴ�.",name, avr));

     }

     pw.close();
     sc.close();

     System.out.println("�Ϸ�Ǿ����ϴ�.");

   }
}
