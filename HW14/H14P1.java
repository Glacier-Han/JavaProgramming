import java.io.*;
import java.util.*;

class H14P1{
  public static void main(String[] args) throws Exception{


    if(args.length == 0) {
      System.out.println("[Usage] java H14P1 결과파일");
      System.exit(1);

    }


    File f1 = new File("원의 반지름과 넓이.java");
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
        pw.println(String.format("%d번째 원의 넓이는 제대로 구해졌습니다. 반지름(%d), 넓이(%f)",count+1, radius,nul));
      }

      else {
        pw.println("아니에요");
      }

      count++;
    }

    sc.close();
    pw.close();

  }
}
