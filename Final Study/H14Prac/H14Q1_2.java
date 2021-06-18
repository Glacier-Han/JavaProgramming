import java.util.*;
import java.io.*;

class H14Q1_2{
  public static void main(String [] args) throws Exception{
    if(args.length == 0){
      System.out.println("����");
      System.exit(1);
    }

    File input = new File("���� �������� ����.java");
    File output = new File(args[0]);

    if(output.exists() == true){
      System.out.println("������ �̹� �ֽ��ϴ�.");
      System.exit(1);
    }

    Scanner sc = new Scanner(input);
    PrintWriter pw = new PrintWriter(output);

    int count = 0;

    while(sc.hasNext() == true){
      int radius;
      double nul;
      radius = Integer.parseInt(sc.next().substring(4));
      nul = Double.parseDouble(sc.next().substring(3));

      count++;

      if(radius*radius*3.14 == nul) {
        pw.println(String.format("%d��° ���� ���̴� ����� ���������ϴ� : ������ %d, ���� %.2f",count, radius, nul));
      }

      else {
        pw.println(String.format("%d��° ���� ���̴� �߸����߽��ϴ�. �������� %d�� ��� ���̴� %.2f�Դϴ�.",count, radius,radius*radius*3.14));
      }

    }

    pw.close();
    sc.close();
    System.out.printf("(%s) ���� �Ϸ�.", output.getAbsolutePath());
  }
}
