import java.util.*;

class ThreadTest{
  public static void main(String [] args) throws Exception{

    String word = "공부가 너무 하기 싫다";
    String word2 = "공부가 정말 하기 싫다";
    String word3 = "야식이 정말 먹고 싶다";
    String word4 = "제주도 놀러 가고 싶다";
    String word5 = "글램핑 정말 하고 싶다";
    for(int i=0; i<word.length(); i++){
      System.out.printf("%c %c %c %c %c\n",word.charAt(i),word2.charAt(i)
      ,word3.charAt(i), word4.charAt(i), word5.charAt(i));

      Thread.sleep(800);
    }
  }
}
