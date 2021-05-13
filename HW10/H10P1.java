import java.util.*;

class Student{
  private String name;
  private int score;
  private int age;

  String getName(){
    return name;
  }

  void setName(String name){
    this.name = name;
  }

  int getScore(){
    return score;
  }

  void setScore(int score){
    this.score = score;
  }

  int getAge(){
    return age;
  }

  void setAge(int age){
    this.age = age;
  }

  void speak(){
    System.out.println("���� "+ age + "�� " + name + "�Դϴ�. ���� ������ " + score + "�Դϴ�.");
  }
}

class StudentTest{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    Student myStudent = new Student();
    System.out.print("�̸� ���� ����");
    myStudent.setName(sc.next());
    myStudent.setScore(sc.nextInt());
    myStudent.setAge(sc.nextInt());

    myStudent.speak();
  }
}
