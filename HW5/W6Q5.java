import java.util.Scanner;

class W6Q5{
  public static void main(String[] args){
    int i, j, k;

    for(i=0; i<4; i++){
      for(j=0; j<i; j++){
        for(k=0; k<j; k++) System.out.print("#");
        for(; k<i; k++) System.out.print("*");
        System.out.println();
      }
    }
  }
}
