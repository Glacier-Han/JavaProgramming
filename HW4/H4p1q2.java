import java.util.Scanner;

//case를 이용해 다시풀어보기, result초기화

class H4p1q2{
  public static void main(String[] args){

    double a, b, resu = 0;
    char c;

    Scanner sc = new Scanner(System.in);
    System.out.print("식을 입력하세요(ex. 7+4): ");
    a = sc.nextDouble();
    c = sc.next().charAt(0);
    b = sc.nextDouble();

    if(c == '/' && b == 0){
      System.out.println("0으로 나눌 수 없습니다. ");
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
