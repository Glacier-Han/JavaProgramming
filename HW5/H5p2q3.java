import java.util.Scanner;

class H5p2q3{
	public static void main(String[] args){
		
		String type;
		int line;
		int width, height, rep;
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("������ Ÿ��: ");
			type = sc.nextLine();
			if(type.equals("�Ƕ�̵�") || type.equals("�簢��") || type.equals("���̾Ƹ��")) break;
			System.out.print("[�Է¿���]");
		}
		
		switch(type){
			case "�Ƕ�̵�": 
				System.out.print("���� ��: ");
				line = sc.nextInt();
				for(int i=1; i<=line; i++){
					for(int j=line; j>i; j--) System.out.print(" ");
					for(int k=i-1; k>=0; k--) System.out.print(k);
					for(int s=1; s<i; s++) System.out.print(s);
					System.out.print("\n");
				}
				break;
				
			case "�簢��":
				System.out.print("����: ");
				width = sc.nextInt();
				System.out.print("����: ");
				height = sc.nextInt();
				System.out.print("�ݺ� Ƚ��: ");
				rep = sc.nextInt();
				
				for(int i=0; i<height; i++){
					for(int j=0; j<rep; j++){
						for(int s=0; s<width; s++) {
							System.out.print("*");
						}
						System.out.print(" ");
					}
					System.out.print("\n");
				}
				break;
				
				case "���̾Ƹ��":
					System.out.print("���� ��: ");
					line = sc.nextInt();
					for(int i=1; i<=line/2+1; i++) {
						for(int j=line/2; j>=i; j--) System.out.print(" ");
						for(int j=1; j<= 2*i-1; j++) System.out.print("*");
						System.out.print("\n");
					}
					for(int i=line/2; i>=1; i--){
						for(int j=line/2; j>=i; j--) System.out.print(" ");
						for(int j=1; j<= i*2-1; j++) System.out.print("*");
						System.out.print("\n");
					}
				
		}
	}
	
}