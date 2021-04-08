import java.util.Scanner;

class H4p2q2{
	public static void main(String[] args){
		
		double a,b,result;
		String c;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("식을 입력하세요(ex. 7 + 4): ");
		a = sc.nextDouble();
		c = sc.next();
		b = sc.nextDouble();
		
		switch(c) {
			case "+": 
				result = a + b;
				break;
			case "-": 
				result = a - b;
				break;
			case "*": 
				result = a * b;
				break;
			case "/": 
				if(b == 0) {
					System.out.print("0으로 나눌 수 없습니다");
					System.exit(1);
				}
				result = a / b;
				break;
			case "%": 
				if(b == 0) {
					System.out.print("0으로 나눈 나머지를 구할수 없습니다");
					System.exit(2);
				}
				result = a % b;
				break;
				
			default: 
				result = 0xffffffff;
				System.out.print("연산자 제대로 입력");
				System.exit(3);
			
		}
		
		if(result==(int)result) System.out.println((int)result);
		else System.out.printf("%.2f",result);
		
		
		
	}
	
}
	

