import java.util.Scanner;
import java.util.Random;
//import java.util.*; << ��ƿ ��� Ŭ���� import

class CircleArea {
	public static void main(String[] args){
		double radius;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("������ : ");
		radius = sc.nextDouble();
		
		System.out.printf("�� ���� : %.2f\n", radius*radius*Math.PI);
		System.out.printf("sin(pi): %f\n",Math.sin(Math.PI));
		System.out.printf("cos(0): %f\n",Math.cos(0));
		System.out.printf("cos(pi/2): %f\n",Math.cos(Math.PI/2));
		System.out.printf("7�� ������: %f\n",Math.pow(7,5));
		System.out.printf("7�� ��Ʈ: %f\n",Math.sqrt(7));
		
		//0�̻� 10�̸� �Ǽ��� ����, 10�̻� 15�̸� �Ǽ��� ����, 0�̻� 20������ ������ ����, -5�̻� -5������ ������ ����
		//Math Ŭ���� ���
		System.out.printf("\n0�̻� 10�̸� �Ǽ� ���� : %f\n", Math.random()*10);
		System.out.printf("10�̻� 15�̸� �Ǽ� ���� : %f\n", (Math.random()*5)+10);
		System.out.printf("0�̻� 20���� ���� ���� : %d\n", (int)(Math.random()*21)); //double->19.999999 so, 21�� ������� 20���ϰ� ��
		System.out.printf("-5�̻� -5���� ���� ���� : %d\n", (int)(Math.random()*12-6)); //��������

		//���� ���� Ŭ���� java.util.Random; ���
		Random ran = new Random();
		System.out.printf("\n0�̻� 10�̸� �Ǽ� ���� : %f",ran.nextDouble()*10);
		System.out.printf("\n10�̻� 15�̸� �Ǽ� ���� : %f",(ran.nextDouble()*5)+10);
		System.out.printf("\n0�̻� 20���� ���� ���� : %d",ran.nextInt(21));
		System.out.printf("\n0�̻� 6���� ���� ���� : %d",ran.nextInt(11)-5);
	}
}
