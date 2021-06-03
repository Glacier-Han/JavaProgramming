import java.util.*;

class Ride{
  protected int wheels;
  protected int miles;

  protected void print(int miles){
    this.miles += miles;
    System.out.print("���� " + this.getClass().getName() + "�̰�, " + miles + "m��ŭ �����մϴ�. ");
    System.out.println("�������� " + this.miles + "m��ŭ �����߽��ϴ�.");
  }

}
class Car extends Ride{
  protected String maker;
  Car(){
    this(4,"�����ڵ���");
    this.miles = 0;
  }
  Car(int wheels, String maker){
    this.wheels = wheels;
    this.maker = maker;
  }
  
  @Override
  protected void print(int miles){
	  super.print(miles);
	  System.out.println("�� ������ " + wheels + "���� ������ ���� " + maker + "�� �����Դϴ�.");
  }
}

class Bike extends Ride{
  Bike(){
    this(2);
    this.miles = 0;
  }
  Bike(int wheels){
    this.wheels = wheels;
  }
}

class Garage{
  protected int parked;
  
  void park(Object o){
	  if(o instanceof Car){
		  parked++;
		  System.out.println(o.getClass().getName() + "�� ���� �����߽��ϴ�(�� " + parked + "�� ������)");
	  }
	  else if(o instanceof Bike){
		  parked++;
		  System.out.println(o.getClass().getName() + "�� ���� �����߽��ϴ�(�� " + parked + "�� ������)");
	  }
	  else{
		  System.out.println("�̰� �����Ѵٰ�? �ٽû����غ� ��û��");
	  }
	  
	  
	  
	}
}

class Stone{}

class ParkTest{
  public static void main(String [] args){
    
	/*
	Car c1 = new Car();
	Car c2 = new Car();
	Car c3 = new Car();
    Bike b1 = new Bike();
	Stone s1 = new Stone();
	*/
	
	Garage g1 = new Garage();
	Ride [] rides = {new Car(), new Car(3, "�񿥴�����"), new Car(6, "����ڵ���"), new Bike()};
    Stone s1 = new Stone();
	
	rides[0].print(30);
    rides[0].print(60);
    rides[3].print(20);
	rides[2].print(50);
	
	for(Ride rs : rides) g1.park(rs);
	g1.park(s1);
	
  }
}
