import java.util.Scanner;

class H5p1q1{
  public static void main(String[] args){
    int input,sum=0;
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.print("1보다 큰 정수: ");
      input = sc.nextInt();
      if(input>1) break;
      System.out.print("[입력오류]");
    }

    for(int i=1; i<=input; i++){
      if(i%2==0) {
        System.out.printf("-%d² ",i);
        sum += i;
      }
      else if(i==1) {
        System.out.printf("1² ");
        sum += 1;
      }
      else {
        System.out.printf("+%d² ",i);
        sum += i;
      }
    }
    System.out.print("= " + sum);


  }
}
