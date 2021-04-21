import java.util.Scanner;

class MS_1{
  public static void main(String[] args){

    //HW1 - 1
    Scanner sc = new Scanner(System.in);
    int a=20, b=45;
    /*
    System.out.print("ù��° ���� ���� : ");
    a = sc.nextInt();
    System.out.print("�ι�° ���� ���� : ");
    b = sc.nextInt();
    */

    System.out.printf("%-11s|%-11s|%-11s|%-11s|\n","number","decimal","octal","hexadecimal");
    System.out.printf("%-11s|%+11d|%#11o|%#11x|\n","number 1", a, a, a);
    System.out.printf("%-11s|%+11d|%#11o|%#11x|\n","number 2", b, b, b);
    System.out.printf("%-11s|%2$-+11d|%2$#-11o|%2$#-11x|\n","sum", a+b);

    //HW1 - 2
    String name = "Hong";
    int age=15;
    double weight=70.3456;

    System.out.printf("\"���� �̸��� '%s'\n\t���̴� %#x,\n\t\t�����Դ�%10.2f�Դϴ�.\"", name, age, weight);
    System.out.println();

    //HW2 - 2
    int inthw2 = 37;
    if(inthw2>>31 == 0) {
        System.out.printf("%d�� ����Դϴ�. �� ���� ������ %d�̰�,\n\t������ 4�� ���� ���� %d�̰�,\n\t\t�������� %d�Դϴ�.",inthw2, inthw2, inthw2>>2, inthw2&0b11);
    }
    else{
      System.out.printf("%d�� �����Դϴ�. �� ���� ������ %d�̰�,\n\t������ 4�� ���� ���� %d�̰�,\n\t\t�������� %d�Դϴ�.",inthw2, inthw2*-1, -1*inthw2>>2, inthw2&0b11);
    }
    System.out.println();

    //HW3 - 1
    System.out.printf("���� �Է� :");
    int a3;
    String res;
    a3 = sc.nextInt();
    res = a3/10000 > 1 ? a3/10000 + "�� " : (a3/10000 == 1 ? "�� " : "");
    System.out.print(res);
    a3%=10000;
    res = a3/1000 > 1 ? a3/1000 + "õ " : (a3/1000 == 1 ? "õ " : "");
    System.out.print(res);
    a3%=1000;
    res = a3/100 > 1 ? a3/100 + "�� " : (a3/100 == 1 ? "�� " : "");
    System.out.print(res);
    a3%=100;
    res = a3/10 > 1 ? a3/100 + "�� " : (a3/10 == 1 ? "�� " : (a3%10==0 ? "" : a3%10+""));
    System.out.print(res);
    System.out.println();

    //HW5 - �Ҽ�
    int cnt=1;
    int j;
    for(int i=1; i<=100; i++){
        for(j=2; j<=i; j++){
          if(i%j==0) {
            break;
        }
    }
    if(i==j) {
      System.out.printf("%2d ", i);
      if(cnt%5==0) System.out.println();
      cnt++;
    }
  }
  System.out.println();

  //HW5 - �Ƕ�̵�
    int hw51=5;
    for(int i=1; i<=hw51; i++){
      for(int k=0; k<hw51-i; k++) System.out.print(" ");
      for(int k=0; k<i; k++) System.out.print(i-1-k);
      for(int k=0; k<i-1; k++) System.out.print(k+1);
      System.out.println();
    }


  //HW5 - �����˻�
  String input,word;
  System.out.printf("����: ");
  input = sc.nextLine();
  sc.nextLine();
  System.out.printf("�˻��ܾ�: ");
  word = sc.next();

  int cnt1=0, wcnt=1;
  for(int i=0; i<input.length() - word.length()+1; i++){
    if(input.charAt(i) == ' ') cnt1++;
    if((input.substring(i,i+word.length())).equalsIgnoreCase(word)) {

      System.out.print(cnt1 + "��°, ");
      wcnt++;
    }
  }
    System.out.printf("\b\b �������� %s�� �˻��Ǿ�, �� %dȸ �˻��Ǿ����ϴ�.", word, wcnt);
}
}
