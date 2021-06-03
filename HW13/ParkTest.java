import java.util.*;

class Ride{
  protected int wheels;
  protected int miles;

  protected void print(int miles){
    this.miles += miles;
    System.out.print("나는 " + this.getClass().getName() + "이고, " + miles + "m만큼 직진합니다. ");
    System.out.println("이제까지 " + this.miles + "m만큼 직진했습니다.");
  }

}
class Car extends Ride{
  protected String maker;
  Car(){
    this(4,"현대자동차");
    this.miles = 0;
  }
  Car(int wheels, String maker){
    this.wheels = wheels;
    this.maker = maker;
  }
  
  @Override
  protected void print(int miles){
	  super.print(miles);
	  System.out.println("이 차량은 " + wheels + "개의 바퀴를 가진 " + maker + "의 차량입니다.");
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
		  System.out.println(o.getClass().getName() + "를 차고에 주차했습니다(총 " + parked + "대 주차됨)");
	  }
	  else if(o instanceof Bike){
		  parked++;
		  System.out.println(o.getClass().getName() + "를 차고에 주차했습니다(총 " + parked + "대 주차됨)");
	  }
	  else{
		  System.out.println("이걸 주차한다고? 다시생각해봐 멍청아");
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
	Ride [] rides = {new Car(), new Car(3, "비엠더블유"), new Car(6, "기아자동차"), new Bike()};
    Stone s1 = new Stone();
	
	rides[0].print(30);
    rides[0].print(60);
    rides[3].print(20);
	rides[2].print(50);
	
	for(Ride rs : rides) g1.park(rs);
	g1.park(s1);
	
  }
}
