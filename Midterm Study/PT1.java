import java.util.*;

//
class PT1{
  public static void main(String[] args){
    int a = 7;
    for(int i=0; i<a/2+1; i++){
      for(int j=0; j<=a/2-i; j++) System.out.print(" ");
      for(int j=0; j<i*2-1; j++) System.out.print(j+1);
      System.out.println();
    }
    for(int i=0; i<a/2+1; i++){
      for(int j=0; j<i; j++) System.out.print(" ");
      for(int j=0; j<a-i*2; j++) System.out.print(j+1);
      System.out.println();
    }

    double [] score = new double [Integer.parseInt(args[0])];
    Scanner sc = new Scanner(System.in);
    double avg=0;
    for(int i=0; i<Integer.parseInt(args[0]); i++){
      System.out.printf("score[%d] : ", i);
      score[i] = sc.nextDouble();
    }

    for(int i=0; i<score.length; i++){
      avg += score[i];
    }

    System.out.printf("평균 : %.2f\n", avg/score.length);

    int a1 = 5;
    for(int i=0; i<a1; i++){
      if(i==0 || i==a1-1) {
        for(int j=0; j<a1*2; j++) System.out.print("*");
      }
      else{
        System.out.print("*");
        for(int j=0; j<a1*2-2; j++) System.out.print(" ");
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();
    System.out.println();
    System.out.println();

    //나비출력
    int z = 13;
    for(int i=1; i<=z/2; i++){
      for(int j=0; j<i; j++) System.out.print("*");
      for(int j=0; j<z-2*i; j++) System.out.print(" ");
      for(int j=0; j<i; j++) System.out.print("*");
      System.out.println();
    }
    for(int i=0; i<z; i++){
      System.out.print("*");
    }
    System.out.println();
    for(int i=1; i<=z/2; i++){
      for(int j=0; j<z/2-i+1; j++) System.out.print("*");
      for(int j=0; j<i*2-1; j++) System.out.print(" ");
      for(int j=0; j<z/2-i+1; j++) System.out.print("*");
      System.out.println();
    }

    System.out.println();
    System.out.println();

    //다이아몬드 모양
    /*
    0
   101
  21012
 3210123
432101234
 3210123
  21012
   101
    0
    */

    int p = 9;
    for(int i=1; i<=p/2+1; i++){
      for(int j=0; j<p/2-i+1; j++) System.out.print(" ");
      for(int j=0; j<i; j++) System.out.print(i-j-1);
      for(int j=0; j<i-1; j++) System.out.print(j+1);
      System.out.println();
    }
    for(int i=1; i<=p/2; i++){
      for(int j=0; j<i; j++) System.out.print(" ");
      for(int j=0; j<p/2-i; j++) System.out.print(p/2-i-j);
      for(int j=0; j<p/2-i+1; j++) System.out.print(j);
      System.out.println();
    }

    System.out.println();

  }
}
