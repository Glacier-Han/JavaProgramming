import java.util.*;

class H13P1{
  public static void main(String [] args){
    Ride [] rides = {new Bike(), new Car(), new Bike(3), new Car(8, "��ī�Ͼƻ����")};
    Garage ga = new Garage();
    Stone st = new Stone();
    rides[0].print(30);
    rides[1].print(30);
    rides[0].print(50);

    for(Ride r : rides){
      ga.park(r);
    }

    ga.park(st);
  }
}

class Ride{
  protected int wheel;
  protected double mile;

  Ride(){
    this(4,0);
  }

  Ride(int wheel){
    this.wheel = wheel;
  }

  Ride(int wheel, double mile){
    this.wheel = wheel;
    this.mile = mile;
  }

  protected void print(double mile){
    this.mile += mile;
    System.out.printf("���� %s�̰�, %.2f��ŭ �����մϴ�. �������� �� %.2f��ŭ �����߽��ϴ�.\n",this.getClass().getName(), mile,this.mile);
  }
}

class Car extends Ride{
  protected String maker;

  Car(){
    super(4, 0);

  }

  Car(int wheel, String maker){
    super(wheel);
    this.maker = maker;
  }

}

class Bike extends Ride{
  Bike(){
    super(2, 0);
  }

  Bike(int wheel){
    super(wheel);
  }

}

class Garage{
  protected int parked;

  protected void park(Object r){
    if(r instanceof Car || r instanceof Bike){
      System.out.println(r.getClass().getName() + "�� �����߽��ϴ�.");
      parked++;
    }

    else System.out.println("������ �� �����");
  }
}

class Stone{

}
