import java.util.Scanner;

class H5p1q1{
  public static void main(String[] args){
    int input,sum=0;
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.print("1���� ū ����: ");
      input = sc.nextInt();
      if(input>1) break;
      System.out.print("[�Է¿���]");
    }

    for(int i=1; i<=input; i++){
      if(i%2==0) {
        System.out.printf("-%d�� ",i);
        sum += i;
      }
      else if(i==1) {
        System.out.printf("1�� ");
        sum += 1;
      }
      else {
        System.out.printf("+%d�� ",i);
        sum += i;
      }
    }
    System.out.print("= " + sum);


  }
}
