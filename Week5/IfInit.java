import java.util.Scanner;

class IfInit{
	public static void main(String[] args){
		
		/*사용자로부터 임의의 정수(int input)을 입력 받아 그 값에 따라 int형 변수 b를 아래와 같이 초기화하시오
		-양수면 b에 1을
		-음수면 b에 -1을
		-0이면 b에 0 대입
		*/
		int input,b;
		System.out.print("정수 : ");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		if(input>0)
			b=1;
		else if(input<0)
			b= -1;
		else //else if로 끝내면 이외의 경우도 있다고 컴파일러는 판단. 조건문을 통해서 초기화를 할때는 반드시 else로 끝나야함.
			b=0;
		
		System.out.println(b);
		
	}
}
