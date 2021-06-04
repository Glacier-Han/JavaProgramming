import java.io.*;
import java.util.*;

class WriteTest{
	public static void main(String [] args) throws Exception{
		//"성적.txt" 파일에 학생 3명의 이름과 성적 쓰기
		
		/*
		이름 성적
		*/
		
		File file = new File("성적.txt");
		PrintWriter pw = new PrintWriter(file); //출력스트림
		
		pw.print("김준엽 ");
		pw.println("97");
		pw.print("손승현 ");
		pw.println("99");
		pw.print("옥세빈 "); //개행문자도 다 달라서 println쓰는거 추천
		pw.println("92");
		
		pw.close(); //예외발생하기때문에 close 해야함. 혹은 메인 뒤에 throws Exception 하기 (예외처리) , close() 를 함으로서 버퍼에 있는 정보 파일에 넣은 후 버퍼 비움.
		System.out.println("쓰기 완료. " + file.getName() + "을 확인하세요");
		
		
	}
}