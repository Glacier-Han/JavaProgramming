import java.util.Scanner;

class Test2 {
	public static void main(String[] args){
		
		int a,b;
		double r;
		
		System.out.printf("직사각형의 가로(정수): ");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		System.out.printf("직사각형의 세로(정수): ");
		b = s.nextInt();
		System.out.printf("원의 반지름(실수): ");
		r = s.nextDouble();
		
		System.out.printf("\n----------둘레 계산 결과----------\n");
		System.out.printf("직사각형의 둘레: %1$d(%1$#o, %1$#x)\n", 2*a+2*b);
		System.out.printf("원의 둘레: %.3f", 2*r*3.14);

		
		
		
		
	}
}