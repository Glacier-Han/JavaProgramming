import java.util.*;

class Week7Test2{
	public static void main(String[] args){
		//HW6 1-B
		char tem;
		if(args.length == 0) System.out.println("[�Է¿���]");
		else{
				System.out.println("���� ���ڿ�: ");
				for(int i=0; i<args[0].length()-1; i++){
					for(int j=0; j<i; j++){

						System.out.print(args[0].charAt(j));
					}
				}
				
				
			}
			
		
	}
}