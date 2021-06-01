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
}

class ParkTest{
  public static void main(String [] args){
    Car c1 = new Car();
    Bike b1 = new Bike();
    c1.print(30);
    c1.print(60);
    b1.print(20);


  }
}
