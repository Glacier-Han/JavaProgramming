import java.util.Scanner;

class W6Q{
  public static void main(String[] args){
    int a,b,num=0,temp;
    Scanner sc = new Scanner(System.in);

    System.out.print("a : ");
    a = sc.nextInt();
    System.out.print("a : ");
    b = sc.nextInt();

        if(a>b){
          temp = a;
          a = b;
          b = temp;
        }

    for(int i=a; i<=b; i++){
      System.out.print(i +"ÀÇ ¾à¼ö : ");
      for(int j=1; j<=i; j++){
        if(i%j==0)   System.out.printf("%d, ",j);

      }
      System.out.printf("\b\b ");
      System.out.printf("\n");
    }

    //__________________

    
  }

}
