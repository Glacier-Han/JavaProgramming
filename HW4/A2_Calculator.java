import java.util.Scanner;

class Calculator{
	public static void main(String [] args){
		double a, b, result;
		String operator;
		Scanner s = new Scanner(System.in);
		
		System.out.print("식을 입력하세요(ex. 7 + 4): ");
		a = s.nextDouble();
		operator = s.next();
		b = s.nextDouble();
		
		switch(operator){
		case "+":
			result = a+b;
			break;
		case "-":
			result = a-b;
			break;
		case "*":
			result = a*b;
			break;		
		case "/":
			if(b==0){
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(1);
			}
			result = a/b;
			break;				
		case "%":
			if(b==0){
				System.out.println("0으로 나눈 나머지는 구할 수 없습니다.");
				System.exit(2);
			}
			result = a%b;
			break;
		default: 
			result = 0xffffffff;//조건문을 통해 초기화하므로 의미는 없지만 형식상 result를 초기화
			System.out.println("+, -, *, /, % 연산만 지원합니다. ");
			System.exit(3);
		}
		
		if(result==(int)result) System.out.println((int)result);
		else System.out.printf("%.2f\n", result);	
	}
}