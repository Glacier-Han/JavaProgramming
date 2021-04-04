import java.util.Scanner;

//while문을 두번 이용해 입력에서 부터 걸러버리기

class H4p1q4{
  public static void main(String[] args){
    int type, score;
    Scanner sc = new Scanner(System.in);

    while(true){

      System.out.printf("종: ");
      type = sc.nextInt();

      if(type == 1){
        System.out.printf("점수: ");
        score = sc.nextInt();
          if(score <=100 && score>=70) {
            System.out.println("합격");
            break;
          }
          else if(score > 0) {
            System.out.println("불합격");
            break;
          }
          else {
            System.out.println("0-100만 유효.\n다시입력하세요.");
          }
      }

      else if(type == 2){
        System.out.printf("점수: ");
        score = sc.nextInt();
          if(score <=100 && score>=60) {
            System.out.println("합격");
            break;
          }
          else if(score > 0) {
            System.out.println("불합격");
            break;
          }

          else {
            System.out.println("0-100만 유효.\n다시입력하세요.");
          }
        }

      else {
        System.out.println("1,2종만 유효. \n다시입력해주세요.");
      }

    }

  }
}
