import java.io.*;
import java.util.*;

class ReadTest{
	public static void main(String [] args) throws FileNotFoundException{
		//"성적.txt" 파일에 작성된 학생 4명의 이름과 성적 읽어오기
		File f2 = new File("LineTest.txt");
		File f = new File("성적.txt");
		int numOfStdts = 0;
		double sum = 0;
		Scanner s = new Scanner(f); //System.in -> 키보드 읽는 스트림. 파일 읽어오려면 파일넣기
		
		if(f.exists() == false){
			System.out.println(f.getName() + " 파일이 존재하지 않아서 종료합니당");
			System.exit(1);
		}
		
		else{
			/*
			System.out.println(s.nextLine());
			System.out.println(s.nextLine());
			System.out.println(s.nextLine());
			*/
			
			while(s.hasNext() == true){
				//파일내용이 존재한다면
				System.out.println(s.nextLine()); //성적 평균계산하려면 이름점수 따로불러와야함
				s.next();
				sum += s.nextInt();
				numOfStdts++;
			}
			
			System.out.printf("%d명 학생의 평균 : %.2f\n", numOfStdts, sum/numOfStdts);
		}
	}
}	