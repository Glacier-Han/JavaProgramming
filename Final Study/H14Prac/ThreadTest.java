import java.util.*;

class ThreadTest{
  public static void main(String [] args) throws Exception{

    String word = "���ΰ� �ʹ� �ϱ� �ȴ�";
    String word2 = "���ΰ� ���� �ϱ� �ȴ�";
    String word3 = "�߽��� ���� �԰� �ʹ�";
    String word4 = "���ֵ� � ���� �ʹ�";
    String word5 = "�۷��� ���� �ϰ� �ʹ�";
    for(int i=0; i<word.length(); i++){
      System.out.printf("%c %c %c %c %c\n",word.charAt(i),word2.charAt(i)
      ,word3.charAt(i), word4.charAt(i), word5.charAt(i));

      Thread.sleep(800);
    }
  }
}
