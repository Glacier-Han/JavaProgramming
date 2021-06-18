import java.util.*;
import java.io.*;

/*
1.학생들성적.txt 파일에서 학생들의 성적을 입력받아 각 학생의 평균을 평균.txt에 저장할 것.

2.커맨드라인에서 원본파일명 복사본파일명을 받아 원본파일의 복사본을 만들 것.
 실행예시) java CopyFile original.java copy.java
  - 커맨드라인의 인자가 2개가 아니라면 사용자에게 사용법을 알리고 프로그램 종료
  - 원본파일이 존재하지 않는다면 그 사실을 알리고 프로그램 종료
  - 복사본파일이 이미 존재한다면 그 사실을 알리고 프로그램 종료
  - 복사 후 "복사완료. 파일을 확인해주세요."라는 메시지 출력
  */

class Week14P2{
  public static void main(String [] args) throws Exception{

    File input = new File("학생들성적.txt");
    File output = new File("평균.txt");

    if(input.exists() == false){
      System.out.println("파일이 없어요");
      System.exit(1);
    }

    if(output.exists() == true){
      System.out.println("파일이 이미 있어요");
      System.exit(1);
    }

    Scanner sc = new Scanner(input);
    PrintWriter pw = new PrintWriter(output);

    sc.nextLine();

    while(sc.hasNext() == true){
      String name = sc.next();
      double avr = (sc.nextInt() + sc.nextInt() + sc.nextInt()) / 3;
      pw.println(String.format("%s 의 평균성적 : %.2f",name,avr));
    }

    pw.close();
    sc.close();
    System.out.println("complete");
  }
}
