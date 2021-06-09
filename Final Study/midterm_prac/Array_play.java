import java.util.*;

class Array_play{
  public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    Setup setup = new Setup();
    Reservation reserv = new Reservation();
    System.out.println(">-- 현재 좌석 내역입니다 --<");
    System.out.println();
    setup.ChairSetup();
    setup.Show();

    System.out.print(">-- 예약하시겠습니까?(Y,y / N,n) --< ");
    char yesorno = sc.next().charAt(0);
    if(yesorno == 'Y' || yesorno == 'y'){
      reserv.Reservation();
      setup.Show();

    }

    else if(yesorno == 'N' || yesorno == 'n'){
      System.out.print(">-- 예약시스템을 종료합니다. --< ");
      System.exit(1);
    }

    else {
      System.out.println(">-- 다시 입력해 주세요. --< ");
      return;
    }

  }
}

class Setup{

  //가로세로 영화관 자리 배열 생성
  char [][] chair = new char[100][100];

  void setChair(int a, int b, char input){
    this.chair[a][b] = input;
  }


  //세로인덱스 알파벳 배열 생성
  char [] seroindex = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

  void ChairSetup(){

    for(int i=0; i<10; i++){
      for(int j=0; j<10; j++){
        Random ran = new Random();
        if(ran.nextBoolean() == true) chair[i][j] = 'X';
        else chair[i][j] = ' ';
      }
    }

  }

  void Show(){

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

  void Reservation(){

    System.out.print("몇 행? ");
    int hang = sc.nextInt();
    System.out.print("몇 열? ");
    int yeol = sc.nextInt();

    if(chair[hang][yeol] == ' ') System.out.println("자리예약가능");
    else {
      System.out.println("이미 좌석이 있습니다.");
      return;
    }

    setChair(hang,yeol,'X');
    System.out.println(hang+"행"+yeol+"열 좌석 예약 완료되었습니다.");
    System.out.println();
  }
}
