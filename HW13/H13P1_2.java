import java.util.*;

class H13P1_2{
  public static void main(String[] args){
    System.out.println("이름을 입력하세요.");
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    Student s1 = new Student(name);
    System.out.println();




    Subject [] subjects = {new Korean(), new English(), new Math(), new Science()};
    for(Subject s: subjects) s1.report(s);
  }
}


class Student{
  private String name;

  String getName(){
    return name;
  }
  void setName(String name){
    this.name = name;
  }

  Student(){}
  Student(String name){
    System.out.println(name + "의 성적을 불러드릴게요.");
  }
  void report(Subject s){
    System.out.println( s.getClass().getName() + " 의 점수 : " + s.getScore());
  }
}

class Subject{
  private int score;
  Random ran = new Random();
  Subject(){
    this.setScore(ran.nextInt(100));
  }

  Subject(int score){
    this.score = score;
  }

  int getScore(){
    return score;
  }
  void setScore(int score){
    this.score = score;
  }
}

class Korean extends Subject{
  Korean(){}
  Korean(int score){
    super(score);
  }
}

class English extends Subject{
  English(){}
  English(int score){
    super(score);
  }
}

class Math extends Subject{
  Math(){}
  Math(int score){
    super(score);
  }
}

class Science extends Subject{
  Science(){}
  Science(int score){
    super(score);
  }
}
