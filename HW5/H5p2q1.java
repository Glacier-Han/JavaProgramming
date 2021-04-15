import java.util.Scanner;

class H5p2q1{
  public static void main(String[] args){
    int inp,sum=0;
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.print("1보다 큰 정수: ");
      inp = sc.nextInt();
      if(inp>1) break;
    }

    for(int i=1; i<=inp; i++){
      if(i==1) {
        System.out.print("1^ ");
        sum += 1;
      }
      else if(i%2==0 && i!=0) {
        System.out.printf("-%d^ ", i);
        sum += -1*i*i;
      }
      else if(i%2==1){
        System.out.printf("+%d^ ", i);
        sum += i*i;
      }
    }

    System.out.print(sum);




  }
  }
