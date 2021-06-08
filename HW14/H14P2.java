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
    return String.format("�̸�: %s, �г�: %d, ����:%.1f", name, grade, score);
  }
}

class H14P2{
  public static void main(String [] args) throws Exception{
    File f1 = new File("�л�����.java");

    if(f1.exists()==false){
      System.out.println(f1.getName() + " ������ �������� �ʽ��ϴ�. Ȯ���ؿ�");
      System.exit(1);
    }

    Scanner sc = new Scanner(f1);

    Student hong = new Student("ȫ�浿", 5, 4.3);
    Student jang = new Student("�����", 2, 3.7);
    Student dul = new Student("�Ѹ�", 2, 4.0);

    System.out.println(hong.toString());
    System.out.println(jang.toString());
    System.out.println(dul.toString());
  }
}
