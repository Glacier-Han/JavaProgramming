import java.util.Scanner;

class W6Q4{
  public static void main(String[] args){

      String input;
      String word;
      int cnt=1;
      int tcnt=0;
      Scanner sc = new Scanner(System.in);

      System.out.print("���ڿ�: ");
      input = sc.nextLine();
      System.out.print("���� : ");
      word = sc.nextLine();

      for(int i=0; i<input.length(); i++){
        if(input.charAt(i) == word.charAt(0)) {
          System.out.printf("%d��° ",cnt);
          tcnt++;
      }
      cnt++;
    }
    System.out.printf("\n���ڿ� %s���� ���� %s�� %d�� �˻��Ǿ����ϴ�. ",input, word, tcnt);
  }
}
