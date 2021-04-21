import java.util.Scanner;

class MS_1{
  public static void main(String[] args){

    //HW1 - 1
    Scanner sc = new Scanner(System.in);
    int a=20, b=45;
    /*
    System.out.print("첫번째 양의 정수 : ");
    a = sc.nextInt();
    System.out.print("두번째 양의 정수 : ");
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

    System.out.printf("\"나의 이름은 '%s'\n\t나이는 %#x,\n\t\t몸무게는%10.2f입니다.\"", name, age, weight);
    System.out.println();

    //HW2 - 2
    int inthw2 = 37;
    if(inthw2>>31 == 0) {
        System.out.printf("%d는 양수입니다. 이 수의 절댓값은 %d이고,\n\t절댓값을 4로 나눈 몫은 %d이고,\n\t\t나머지는 %d입니다.",inthw2, inthw2, inthw2>>2, inthw2&0b11);
    }
    else{
      System.out.printf("%d는 음수입니다. 이 수의 절댓값은 %d이고,\n\t절댓값을 4로 나눈 몫은 %d이고,\n\t\t나머지는 %d입니다.",inthw2, inthw2*-1, -1*inthw2>>2, inthw2&0b11);
    }
    System.out.println();

    //HW3 - 1
    System.out.printf("정수 입력 :");
    int a3;
    String res;
    a3 = sc.nextInt();
    res = a3/10000 > 1 ? a3/10000 + "만 " : (a3/10000 == 1 ? "만 " : "");
    System.out.print(res);
    a3%=10000;
    res = a3/1000 > 1 ? a3/1000 + "천 " : (a3/1000 == 1 ? "천 " : "");
    System.out.print(res);
    a3%=1000;
    res = a3/100 > 1 ? a3/100 + "백 " : (a3/100 == 1 ? "백 " : "");
    System.out.print(res);
    a3%=100;
    res = a3/10 > 1 ? a3/100 + "십 " : (a3/10 == 1 ? "십 " : (a3%10==0 ? "" : a3%10+""));
    System.out.print(res);
    System.out.println();

    //HW5 - 소수
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

  //HW5 - 피라미드
    int hw51=5;
    for(int i=1; i<=hw51; i++){
      for(int k=0; k<hw51-i; k++) System.out.print(" ");
      for(int k=0; k<i; k++) System.out.print(i-1-k);
      for(int k=0; k<i-1; k++) System.out.print(k+1);
      System.out.println();
    }


  //HW5 - 어절검색
  String input,word;
  System.out.printf("문장: ");
  input = sc.nextLine();
  sc.nextLine();
  System.out.printf("검색단어: ");
  word = sc.next();

  int cnt1=0, wcnt=1;
  for(int i=0; i<input.length() - word.length()+1; i++){
    if(input.charAt(i) == ' ') cnt1++;
    if((input.substring(i,i+word.length())).equalsIgnoreCase(word)) {

      System.out.print(cnt1 + "번째, ");
      wcnt++;
    }
  }
    System.out.printf("\b\b 어절에서 %s가 검색되어, 총 %d회 검색되었습니다.", word, wcnt);
}
}
