import java.util.Scanner;

class H5p2q4{
  public static void main(String[] args){

    int sosu=0;
    int cnt=0;
    int i,j;
    for(i=1; i<=100; i++){
        for(j=1; j<=i; j++){
          if(i%j==0 && j!=1) break;
      }
      if(i==j) {
        cnt++;
        System.out.printf("%3d ",i);
        if(cnt%5==0) System.out.printf("\n");
      }

  }
}
}
