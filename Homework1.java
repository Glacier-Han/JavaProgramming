//Homework #1

import java.util.Scanner;

public class Homework1{
	public static void main(String[] args){
		
		/* ---------����1��----------*/
		
		int a,b;
		System.out.printf("1��° ���� ���� : ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		System.out.printf("2��° ���� ���� : ");
		b = input.nextInt();
		
		System.out.printf("\n%-11s|%-11s|%-11s|%-11s|\n", "number", "decimal", "otcal", "hexadecimal");
		System.out.printf("%2$-11s|%1$+11d|%1$#11o|%1$#11x|\n", a, "number1");
		System.out.printf("%2$-11s|%1$+11d|%1$#11o|%1$#11x|\n",b, "number2");
		System.out.printf("%2$-11s|%1$-11d|%1$#-11o|%1$#-11x|\n",a+b, "sum");
		
		System.out.printf("\n\n\n");
		
		/* ---------����2��-----------*/
		
		String name;
		int age;
		double weight;
		
		Scanner input2 = new Scanner(System.in);
		System.out.printf("�̸� : ");
		name = input2.nextLine();
		System.out.printf("���� : ");
		age = input2.nextInt();
		System.out.printf("������ : ");
		weight = input2.nextDouble();
		
		System.out.printf("\"���� �̸��� '%s',\n\t���̴� %#x,\n\t\t�����Դ�%10.2f �Դϴ�.\"", name, age, weight);
	}
}