import java.util.*;

class ArrayPrac3{
	
	//����࿡ ���ڰ� ���ٸ� ������ �˸��� ���α׷� ����
	
	public static void main(String[] args){
		if(args.length!=2){
			System.out.println("[����] java ArrayPrac3 ����1 ����2");
			System.exit(1);
		}
		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
		System.out.println(Double.parseDouble(args[0])+Double.parseDouble(args[1]));
		System.out.println();
		
	}
}