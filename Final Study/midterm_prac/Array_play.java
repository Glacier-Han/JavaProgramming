import java.util.*;

class Array_play{
  public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    Setup setup = new Setup();
    Reservation reserv = new Reservation();
    System.out.println(">-- ���� �¼� �����Դϴ� --<");
    System.out.println();
    setup.ChairSetup();
    setup.Show();

    System.out.print(">-- �����Ͻðڽ��ϱ�?(Y,y / N,n) --< ");
    char yesorno = sc.next().charAt(0);
    if(yesorno == 'Y' || yesorno == 'y'){
      reserv.Reservation();
      setup.Show();

    }

    else if(yesorno == 'N' || yesorno == 'n'){
      System.out.print(">-- ����ý����� �����մϴ�. --< ");
      System.exit(1);
    }

    else {
      System.out.println(">-- �ٽ� �Է��� �ּ���. --< ");
      return;
    }

  }
}

class Setup{

  //���μ��� ��ȭ�� �ڸ� �迭 ����
  char [][] chair = new char[100][100];

  void setChair(int a, int b, char input){
    this.chair[a][b] = input;
  }


  //�����ε��� ���ĺ� �迭 ����
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


class Reservation extends Setup{
  Scanner sc = new Scanner(System.in);

  void Reservation(){

    System.out.print("�� ��? ");
    int hang = sc.nextInt();
    System.out.print("�� ��? ");
    int yeol = sc.nextInt();

    if(chair[hang][yeol] == ' ') System.out.println("�ڸ����డ��");
    else {
      System.out.println("�̹� �¼��� �ֽ��ϴ�.");
      return;
    }

    setChair(hang,yeol,'X');
    System.out.println(hang+"��"+yeol+"�� �¼� ���� �Ϸ�Ǿ����ϴ�.");
    System.out.println();
  }
}
