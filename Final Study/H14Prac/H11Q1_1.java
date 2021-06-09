import java.util.*;
import java.io.*;

class H11Q1_1{
  public static void main(String [] args) throws Exception{

    if(args.length != 1) {
      System.out.println("[Usage]");
    }

    File input = new File("원의 반지름과 넓이.java");
    File output = new File(args[0]);

    if(input.exists() == false){
      System.out.println(input.getName() + "파일이 존재하지 않아요");
      System.exit(1);
    }

    if(output.exists() == true){
      System.out.println(output.getName() + "파일이 이미 있습니다.");
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
        pw.println(String.format("%s번째 원의 넒이는 제대로 구해졌습니다: 반지름(%d), 넓이(%.2f)", count, radius, nul));

      }

      else{
        pw.println(String.format("%s번째 원의 넒이는 잘못 구했습니다. 반지름이 %d인 경우 넓이는 %.2f 가 아니라 %.2f입니다.", count, radius, nul, radius*radius*3.14));

      }
    }

    sc.close();
    pw.close();
    System.out.println("파일 생성 완료");

  }
}
