import java.util.*;


class H13P1{
  public static void main(String [] args){
    Animal [] animals = {new Cat(), new Dolphin(), new Dove()};
    for(Animal a: animals){
      a.move();
    }
  }
}

class Animal{
  Animal(){
  }

  void move(){
      System.out.print("나는 "+ this.getClass().getName() + "이고, ");
  }
}

class Cat extends Animal{

  Cat(){
  }

  @Override
  void move(){
    super.move();
    System.out.println("달립니다. ");
  }
}

class Dolphin extends Animal{

  Dolphin(){
  }

  @Override
  void move(){
    super.move();
    System.out.println("수영합니다. ");
  }

}

class Dove extends Animal{

  Dove(){
  }

  @Override
  void move(){
    super.move();
    System.out.println("날아다닙니다. ");
  }


}
