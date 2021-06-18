import java.util.*;
import java.io.*;

class H14Q1_2{
  public static void main(String [] args) throws Exception{
    if(args.length == 0){
      System.out.println("사용법");
      System.exit(1);
    }

    File input = new File("원의 반지름과 넓이.java");
    File output = new File(args[0]);

    if(output.exists() == true){
      System.out.println("파일이 이미 있습니다.");
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
        pw.println(String.format("%d번째 원의 넓이는 제대로 구해졌습니다 : 반지름 %d, 넓이 %.2f",count, radius, nul));
      }

      else {
        pw.println(String.format("%d번째 원의 넓이는 잘못구했습니다. 반지름이 %d인 경우 넓이는 %.2f입니다.",count, radius,radius*radius*3.14));
      }

    }

    pw.close();
    sc.close();
    System.out.printf("(%s) 생성 완료.", output.getAbsolutePath());
  }
}
