import java.io.*;
import java.util.*;

/*
2.Ŀ�ǵ���ο��� �������ϸ� ���纻���ϸ��� �޾� ���������� ���纻�� ���� ��.
 ���࿹��) java CopyFile original.java copy.java
  - Ŀ�ǵ������ ���ڰ� 2���� �ƴ϶�� ����ڿ��� ������ �˸��� ���α׷� ����
  - ���������� �������� �ʴ´ٸ� �� ����� �˸��� ���α׷� ����
  - ���纻������ �̹� �����Ѵٸ� �� ����� �˸��� ���α׷� ����
  - ���� �� "����Ϸ�. ������ Ȯ�����ּ���."��� �޽��� ���
  */



  class Week14P2_2{
	  public static void main(String [] args) throws Exception{

      if(args.length != 2){
        System.out.println("����");
        System.exit(1);
      }

      File org = new File("original.java");
      File cpy = new File(args[1]);

      if(org.exists() == false ){
        System.out.println("fail. not Exists");
        System.exit(1);
      }

      Scanner sc = new Scanner(org);
      PrintWriter pw = new PrintWriter(cpy);

      while(sc.hasNext() == true){
        pw.println(sc.nextLine());
      }

      pw.close();
      sc.close();
      System.out.println("complete");
    }
  }
