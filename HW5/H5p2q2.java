import java.util.Scanner;

class H5p2q2{
  public static void main(String[] args){

    int inp,cnt=0;
    double sum=0;
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.print("정수: ");
      inp = sc.nextInt();
      if(inp == 1111) break;
      else if(inp%7!=0 && inp%2==1) {
        sum += inp;
        cnt++;
    }

    }
    if(sum == 0) System.out.printf("없음");
    else System.out.printf("조건을 만족하는 %d개의 홀수들의 평균은 %.2f입니다.", cnt, sum/cnt);
  }
}
