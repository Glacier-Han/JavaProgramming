import java.util.Scanner;

class Calculator{
	public static void main(String [] args){
		double a, b, result;
		String operator;
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���(ex. 7 + 4): ");
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
				System.out.println("0���� ���� �� �����ϴ�.");
				System.exit(1);
			}
			result = a/b;
			break;				
		case "%":
			if(b==0){
				System.out.println("0���� ���� �������� ���� �� �����ϴ�.");
				System.exit(2);
			}
			result = a%b;
			break;
		default: 
			result = 0xffffffff;//���ǹ��� ���� �ʱ�ȭ�ϹǷ� �ǹ̴� ������ ���Ļ� result�� �ʱ�ȭ
			System.out.println("+, -, *, /, % ���길 �����մϴ�. ");
			System.exit(3);
		}
		
		if(result==(int)result) System.out.println((int)result);
		else System.out.printf("%.2f\n", result);	
	}
}