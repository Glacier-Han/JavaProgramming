import java.util.Scanner;

//while���� �ι� �̿��� �Է¿��� ���� �ɷ�������

class H4p1q4{
  public static void main(String[] args){
    int type, score;
    Scanner sc = new Scanner(System.in);

    while(true){

      System.out.printf("��: ");
      type = sc.nextInt();

      if(type == 1){
        System.out.printf("����: ");
        score = sc.nextInt();
          if(score <=100 && score>=70) {
            System.out.println("�հ�");
            break;
          }
          else if(score > 0) {
            System.out.println("���հ�");
            break;
          }
          else {
            System.out.println("0-100�� ��ȿ.\n�ٽ��Է��ϼ���.");
          }
      }

      else if(type == 2){
        System.out.printf("����: ");
        score = sc.nextInt();
          if(score <=100 && score>=60) {
            System.out.println("�հ�");
            break;
          }
          else if(score > 0) {
            System.out.println("���հ�");
            break;
          }

          else {
            System.out.println("0-100�� ��ȿ.\n�ٽ��Է��ϼ���.");
          }
        }

      else {
        System.out.println("1,2���� ��ȿ. \n�ٽ��Է����ּ���.");
      }

    }

  }
}
