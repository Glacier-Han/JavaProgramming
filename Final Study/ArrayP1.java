import java.util.*;

class ArrayP1{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("학생수 : ");

    int [] score = new int[10];
    int count = sc.nextInt();

    for(int i=0; i<count; i++){
      System.out.printf("%d번 학생 점수 : ",i+1);
      score[i] = sc.nextInt();
    }

    System.out.print("몇번학생? : ");

    int check = sc.nextInt() - 1;
    System.out.println(check + "번 학생 점수: " + score[check]);

    for(int i=0; i<count; i++){
      for(int j=0; j<i; j++){
        int tmp;
        if(score[i]>score[j]){
          tmp = score[i];
          score[i] = score[j];
          score[j] = tmp;
      }

      }

    }

    for(int i=0; i<count; i++){
      System.out.print(score[i] + " ");
    }



  }
}
