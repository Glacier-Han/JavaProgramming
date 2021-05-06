import java.util.*;

class H9P2{
  public static void main(String [] args){
    int [][] arr = new int[3][2];
    initArr(arr);
    System.out.println();
    printArr(arr);
    System.out.println();
  }

  static void initArr(int [][] arr){
    int a;
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<3; i++){
      for(int j=0; j<2; j++){
        System.out.printf("%d행 %d열 성분 : ",i+1,j+1);
        arr[i][j] = sc.nextInt();
      }
    }
  }

  static void printArr(int [][] arr){
    for(int i=0; i<3; i++){
      for(int j=0; j<2; j++){
        System.out.printf("%d ", arr[i][j]);
      }
      System.out.println();
    }
  }

  static void sumArr(int [][] arr){
    for(int i=0; i<3; i++){
      for(int j=0; j<2; j++){
        System.out.printf("%d ", arr[i][j]);
      }
      System.out.println();
    }
  }
}
