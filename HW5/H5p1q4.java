import java.util.Scanner;

class H5p1q4{
  public static void main(String[] args){
    int num=0, numf=0;
    for(int i=1; i<=100; i++){
      for(int j=1; j<=i; j++){
        if(i%j==0 && i!=j && j!=1){
          num = j;
        }

      }
      System.out.print(num + " ");
    }
  }
}
