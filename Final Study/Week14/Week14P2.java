import java.util.*;
import java.io.*;

/*
1.�л��鼺��.txt ���Ͽ��� �л����� ������ �Է¹޾� �� �л��� ����� ���.txt�� ������ ��.

2.Ŀ�ǵ���ο��� �������ϸ� ���纻���ϸ��� �޾� ���������� ���纻�� ���� ��.
 ���࿹��) java CopyFile original.java copy.java
  - Ŀ�ǵ������ ���ڰ� 2���� �ƴ϶�� ����ڿ��� ������ �˸��� ���α׷� ����
  - ���������� �������� �ʴ´ٸ� �� ����� �˸��� ���α׷� ����
  - ���纻������ �̹� �����Ѵٸ� �� ����� �˸��� ���α׷� ����
  - ���� �� "����Ϸ�. ������ Ȯ�����ּ���."��� �޽��� ���
  */

class Week14P2{
  public static void main(String [] args) throws Exception{

    File input = new File("�л��鼺��.txt");
    File output = new File("���.txt");

    if(input.exists() == false){
      System.out.println("������ �����");
      System.exit(1);
    }

    if(output.exists() == true){
      System.out.println("������ �̹� �־��");
      System.exit(1);
    }

    Scanner sc = new Scanner(input);
    PrintWriter pw = new PrintWriter(output);

    sc.nextLine();

    while(sc.hasNext() == true){
      String name = sc.next();
      double avr = (sc.nextInt() + sc.nextInt() + sc.nextInt()) / 3;
      pw.println(String.format("%s �� ��ռ��� : %.2f",name,avr));
    }

    pw.close();
    sc.close();
    System.out.println("complete");
  }
}
