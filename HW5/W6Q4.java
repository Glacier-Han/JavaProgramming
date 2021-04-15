import java.util.Scanner;

class W6Q4{
  public static void main(String[] args){

      String input;
      String word;
      int cnt=1;
      int tcnt=0;
      Scanner sc = new Scanner(System.in);

      System.out.print("문자열: ");
      input = sc.nextLine();
      System.out.print("문자 : ");
      word = sc.nextLine();

      for(int i=0; i<input.length(); i++){
        if(input.charAt(i) == word.charAt(0)) {
          System.out.printf("%d번째 ",cnt);
          tcnt++;
      }
      cnt++;
    }
    System.out.printf("\n문자열 %s에서 문자 %s는 %d번 검색되었습니다. ",input, word, tcnt);
  }
}
