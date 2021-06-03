import java.util.*;

class H9P2{
  public static void main(String [] args){
    int [][] arr = new int[3][2];
    initArr(arr);
    System.out.println();
    printArr(arr);
    System.out.println();
    System.out.print("모든 성분의 합" + sumArr(arr));
    System.out.println();
    colSumArr(arr);
    System.out.println();
    rowSumMaxArr(arr);
    System.out.println();
    indexMaxArr(arr);
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

  static int sumArr(int [][] arr){
    int sum=0;
    for(int i=0; i<3; i++){
      for(int j=0; j<2; j++){
        sum += arr[i][j];
      }
      System.out.println();
    }
    return sum;
  }

  static void colSumArr(int [][] arr){
    int sum1=0, sum2=0;
    for(int i=0; i<3; i++){
      sum1 += arr[i][0];
      sum2 += arr[i][1];
    }
    System.out.printf("배열의 열 별 합 : %d %d", sum1, sum2);
  }

  static void rowSumMaxArr(int [][] arr){
    int sum1=0, sum2=0, sum3=0;
    int max=0;
    for(int i=0; i<2; i++){
      sum1 += arr[0][i];
      sum2 += arr[1][i];
      sum3 += arr[2][i];
    }

      if(max<sum1) {
        max = sum1;
        if(max<sum2){
          if(max<sum3) max = sum3;
        }
        else {
          max = sum2;
        }
      }


    System.out.printf("배열의 행 별 합 : %d %d %d", sum1, sum2, sum3);
    System.out.print(max);
  }

  static void indexMaxArr(int [][] arr){
    int max=0;
    int indexh=0,indexc=0;
    for(int i=0; i<3; i++){
      for(int j=0; j<2; j++){
        if(max<arr[i][j]) max = arr[i][j];
      }
    }

    for(int i=0; i<3; i++){
        indexh++;
      for(int j=0; j<2; j++){
        if(max==arr[i][j]) {
          indexc=j;
          indexh=i;
          break;
        }
      }

    }
    System.out.printf("(%d, %d)", indexh, indexc);
  }
}
