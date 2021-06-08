import java.util.Scanner;
import java.io.*;
class CircleTest{
	public static void main(String [] args) throws Exception{
		if(args.length<1){
			System.out.println("[Usage]java CircleTest 결과가저장될파일명");
			System.exit(1);
		}
		File f1 = new File(args[0]);
		if(f1.exists()==true){
			System.out.printf("\"%s\" 파일이 이미 존재합니다. 새로운 파일명을 입력해주세요. \n", f1.getName());
			System.exit(2);
		}
		File f2 = new File("원의 반지름과 넓이.java");
		if(f2.exists()==false){
			System.out.printf("\"%s\" 파일이 존재하지 않습니다. 확인해주세요. \n", f2.getName());
			System.exit(2);
		}
		PrintWriter pw = new PrintWriter(f1);
		Scanner s = new Scanner(f2);
	
		int radius;
		double area, rslt;
		int i=0;
		
		while(s.hasNext()){
			i++;
			radius = Integer.parseInt(s.next().substring(4));//4번째 문자부터 끝까지 추출 후 문자열을 int 타입으로 parse!
			area = Double.parseDouble(s.next().substring(3));//3번째 문자부터 끝까지 추출 후 문자열을 double 타입으로 parse!
			rslt = radius*radius*3.14;
			if(rslt==area){
				pw.format("%d번째 원의 넓이는 제대로 구해졌습니다: 반지름(%d), 넓이(%.2f)\r\n", i, radius, area);
			}
			else{
				pw.format("%d번째 원의 넓이는 잘 못 구했습니다: 반지름이 %d일 경우, 넓이는 %.2f가 아니라 %.2f입니다.\r\n", i, radius, area, rslt);
			}
		}

		System.out.printf("결과파일(%s) 생성완료. 확인바랍니다. \n", f1.getAbsolutePath());//f1.getName()해도 무방
		
		s.close();
		pw.close();
	}
}


/*
	HINT)
	파일에 유효한 데이터만 나열된게 아니라 반지름, 넓이라는 키워드도 같이 저장되어 있어요. 
	유효한 정보만 추출하기 위해 String 클래스의 substring(), 랩퍼 클래스의 parseInt(), parseDouble() 메소드를 사용해야 합니다. 
*/
