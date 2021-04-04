import java.util.Scanner;
import java.util.Random;

class H4p1q3{
  public static void main(String[] args){

    int input, rannum, count=1;
    Scanner sc = new Scanner(System.in);
    Random ran = new Random();
    rannum = ran.nextInt(101)-50;
    System.out.printf("%d", rannum);

    while(true) {
      System.out.print("예측값 : ");
      input = sc.nextInt();

      if(input > rannum) System.out.println("랜덤 넘버는 좀더 작은값이다 다시시도");
      if(input < rannum) System.out.println("랜덤 넘버는 좀더 큰값이다 다시시도");
      if(input == rannum) break;

      count += 1;
    }

    System.out.printf("정답입니다. 총 %d회 만에 맞췄습니다", count);

  }
}
