import java.util.*;
import java.io.*;

class H11Q2_1{
  public static void main(String [] args) throws Exception{
    File input = new File("�л�����.java");

    if(input.exists() == false) {
      System.out.println(input.getName() + " ������ �������� �ʾƿ�.");
      System.exit(1);
    }

    Scanner sc = new Scanner(input);

    Student [] students = new Student[10];

    for(int i=0; i<3; i++){
      students[i] = new Student(sc.next(), sc.nextInt(), sc.nextDouble());
    }

    for(int i=0; i<3; i++){
      System.out.println(students[i].toString());
    }
  }
}

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
    return String.format("�̸�: %s, �г�: %d, ����: %.1f", name, grade, score);
  }
}
