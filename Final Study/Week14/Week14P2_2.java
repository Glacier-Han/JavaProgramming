import java.io.*;
import java.util.*;

/*
2.커맨드라인에서 원본파일명 복사본파일명을 받아 원본파일의 복사본을 만들 것.
 실행예시) java CopyFile original.java copy.java
  - 커맨드라인의 인자가 2개가 아니라면 사용자에게 사용법을 알리고 프로그램 종료
  - 원본파일이 존재하지 않는다면 그 사실을 알리고 프로그램 종료
  - 복사본파일이 이미 존재한다면 그 사실을 알리고 프로그램 종료
  - 복사 후 "복사완료. 파일을 확인해주세요."라는 메시지 출력
  */



  class Week14P2_2{
	  public static void main(String [] args) throws Exception{

      if(args.length != 2){
        System.out.println("사용법");
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
