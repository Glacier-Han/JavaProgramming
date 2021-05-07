import java.util.*;

class Car{ //자동차 클래스
	//속성:필드 , 멤버변수
	double speed;
	double mileage; //일반변수(Main 안, 초기화 필수) | 멤버변수, 필드변수 (초기화하지 않으면 자료형에 맞는 0으로 자동 초기화 됨, boolean -> false)
	String color;
	//동작:메소드 , 멤버함수
	void goStraight(double distance){
		System.out.println(distance + "m 직진합니다. ");
		mileage += distance;
	}
	
	void stop(){
		System.out.println("정지합니다. ");
	}
	
	void turnLeft(){
		System.out.println("좌회전 합니다. ");
	}
	
	void turnRight(){
		System.out.println("우회전 합니다. ");
	}
	
	void milageShow(){
		System.out.println(mileage + "m");
	}
}

class CarTest{
	public static void main(String [] args){
		//자동차 테스트
		//1. 자동차 생성
		Car myCar = new Car(); //자동차 객체, 인스턴스
		//2. 자동차 테스트
		myCar.goStraight(5.4); //직진test
		myCar.stop(); //정지test
		
		
		
		//3.주행테스트
		
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