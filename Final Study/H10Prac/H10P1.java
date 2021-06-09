import java.util.*;

class H10P1{
  public static void main(String [] args){

    StringManipulate sm = new StringManipulate();

    String s1, s2;
    Scanner sc = new Scanner(System.in);
    System.out.print("1 : ");
    s1 = sc.nextLine();
    System.out.print("2 : ");
    s2 = sc.nextLine();

    System.out.println(sm.concat(s1,s2));
    System.out.println(sm.toUpper(s1));
    System.out.println(sm.equals(s1,s2));
    }
}

class StringManipulate{
  String concat(String s1, String s2){
    return s1 + s2;
  }

  String toUpper(String s1){
    return s1.toUpperCase();
  }

  boolean equals(String s1, String s2){
    return s1.equalsIgnoreCase(s2);
  }
}
