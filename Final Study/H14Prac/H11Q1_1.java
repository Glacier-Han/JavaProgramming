import java.util.*;
import java.io.*;

class H11Q1_1{
  public static void main(String [] args) throws Exception{

    if(args.length != 1) {
      System.out.println("[Usage]");
    }

    File input = new File("���� �������� ����.java");
    File output = new File(args[0]);

    if(input.exists() == false){
      System.out.println(input.getName() + "������ �������� �ʾƿ�");
      System.exit(1);
    }

    if(output.exists() == true){
      System.out.println(output.getName() + "������ �̹� �ֽ��ϴ�.");
      System.exit(2);
    }

    Scanner sc = new Scanner(input);
    PrintWriter pw = new PrintWriter(output);

    int count=0;

    while(sc.hasNext() == true){
      int radius;
      double nul;

      radius = Integer.parseInt(sc.next().substring(4));
      nul = Double.parseDouble(sc.next().substring(3));

      count++;

      if(radius*radius*3.14 == nul) {
        pw.println(String.format("%s��° ���� ���̴� ����� ���������ϴ�: ������(%d), ����(%.2f)", count, radius, nul));

      }

      else{
        pw.println(String.format("%s��° ���� ���̴� �߸� ���߽��ϴ�. �������� %d�� ��� ���̴� %.2f �� �ƴ϶� %.2f�Դϴ�.", count, radius, nul, radius*radius*3.14));

      }
    }

    sc.close();
    pw.close();
    System.out.println("���� ���� �Ϸ�");

  }
}
