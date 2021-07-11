//Theater Ŭ������ �׽�ƮŬ������ ReservationTest Ŭ������ �ۼ��ϰ� �̸� �׽�Ʈ.
//ReservationTest Ŭ���� ���� �ݵ�� Theater Ŭ������ ��ü ���� �� �� ��ü�� ���� �׽�Ʈ����.
//�̿� �������� ����.

//2018111316 ���ڰ��к�A �Ѻ��� �̴�������Ʈ �����Դϴ�.
//1�� ������ ���Ͽ� Ǯ���Ͽ����ϴ�.
//�� �б⵿�� �����ϼ̽��ϴ� :)

import java.util.*;

class ReservationTest{
  public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        Theater theater = new Theater();
        Reservation reserv = new Reservation();
        System.out.println("\n>-- ��ȭ�� �¼� ���� ���α׷��Դϴ�. --<");

        System.out.println();
        theater.showMe();

        while(true){
          
          System.out.print(">-- �����Ͻðڽ��ϱ�?(Y,y / N,n) : ");
          char yesorno = sc.next().charAt(0);
          if(yesorno == 'Y' || yesorno == 'y'){
            reserv.startReserve();
            theater.showMe();
          }

          else if(yesorno == 'N' || yesorno == 'n'){
            System.out.print("\n>-- �ý����� �����մϴ�. --< ");
            System.exit(0);
          }

          else if(yesorno == 'd'){ //�����
            theater.test();
            theater.showMe();
          }

          else {
            System.out.println(">-- �ٽ� �Է��� �ּ���. --< ");
          }

        }

  }
}

class Theater{
	
	//���μ��� ��ȭ�� �ڸ� �迭 ����
	private static char [][] chair = new char[100][100];
	
	//�����ε��� ���ĺ� �迭 ����
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
	  
	System.out.println(">-- ���� �¼� �����Դϴ� --<");
    //���� �⺻��ȣ ����
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
	 
      System.out.print(">-- ���° ���� �����Ͻðڽ��ϱ�? (ex : e) : ");

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
        System.out.println("!!-- a ~ j ������ ���� �Է����ּ��� --!!");
        return;
      }

      System.out.print(">-- ���° ���� �����Ͻðڽ��ϱ�? (ex : 1) : ");
      int yeol = sc.nextInt() - 1;
      if(yeol < 0 || yeol > 9){
        System.out.println("!!-- 1~10 ������ ���� �Է����ּ��� --!!");
        return;
      }
	
	if(getChair(hang, yeol) == ' ') {
	  System.out.println("\n>-- ���� " + (hangtmp) +"��"+(yeol+1)+"�� �¼��� ���� �����մϴ� --<\n>-- ������ �����ϰڽ��ϴ� --<");
	}
	else if(getChair(hang, yeol) == 'X'){
	  System.out.println("\n>-- ���� " + (hangtmp) +"��"+(yeol+1)+"�� �¼��� �̹� ����Ǿ� �ֽ��ϴ�. --<\n>-- �ٸ� �¼��� ������ �ּ��� --<");
	  startReserve();
	  return;
	}
	else {
	  System.out.println("!!-- �ý��� ���� --!!");
	  System.out.println(getChair(hang, yeol));
	  System.exit(9);
	}
	

    super.setChair(hang,yeol,'X');
    System.out.println("\n!!-- " + (hangtmp) +"��"+(yeol+1)+"�� �¼� ���� �Ϸ�Ǿ����ϴ� --!!");
    System.out.println();
  }
}
