import java.util.*;

class Car{ //�ڵ��� Ŭ����
	//�Ӽ�:�ʵ� , �������
	double speed;
	double mileage; //�Ϲݺ���(Main ��, �ʱ�ȭ �ʼ�) | �������, �ʵ庯�� (�ʱ�ȭ���� ������ �ڷ����� �´� 0���� �ڵ� �ʱ�ȭ ��, boolean -> false)
	String color;
	//����:�޼ҵ� , ����Լ�
	void goStraight(double distance){
		System.out.println(distance + "m �����մϴ�. ");
		mileage += distance;
	}
	
	void stop(){
		System.out.println("�����մϴ�. ");
	}
	
	void turnLeft(){
		System.out.println("��ȸ�� �մϴ�. ");
	}
	
	void turnRight(){
		System.out.println("��ȸ�� �մϴ�. ");
	}
	
	void milageShow(){
		System.out.println(mileage + "m");
	}
}

class CarTest{
	public static void main(String [] args){
		//�ڵ��� �׽�Ʈ
		//1. �ڵ��� ����
		Car myCar = new Car(); //�ڵ��� ��ü, �ν��Ͻ�
		//2. �ڵ��� �׽�Ʈ
		myCar.goStraight(5.4); //����test
		myCar.stop(); //����test
		
		
		
		//3.�����׽�Ʈ
		
		myCar.goStraight(20);
		myCar.turnRight();
		myCar.goStraight(15);
		myCar.turnLeft();
		myCar.goStraight(30);
		myCar.turnRight();
		myCar.goStraight(15);
		myCar.stop();
		myCar.milageShow();
		
	}
}