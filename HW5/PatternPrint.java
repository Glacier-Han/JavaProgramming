import java.util.Scanner;

class PatternPrint{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int line = -100, garo = -100, sero = -100, repeat = -100;
		String type;
		
		//���� Ÿ�� �Է�
		while(true){
			System.out.print("������ Ÿ��: ");
			type = s.nextLine();
			if(type.equals("�Ƕ�̵�")||type.equals("�簢��")||type.equals("���̾Ƹ��")) break;
			System.out.println("[�Է¿���]������ Ÿ���� �Ƕ�̵�, �簢��, ���̾Ƹ�常 �����մϴ�. �ٽ� �Է����ּ���. ");
		}
		
		//���� ���μ� �Է�
		switch(type){
			case "�Ƕ�̵�":
				while(true){
					System.out.print("���� ��: ");
					line = s.nextInt();
					if(line>0 && line<=10) break;
					System.out.println("[�Է¿���]�Ƕ�̵��� ���� ���� 10������ ���� ������ �����մϴ�. �ٽ� �Է����ּ���.");
					
				}
				break;
				
			case "�簢��":
				while(true){
					System.out.print("����: ");
					garo = s.nextInt();
					if(garo>0) break;
					System.out.println("[�Է¿���]�簢���� ���δ� ���� ������ �����մϴ�. �ٽ� �Է����ּ���.");
				}
				while(true){
					System.out.print("����: ");
					sero = s.nextInt();
					if(sero>0) break;
					System.out.println("[�Է¿���]�簢���� ���δ� ���� ������ �����մϴ�. �ٽ� �Է����ּ���.");
				}
				while(true){
					System.out.print("�ݺ� Ƚ��: ");
					repeat = s.nextInt();
					if(repeat>0) break;
					System.out.println("[�Է¿���]�簢���� �ݺ� Ƚ���� ���� ������ �����մϴ�. �ٽ� �Է����ּ���.");
				}
				break;
				
			case "���̾Ƹ��":
				while(true){
					System.out.print("���� ��: ");
					line = s.nextInt();
					if(line>0 && line%2==1) break;
					System.out.println("[�Է¿���]���̾Ƹ���� ���� ���� ���� Ȧ���� �����մϴ�. �ٽ� �Է����ּ���.");
				}
				break;
		}
		
		
		//���� ���
		switch(type){
			case "�Ƕ�̵�":
				for(int i=1; i<=line; i++){
					for(int j=0; j<line-i; j++) System.out.print(" ");	
					for(int j=0; j<i-1; j++) System.out.print(i-1-j);	
					for(int j=0; j<i; j++) System.out.print(j);	
					System.out.println();
				}
				break;
				
			case "�簢��":
				for(int i=1; i<=sero; i++){
					for(int j=0; j<repeat; j++){
						for(int k=0; k<garo; k++){
							System.out.print("*");
						}
						System.out.print(" ");	
					}
					System.out.println();
				}
				break;
				
			case "���̾Ƹ��":
				//��ܺ�
				for(int i=1; i<=line/2+1; i++){
					for(int j=0; j<line/2+1-i; j++) System.out.print(" ");
					for(int j=0; j<2*i-1; j++) System.out.print("*");
					System.out.println();
				}
				//�ϴܺ�
				for(int i=1; i<=line/2; i++){
					for(int j=0; j<i; j++) System.out.print(" ");
					for(int j=0; j<line-2*i; j++) System.out.print("*");
					System.out.println();
				}
				break;
		}
		
	}
}