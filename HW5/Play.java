import java.util.Scanner;

class Play{
	public static void main(String[] args){
		
		String type;
		int line;
		int width, height, rep;
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("??? : ");
			type = sc.nextLine();
			if(type.equals("���� �ϱ� �ȴ�")) break;
			System.out.println("[�Է¿���] �����ϰ� �Է��ϼ���.");
		}
		
		switch(type){
			case "���� �ϱ� �ȴ�":
				for(int i=1; i<=6/2+1; i++) {
						for(int j=6/2; j>=i; j--) System.out.print("   ");
						for(int j=1; j<= 2*i-1; j++) System.out.print("����");
						System.out.print("\n\n");
					}
					for(int i=6/2; i>=1; i--){
						for(int j=6/2; j>=i; j--) System.out.print("   ");
						for(int j=1; j<= i*2-1; j++) System.out.print("�ȴ�");
						System.out.print("\n\n");
					}
					
			int cnt=0, numOfWord=0;
			for(int i=0; i<type.length()-"�ȴ�".length()+1; i++){
				if(type.charAt(i)==' ' &&type.charAt(i+1)!=' ')
					numOfWord++;
				if("�ȴ�".equalsIgnoreCase(type.substring(i, i+"�ȴ�".length()))){
					System.out.printf("%d��°, ", numOfWord);
					cnt++;
					}
			}
			if(cnt!=0) 
				System.out.printf("\b\b �������� \"%s\"�� �˻��Ǿ� �� %dȸ �˻��Ǿ����ϴ�. \n", word, cnt);
			else
				System.out.printf(" �� %dȸ �˻��Ǿ����ϴ�. \n", cnt);
		}
	}
}
