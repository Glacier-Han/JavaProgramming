import java.util.Scanner;
import java.util.Random;
//import java.util.*; << 유틸 모든 클래스 import

class CircleArea {
	public static void main(String[] args){
		double radius;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("반지름 : ");
		radius = sc.nextDouble();
		
		System.out.printf("원 넓이 : %.2f\n", radius*radius*Math.PI);
		System.out.printf("sin(pi): %f\n",Math.sin(Math.PI));
		System.out.printf("cos(0): %f\n",Math.cos(0));
		System.out.printf("cos(pi/2): %f\n",Math.cos(Math.PI/2));
		System.out.printf("7의 제곱근: %f\n",Math.pow(7,5));
		System.out.printf("7의 루트: %f\n",Math.sqrt(7));
		
		//0이상 10미만 실수형 난수, 10이상 15미만 실수형 난수, 0이상 20이하의 정수형 난수, -5이상 -5이하의 정수형 난수
		//Math 클래스 사용
		System.out.printf("\n0이상 10미만 실수 난수 : %f\n", Math.random()*10);
		System.out.printf("10이상 15미만 실수 난수 : %f\n", (Math.random()*5)+10);
		System.out.printf("0이상 20이하 정수 난수 : %d\n", (int)(Math.random()*21)); //double->19.999999 so, 21을 곱해줘야 20이하가 됨
		System.out.printf("-5이상 -5이하 정수 난수 : %d\n", (int)(Math.random()*12-6)); //음수포함

		//난수 전문 클래스 java.util.Random; 사용
		Random ran = new Random();
		System.out.printf("\n0이상 10미만 실수 난수 : %f",ran.nextDouble()*10);
		System.out.printf("\n10이상 15미만 실수 난수 : %f",(ran.nextDouble()*5)+10);
		System.out.printf("\n0이상 20이하 정수 난수 : %d",ran.nextInt(21));
		System.out.printf("\n0이상 6이하 정수 난수 : %d",ran.nextInt(11)-5);
	}
}
