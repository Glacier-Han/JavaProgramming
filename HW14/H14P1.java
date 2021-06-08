import java.io.*;
import java.util.*;

class H14P1{
  public static void main(String[] args) throws Exception{


    if(args.length == 0) {
      System.out.println("[Usage] java H14P1 �������");
      System.exit(1);

    }


    File f1 = new File("���� �������� ����.java");
    File f2 = new File(args[0]);
    Scanner sc = new Scanner(f1);
    PrintWriter pw = new PrintWriter(f2);
    int count=0;

    pw.println("test");

    while(sc.hasNext() == true){
      String s1 = sc.next();
      int radius = Integer.parseInt(s1.substring(4));
      String s2 = sc.next();
      double nul = Double.parseDouble(s2.substring(3));

      if(radius*radius*3.14 == nul){
        pw.println(String.format("%d��° ���� ���̴� ����� ���������ϴ�. ������(%d), ����(%f)",count+1, radius,nul));
      }

      else {
        pw.println("�ƴϿ���");
      }

      count++;
    }

    sc.close();
    pw.close();

  }
}
