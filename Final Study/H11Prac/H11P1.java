import java.util.*;

class Student{
  private String name;
  private int age;
  private double grade;

  String getName(){
    return name;
  }
  void setName(String name){
    this.name = name;
  }

  int getAge(){
    return age;
  }
  void setAge(int age){
    if(age>=0 && age<200) this.age = age;
    else this.age = 20;
  }

  double getGrade(){
    return grade;
  }
  void setGrade(double grade){
    if(grade>=0 && grade<=4.3) this.grade = grade;
    else this.grade = 3.0;
  }

  Student(){
    this("홍길동", 20, 3.0);
  }

  Student(String name, int age, double grade){
    this.name = name;
    this.age = age;
    this.grade = grade;
  }

  @Override
  public String toString(){
    return String.format("이름: %s, 나이: %d, 학점: %.2f", name, age, grade);
  }
}

class H11P1{
  public static void main(String [] args){
    Student s1 = new Student("김성욱", 23, 2.3);
    Student s2 = new Student("김경윤", 23, 2.6);
    Student s3 = new Student("손해일", 23, 2.9);
    Student s4 = new Student("한병하", 23, 2.8);
    Student s5 = new Student();

    System.out.println(s1.toString());
    System.out.println(s2.toString());
    System.out.println(s3.toString());
    System.out.println(s4.toString());
    System.out.println(s5.toString());

    Scanner sc = new Scanner(System.in);
    System.out.print("변경학점 : ");
    double newgrade = sc.nextDouble();

    System.out.println("한병하의 학점을 "+ newgrade + "로 올립니다.");
    s4.setGrade(newgrade);

    System.out.println(s4.toString());
  }
}
