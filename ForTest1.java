import java.util.Scanner;

class ForTest1{
	public static void main(String[] args){
		
		String input;
		int leng ;
		int lenginput;
		char resu;
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		input = sc.nextLine();
		leng = (int)input.length();
		
		while(true){
			System.out.print("x : ");
			lenginput = sc.nextInt();
			if(lenginput > 0){
				if(lenginput <= leng)
				break;	
			}
			
			System.out.println("[�Է¿���] x�� ���ڿ��� ���� ������ ���� ������ ��ȿ�մϴ�.");
		}
		resu = input.charAt(lenginput-1);
		System.out.println("�Է��Ͻ� ���ڿ� " + input + "���� " + lenginput + "�� ° ���ڴ� '" + resu +"' �Դϴ� ");
		
		
	}
}