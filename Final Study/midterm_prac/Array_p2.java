import java.util.*;

class Array_p2{
  public static void main(String [] args){

    //�������繮��
    //�迭 �ȿ� �������ܾ� 5�� ����������

    String [] dic = {"erasd", "bers" , "awera", "Abcd", "AbcZ", "abce", "abcd", "Zdar"};

    for(int i=0; i<dic.length; i++){
      for(int j=0; j<i; j++){
        String tem;
        if(dic[i].compareTo(dic[j])<0){
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
