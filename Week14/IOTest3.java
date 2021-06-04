import java.io.*;
import java.util.*;

/*
1.학생들성적.txt 파일에서 학생들의 성적을 입력받아 각 학생의 평균을 평균.txt에 저장할 것.

2.커맨드라인에서 원본파일명 복사본파일명을 받아 원본파일의 복사본을 만들 것. 
 실행예시) java CopyFile original.java copy.java
  - 커맨드라인의 인자가 2개가 아니라면 사용자에게 사용법을 알리고 프로그램 종료
  - 원본파일이 존재하지 않는다면 그 사실을 알리고 프로그램 종료
  - 복사본파일이 이미 존재한다면 그 사실을 알리고 프로그램 종료
  - 복사 후 "복사완료. 파일을 확인해주세요."라는 메시지 출력
  
3.커맨드라인에서 원본파일명 교체본파일명 구단어 신단어를 받아 원본파일에서 단어 교체 후 교체본파일에 저장할 것. 
 실행예시) java ReplaceFile original.java Replace.java System.out HELLO
  - 커맨드라인의 인자가 4개가 아니라면 사용자에게 사용법을 알리고 프로그램 종료
  - 원본파일이 존재하지 않는다면 그 사실을 알리고 프로그램 종료
  - 교체본파일이 이미 존재한다면 그 사실을 알리고 프로그램 종료
  - 복사 후 "단어 교체완료. 파일을 확인해주세요."라는 메시지 출력
  */
  
  class IOTest3{
	  public static void main(String [] args) throws Exception{
		  
		  if(args.length != 4) {
			  System.out.println("사용법 : java IOTest3 original2.txt replace2.txt hiworld HELLOWORLD");
			  System.exit(1);
		  }
		  
		  File original2, replace2;
		  original2 = new File(args[0]);
		  replace2 = new File(args[1]);
		  
		  if(original2.exists() == false){
			  System.out.println("원본파일이 없습니다.");
			   System.exit(2);
		  }
		  
		  if(replace2.exists() == true){
			  System.out.println("교체본 파일이 이미 있습니다.");
			   System.exit(3);
		  }
		  
		  Scanner sc = new Scanner(original2);
		  PrintWriter pw = new PrintWriter(replace2);
		  
		  while(sc.hasNext() == true){
			  pw.println(sc.nextLine().replaceAll(args[2], args[3]));
			  
		  }
		  
		  sc.close();
		  pw.close();
		  System.out.println("replace complete");
		  
	  }
  }
  
		  