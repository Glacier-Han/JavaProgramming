import java.util.*;

class ArrayPrac3{
	
	//명령행에 인자가 없다면 사용법을 알리고 프로그램 종료
	
	public static void main(String[] args){
		if(args.length!=2){
			System.out.println("[사용법] java ArrayPrac3 정수1 정수2");
			System.exit(1);
		}
		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
		System.out.println(Double.parseDouble(args[0])+Double.parseDouble(args[1]));
		System.out.println();
		
	}
}