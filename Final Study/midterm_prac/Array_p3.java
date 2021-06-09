import java.util.*;

class Array_p3{
  public static void main(String [] args){

    int jcnt = 0;
    int mcnt = 0;
    for(int i=0; i<args[0].length(); i++){
      if(args[0].charAt(i) == 'a' || args[0].charAt(i) == 'e' || args[0].charAt(i) == 'i'
      || args[0].charAt(i) == 'o' || args[0].charAt(i) == 'u'){
        jcnt++;
      }
      else mcnt++;
    }

    System.out.println("ÀÚÀ½°¹¼ö " + jcnt + "°³ ¸ðÀ½°¹¼ö" + mcnt +"°³");
  }
}

class Array_p3_1{
  public static void main(String [] args){
    for(int i=0; i<args[0].length(); i++){
      System.out.print(args[0].charAt(args[0].length()-i-1));
    }
  }
}
