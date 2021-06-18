import java.util.*;

class DicTest2{
  public static void main(String [] args){

    //내가만든문제
    //배열 안에 무작위단어 5개 사전식정렬

    String [] dic = {"erasd", "bers" , "awera", "Abcd", "AbcZ", "abce", "abcd", "Zdar"};

    for(int i=0; i<dic.length; i++){
      for(int j=0; j<i; j++){

        if(dic[i].compareTo(dic[j]) < 0){
          String tem;
          tem = dic[i];
          dic[i] = dic[j];
          dic[j] = tem;
        }
      }
    }

    for(int i=0; i<dic.length; i++){
      System.out.print(dic[i] + " ");
    }

  }
}
