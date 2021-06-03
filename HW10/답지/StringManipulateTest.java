import java.util.Scanner;

class StringManipulate{
	String concat(String s1, String s2){
		return s1+s2;
	}
	String toUpper(String s){
		String newString = "";//문자열은 내용 일부 변경이 불가하여 아예 새로운 문자열에 대문자로 변경한 문자열을 저장
		//내용이 없는 문자열로 초기화
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)>='a'&&s.charAt(i)<='z')
				newString += (char)(s.charAt(i)-32);
			//32는 대문자와 소문자 차이: 32 대신 ('a'-'A')로 작성해도 무방합니다. 
			//s.charAt(i)-32는 char자료-int자료 이므로 그 결과는 더 큰 자료형인 int형이 됩니다. 따라서 다시 char로 형변환해줘야합니다.  
			else 
				newString += s.charAt(i);
		}
		return newString;
	}
	boolean equals(String s1, String s2){
		if(s1.length()!=s2.length())
			return false;//길이가 다르다면 비교할 필요 없이 false 반환
		//길이가 같다면 비교 시작
		for(int i=0; i<s1.length(); i++){
			if(s1.charAt(i)!=s2.charAt(i))
				return false; //i번째 문자가 다르다면 false로 반환
		}
		//이까지 왔다면 위 반복문에서 false를 반환하고 메소드 종료되지 않았다는 말: 즉, 모든 문자가 일치한다는 말이므로 true를 반환
		return true;
	}
}

class StringManipulateTest{
	public static void main(String [] args){
		String s1, s2;
		StringManipulate sm = new StringManipulate();
		Scanner s = new Scanner(System.in);
		
		System.out.print("문장 1: ");
		s1 = s.nextLine();
		System.out.print("문장 2: ");
		s2 = s.nextLine();
		
		System.out.println("문장 1과 문장 2의 연결 결과: "+sm.concat(s1, s2));
		System.out.println("문장 1 대문자 변환 결과: "+sm.toUpper(s1));
		System.out.println("문장 1과 문장 2의 일치 여부: "+sm.equals(s1, s2));
		
	}
}