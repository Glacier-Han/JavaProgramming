//문자 하나 입력받아 대문자, 소문자, 숫자, 기타문자 중 어떤문자인지 출력하기
import java.util.Scanner;

class InputChar{
	public static void main(String[] args){
		
		
		/*
		문자열 관련 함수 - 중간고사 나오니 보기
		equals() : 문자열 내용 비교
		equalsIgnoreCase : 문자열 내용 비교, 대소문자 무시
		charAt(index) : 해당 인덱스 ( 정수, 0부터시작) 의 문자 반환
		length() : 문자열의 길이
		*/
		
		Scanner s = new Scanner(System.in);
		char c;
		
		System.out.println("abc".equals("ABC")); 
		System.out.println("abc".equalsIgnoreCase("ABC")); //대소문자 구별 X
		
		//----------------------------------------------------------------
		
		c = s.next().charAt(0); //중간고사에 문자열 관련 함수 꼭 나옴.
		
		if( c>='A' && c<='Z'){ //C가 A부터 Z까지 
			System.out.println("대문자 입니다");
		}
		
		else if( c>='a' && c<='z'){
			System.out.println("소문자 입니다");
		}
		
		else if( c>='0' && c<='9' ){ //아스키코드 0부터 9까지 숫자
			System.out.println("숫자 입니다");
		}
		
		else {
			System.out.println("기타문자 입니다");
		}
		
	}
}
