import java.util.*;

class StringManipulate{
  String concat(String s1, String s2){
    String res;
    res = s1 + s2;
    return res;
  }

  String toUpper(String s){
    String res;
    res = s.toUpperCase();
    return res;
  }

  boolean equals(String s1, String s2){
    boolean res;
    res = s1.equals(s2);
    return res;
  }
}

class HW6_1{
  public static void main(String [] args){
    String s1,s2;
    Scanner sc = new Scanner(System.in);
    System.out.print("���� 1 : ");
    s1 = sc.next();
    System.out.print("���� 2 : ");
    s2 = sc.next();

    StringManipulate sm = new StringManipulate();
    System.out.println("��1�� ��2 ������ : " + sm.concat(s1, s2));
    System.out.println("��1 �빮�� ��ȯ��� : " + sm.toUpper(s1));
    System.out.println("��1�� ��2 ��ġ���� : " + sm.equals(s1,s2));
  }
}
