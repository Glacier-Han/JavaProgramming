import java.util.Scanner;

class H6p1q1{
  public static void main(String[] args){
    //A ������������
    //���� : a,e,i,o,u
    int a=0,b=0;
    String word = args[0];

    for(int i=0; i<word.length(); i++){
      if((word.charAt(i)>='a'&&word.charAt(i)<='z') || (word.charAt(i)>='A'&&word.charAt(i)<='Z'))
      if(word.charAt(i)=='a' || word.charAt(i)=='e'
      || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u'
      || word.charAt(i)=='A' || word.charAt(i)=='E' || word.charAt(i)=='O'
      || word.charAt(i)=='U' || word.charAt(i)=='I' ){
        a++;
      }
      else b++;
    }

    System.out.println("���� ����: "+b);
    System.out.println("���� ����: "+a);

    //B �������
    for(int i=word.length(); i>0; i--){
        System.out.print(word.charAt(i-1));
    }


  }
}
