import java.util.*;

class Array_play{
  public static void main(String [] args){


    Scanner sc = new Scanner(System.in);
    Setup setup = new Setup();
    Reservation reserv = new Reservation();
    System.out.println(">-- 안녕하세요, Glacier Theater 입니다. --<");
    System.out.println(">-- 현재 좌석 내역입니다 --<");
    System.out.println();
    setup.showMe();

    while(true){

      System.out.print(">-- 예약하시겠습니까?(Y,y / N,n) --< ");
      char yesorno = sc.next().charAt(0);
      if(yesorno == 'Y' || yesorno == 'y'){
        reserv.startReserve();
        setup.showMe();
      }

      else if(yesorno == 'N' || yesorno == 'n'){
        System.out.print(">-- 시스템을 종료합니다. --< ");
        System.exit(0);
      }

      else if(yesorno == 'd'){ //디버그 메소드
        setup.test();
        setup.showMe();
      }

      else {
        System.out.println(">-- 다시 입력해 주세요. --< ");
      }

    }

  }
}

class Setup{

  Setup(){
    this.chairSetup();
  }

  //가로세로 영화관 자리 배열 생성
  static char [][] chair = new char[100][100];

  void setChair(int a, int b, char input){
    this.chair[a][b] = input;
  }

  char getChair(int a, int b){
    return chair[a][b];
  }


  //세로인덱스 알파벳 배열 생성
  char [] seroindex = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

  void chairSetup(){

    for(int i=0; i<10; i++){
      for(int j=0; j<10; j++){
        Random ran = new Random();
        if(ran.nextBoolean() == true) chair[i][j] = 'X';
        else chair[i][j] = ' ';
      }
    }

  }

  void test(){
    chair[0][0] = ' ';
  }

  void showMe(){

    //가로 기본번호 생성
    System.out.print("  ");
    for(int i=1; i<=10; i++){
      System.out.print(" " + i);
    }

    System.out.println();

      for(int i=0; i<10; i++){
        System.out.print(seroindex[i]+"  ");
        for(int j=0; j<10; j++){
          System.out.print(chair[i][j] + " ");
        }
        System.out.println();
      }

      System.out.println();
  }

}


class Reservation extends Setup{
  Scanner sc = new Scanner(System.in);

  void startReserve(){

    System.out.print("몇번째 행을 예약하시겠습니까? ");
    int hang = sc.nextInt() - 1;
    System.out.print("몇번째 열을 예약하시겠습니까? ");
    int yeol = sc.nextInt() - 1;

    if(getChair(yeol, hang) == ' ') {
      System.out.println("현재 " + (hang+1) +"행"+(yeol+1)+"열 좌석은 예약 가능합니다.\n예약을 진행하겠습니다.");
    }
    else if(getChair(yeol, hang) == 'X'){
      System.out.println("현재 " + (hang+1) +"행"+(yeol+1)+"열 좌석은 이미 예약되어 있습니다.\n다른 좌석을 선택해 주세요.");
      System.exit(1);
    }
    else {
      System.out.println("시스템 오류");
      System.out.println(chair[yeol][hang]);
      System.exit(9);
    }

    super.setChair(yeol,hang,'X');
    System.out.println((hang+1) +"행"+(yeol+1)+"열 좌석 예약 완료되었습니다.");
    System.out.println();
  }
}
