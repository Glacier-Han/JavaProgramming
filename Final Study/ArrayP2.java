import java.util.*;

class ArrayP2{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    int [] score = new int [50];

    System.out.print("�л� �� : ");

    int cnt;
    cnt = sc.nextInt();

    for(int i=0; i<cnt; i++){
      System.out.print("�л� ���� : ");
      score[i] = sc.nextInt();
    }

    System.out.print("���?");
    int out = sc.nextInt();

    System.out.println(score[out]);

    for(int i=0; i<cnt; i++){
      for(int j=0; j<i; j++){
        int tem;
        if(score[i] < score[j]){
          tem = score[i];
          score[i] = score[j];
          score[j] = tem;
        }
      }
    }

    for(int i=0; i<cnt; i++){
      System.out.print(score[i] + " ");
    }
  }
}
