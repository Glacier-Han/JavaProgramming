import java.util.Scanner;

//case�� �̿��� �ٽ�Ǯ���, result�ʱ�ȭ

class H4p1q2{
  public static void main(String[] args){

    double a, b, resu = 0;
    char c;

    Scanner sc = new Scanner(System.in);
    System.out.print("���� �Է��ϼ���(ex. 7+4): ");
    a = sc.nextDouble();
    c = sc.next().charAt(0);
    b = sc.nextDouble();

    if(c == '/' && b == 0){
      System.out.println("0���� ���� �� �����ϴ�. ");
      System.exit(1);
    }

    else if (c == '+'){
      resu = a + b;
    }

    else if (c == '-'){
      resu = a - b;
    }

    else if (c == '*'){
      resu = a*b;
    }

    else if (c == '/'){
      resu = a/b;
    }

    else if (c == '%'){
      resu = a%b;
    }

    if(resu == (int)resu){
      System.out.println((int)resu);
    }

    else {
      System.out.println(resu);
    }


  }
}
