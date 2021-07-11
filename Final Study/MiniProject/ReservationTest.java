//Theater 클래스와 테스트클래스인 ReservationTest 클래스를 작성하고 이를 테스트.
//ReservationTest 클래스 에서 반드시 Theater 클래스의 객체 생성 후 이 객체를 통해 테스트진행.
//이외 세부조건 없음.

//2018111316 전자공학부A 한병하 미니프로젝트 과제입니다.
//1번 문제를 택하여 풀이하였습니다.
//한 학기동안 수고하셨습니다 :)

import java.util.*;

class ReservationTest{
  public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        Theater theater = new Theater();
        Reservation reserv = new Reservation();
        System.out.println("\n>-- 영화관 좌석 예매 프로그램입니다. --<");

        System.out.println();
        theater.showMe();

        while(true){
          
          System.out.print(">-- 예약하시겠습니까?(Y,y / N,n) : ");
          char yesorno = sc.next().charAt(0);
          if(yesorno == 'Y' || yesorno == 'y'){
            reserv.startReserve();
            theater.showMe();
          }

          else if(yesorno == 'N' || yesorno == 'n'){
            System.out.print("\n>-- 시스템을 종료합니다. --< ");
            System.exit(0);
          }

          else if(yesorno == 'd'){ //디버그
            theater.test();
            theater.showMe();
          }

          else {
            System.out.println(">-- 다시 입력해 주세요. --< ");
          }

        }

  }
}

class Theater{
	
	//가로세로 영화관 자리 배열 생성
	private static char [][] chair = new char[100][100];
	
	//세로인덱스 알파벳 배열 생성
	char [] seroindex = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

  Theater(){
    this.chairSetup();
  }

 
  void setChair(int a, int b, char input){
    this.chair[a][b] = input;
  }

  char getChair(int a, int b){
    return chair[a][b];
  }

  

  void chairSetup(){
	  
    for(int i=0; i<10; i++){
      for(int j=0; j<10; j++){
        Random ran = new Random();
        if(ran.nextBoolean() == true) chair[i][j] = 'X';
        else chair[i][j] = ' ';
      }
    }
  }
  
  //test
  void test(){
    chair[0][0] = ' ';
  }
  

  void showMe(){
	  
	System.out.println(">-- 현재 좌석 내역입니다 --<");
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

class Reservation extends Theater{
  Scanner sc = new Scanner(System.in);

  void startReserve(){
	 
      System.out.print(">-- 몇번째 행을 예약하시겠습니까? (ex : e) : ");

      char hangtmp = sc.next().charAt(0);
      int hang;

      if(hangtmp == 'a') hang = 0;
      else if(hangtmp == 'b') hang = 1;
      else if(hangtmp == 'c') hang = 2;
      else if(hangtmp == 'd') hang = 3;
      else if(hangtmp == 'e') hang = 4;
      else if(hangtmp == 'f') hang = 5;
      else if(hangtmp == 'g') hang = 6;
      else if(hangtmp == 'h') hang = 7;
      else if(hangtmp == 'i') hang = 8;
      else if(hangtmp == 'j') hang = 9;
      else {
        System.out.println("!!-- a ~ j 사이의 행을 입력해주세요 --!!");
        return;
      }

      System.out.print(">-- 몇번째 열을 예약하시겠습니까? (ex : 1) : ");
      int yeol = sc.nextInt() - 1;
      if(yeol < 0 || yeol > 9){
        System.out.println("!!-- 1~10 사이의 값을 입력해주세요 --!!");
        return;
      }
	
	if(getChair(hang, yeol) == ' ') {
	  System.out.println("\n>-- 현재 " + (hangtmp) +"행"+(yeol+1)+"열 좌석은 예약 가능합니다 --<\n>-- 예약을 진행하겠습니다 --<");
	}
	else if(getChair(hang, yeol) == 'X'){
	  System.out.println("\n>-- 현재 " + (hangtmp) +"행"+(yeol+1)+"열 좌석은 이미 예약되어 있습니다. --<\n>-- 다른 좌석을 선택해 주세요 --<");
	  startReserve();
	  return;
	}
	else {
	  System.out.println("!!-- 시스템 오류 --!!");
	  System.out.println(getChair(hang, yeol));
	  System.exit(9);
	}
	

    super.setChair(hang,yeol,'X');
    System.out.println("\n!!-- " + (hangtmp) +"행"+(yeol+1)+"열 좌석 예약 완료되었습니다 --!!");
    System.out.println();
  }
}
