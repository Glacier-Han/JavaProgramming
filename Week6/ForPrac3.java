import java.util.Scanner;

class ForPrac3{
	public static void main(String[] args){
		//"String".substring(a,b); --> a부터 b전까지 , 0부터시작
		
		//"abc".compareTo("abdc"); --> c,d에서 다르므로 c-d = -1
		//"abc".compareToIgnoreCase("ABC"); --> 0
		//compareTo 중요****
		
		//"HELLO, world!".replaceAll(구단어, 신단어);
		//EX) "HELLO, world!".replaceAll("HELLO", "hello"); --> "hello, world!"
		//EX) "HELLO, world!".replaceAll("HELLO", "hi"); --> "hi, world!"
		
		//toLowerCase --> 모든문자 소문자로
		//toUpperCase --> 모든문자 대문자로
		//EX) String str2 = "HELLO, world!";
		//EX) String str3 = str2.toUpperCase(); --> str2를 대문자로 변형된걸 '반환' 하기 때문에 새로운 변수에 담아줘야 의미가있음
		//EX) String str4 = str2.replaceAll("HELLO", "hi"); --> 마찬가지로 값 반환이기 때문에 새로운 변수에 담아야함.
		
		
		System.out.println("반복문 실습문제 10번");
		
		String input;
		String str;
		int a,b,tem;
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열: ");
		input = sc.nextLine();
		while(true){
			System.out.print("a: ");
			a = sc.nextInt();
			if(a>0 && a<= input.length()) break;
			System.out.println("[입력오류]");
		}
		while(true){
			System.out.print("b: ");
			b = sc.nextInt();
			if(b>0 && b<= input.length()) break;
			System.out.println("[입력오류]");
		}
		if(a>b) {
			tem = a; //임시변수에 담기
			a = b;
			b = tem;
		}
		str = input.substring(a-1, b);
		System.out.printf("입력한 문자열 %s에서 %d에서 %d까지 추출한 문자열은 %s입니다.", input, a, b, str );
		
	}
}
