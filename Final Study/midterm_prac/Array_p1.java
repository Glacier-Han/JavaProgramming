import java.util.*;

class Array_p1{
  public static void main(String [] args){
    if(args.length == 0) {
      System.out.println("[»ç¿ë¹ý]");
    }

    for(int i=0; i<args.length; i++){
      for(int j=0; j<i; j++){
        String tem;
        if(Integer.parseInt(args[i]) < Integer.parseInt(args[j])) {
          tem = args[i];
          args[i] = args[j];
          args[j] = tem;
        }
      }
    }

    for(int i=0; i<args.length; i++){
      System.out.print(args[i] + " ");
    }

  }
}
