import java.util.*;

class Student{
  private String name;
  private double score;
  private int age;
  String note;
  String getName(){
    return name;
  }

  void setName(String name){
    this.name = name;
  }

  double getScore(){
    return score;
  }

  void setScore(double score){
    this.score = score;
  }

  int getAge(){
    return age;
  }

  void setAge(int age){
    this.age = age;
  }

  void speak(){
    System.out.println("나는 "+ age + "세 " + name + "입니다. 나의 학점은 " + score + "입니다.");
  }

  void note(){
    System.out.println("나는 "+ note +"입니다.");
  }
}

class StudentTest1{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    Student myStudent = new Student();
    Student heStudent = new Student();
    System.out.print("이름 점수 나이 설명\n");
    myStudent.setName(sc.next());
    myStudent.setScore(sc.nextDouble());
    myStudent.setAge(sc.nextInt());
    myStudent.note = sc.next();

    System.out.print("이름 점수 나이 설명\n");
    heStudent.setName(sc.next());
    heStudent.setScore(sc.nextDouble());
    heStudent.setAge(sc.nextInt());
    heStudent.note = sc.next();

    myStudent.speak();
    myStudent.note();
    heStudent.speak();
    heStudent.note();
  }
}
