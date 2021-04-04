//Homework #1

import java.util.Scanner;

public class Homework1{
	public static void main(String[] args){
		
		/* ---------과제1번----------*/
		
		int a,b;
		System.out.printf("1번째 양의 정수 : ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		System.out.printf("2번째 양의 정수 : ");
		b = input.nextInt();
		
		System.out.printf("\n%-11s|%-11s|%-11s|%-11s|\n", "number", "decimal", "otcal", "hexadecimal");
		System.out.printf("%2$-11s|%1$+11d|%1$#11o|%1$#11x|\n", a, "number1");
		System.out.printf("%2$-11s|%1$+11d|%1$#11o|%1$#11x|\n",b, "number2");
		System.out.printf("%2$-11s|%1$-11d|%1$#-11o|%1$#-11x|\n",a+b, "sum");
		
		System.out.printf("\n\n\n");
		
		/* ---------과제2번-----------*/
		
		String name;
		int age;
		double weight;
		
		Scanner input2 = new Scanner(System.in);
		System.out.printf("이름 : ");
		name = input2.nextLine();
		System.out.printf("나이 : ");
		age = input2.nextInt();
		System.out.printf("몸무게 : ");
		weight = input2.nextDouble();
		
		System.out.printf("\"나의 이름은 '%s',\n\t나이는 %#x,\n\t\t몸무게는%10.2f 입니다.\"", name, age, weight);
	}
}