import java.util.Scanner;

class H4p2q2{
	public static void main(String[] args){
		
		double a,b,result;
		String c;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���(ex. 7 + 4): ");
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
					System.out.print("0���� ���� �� �����ϴ�");
					System.exit(1);
				}
				result = a / b;
				break;
			case "%": 
				if(b == 0) {
					System.out.print("0���� ���� �������� ���Ҽ� �����ϴ�");
					System.exit(2);
				}
				result = a % b;
				break;
				
			default: 
				result = 0xffffffff;
				System.out.print("������ ����� �Է�");
				System.exit(3);
			
		}
		
		if(result==(int)result) System.out.println((int)result);
		else System.out.printf("%.2f",result);
		
		
		
	}
	
}
	

