import java.util.*;

class Array_play{
  public static void main(String [] args){


    Scanner sc = new Scanner(System.in);
    Setup setup = new Setup();
    Reservation reserv = new Reservation();
    System.out.println(">-- �ȳ��ϼ���, Glacier Theater �Դϴ�. --<");
    System.out.println(">-- ���� �¼� �����Դϴ� --<");
    System.out.println();
    setup.showMe();

    while(true){

      System.out.print(">-- �����Ͻðڽ��ϱ�?(Y,y / N,n) --< ");
      char yesorno = sc.next().charAt(0);
      if(yesorno == 'Y' || yesorno == 'y'){
        reserv.startReserve();
        setup.showMe();
      }

      else if(yesorno == 'N' || yesorno == 'n'){
        System.out.print(">-- �ý����� �����մϴ�. --< ");
        System.exit(0);
      }

      else if(yesorno == 'd'){ //����� �޼ҵ�
        setup.test();
        setup.showMe();
      }

      else {
        System.out.println(">-- �ٽ� �Է��� �ּ���. --< ");
      }

    }

  }
}

class Setup{

  Setup(){
    this.chairSetup();
  }

  //���μ��� ��ȭ�� �ڸ� �迭 ����
  static char [][] chair = new char[100][100];

  void setChair(int a, int b, char input){
    this.chair[a][b] = input;
  }

  char getChair(int a, int b){
    return chair[a][b];
  }


  //�����ε��� ���ĺ� �迭 ����
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

  void startReserve(){

    System.out.print("���° ���� �����Ͻðڽ��ϱ�? ");
    int hang = sc.nextInt() - 1;
    System.out.print("���° ���� �����Ͻðڽ��ϱ�? ");
    int yeol = sc.nextInt() - 1;

    if(getChair(yeol, hang) == ' ') {
      System.out.println("���� " + (hang+1) +"��"+(yeol+1)+"�� �¼��� ���� �����մϴ�.\n������ �����ϰڽ��ϴ�.");
    }
    else if(getChair(yeol, hang) == 'X'){
      System.out.println("���� " + (hang+1) +"��"+(yeol+1)+"�� �¼��� �̹� ����Ǿ� �ֽ��ϴ�.\n�ٸ� �¼��� ������ �ּ���.");
      System.exit(1);
    }
    else {
      System.out.println("�ý��� ����");
      System.out.println(chair[yeol][hang]);
      System.exit(9);
    }

    super.setChair(yeol,hang,'X');
    System.out.println((hang+1) +"��"+(yeol+1)+"�� �¼� ���� �Ϸ�Ǿ����ϴ�.");
    System.out.println();
  }
}
