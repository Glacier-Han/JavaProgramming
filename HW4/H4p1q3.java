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
      System.out.print("������ : ");
      input = sc.nextInt();

      if(input > rannum) System.out.println("���� �ѹ��� ���� �������̴� �ٽýõ�");
      if(input < rannum) System.out.println("���� �ѹ��� ���� ū���̴� �ٽýõ�");
      if(input == rannum) break;

      count += 1;
    }

    System.out.printf("�����Դϴ�. �� %dȸ ���� ������ϴ�", count);

  }
}
