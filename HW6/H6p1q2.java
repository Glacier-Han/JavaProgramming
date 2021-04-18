import java.util.Scanner;

class H6p1q2{
  public static void main(String[] args){
    if(args.length==0) System.out.println("[사용법]java H6p1q2 정수1 정수2.....");

    String tem;
    //A 짝수출력
    for(int i=0; i<args.length; i++){
      if(Integer.parseInt(args[i])%2==0) System.out.print(args[i]+" ");
    }

    System.out.println();

    //B 오름차순출력
    for(int i=0; i<args.length; i++){
      for(int j=0; j<args.length-1; j++){
        if(Integer.parseInt(args[j])>Integer.parseInt(args[j+1])){
          tem = args[j];
          args[j] = args[j+1];
          args[j+1] = tem;
        }
      }
    }
    for(int i=0; i<args.length; i++) System.out.print(args[i]+" ");
  }
}
