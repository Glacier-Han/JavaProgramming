import java.io.*;
import java.util.*;

class Student{
  String name;
  int grade;
  double score;

  Student(){
  }

  Student(String name, int grade, double score){
    this.name = name;
    this.grade = grade;
    this.score = score;

  }

  public String toString(){
    return String.format("이름: %s, 학년: %d, 학점:%.1f", name, grade, score);
  }
}

class H14P2{
  public static void main(String [] args) throws Exception{
    File f1 = new File("학생정보.java");

    if(f1.exists()==false){
      System.out.println(f1.getName() + " 파일이 존재하지 않습니다. 확인해요");
      System.exit(1);
    }

    Scanner sc = new Scanner(f1);

    Student hong = new Student("홍길동", 5, 4.3);
    Student jang = new Student("장발장", 2, 3.7);
    Student dul = new Student("둘리", 2, 4.0);

    System.out.println(hong.toString());
    System.out.println(jang.toString());
    System.out.println(dul.toString());
  }
}
