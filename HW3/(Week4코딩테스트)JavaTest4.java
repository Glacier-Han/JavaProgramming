import java.util.Scanner;

//>>31�ε� 16�̶�� ����

class JavaTest4{
	public static void main(String[] args){
		
		double userinput;
		int resu;
		int abs;
		int absresu;
		String abskor;
		
		System.out.print("-1000�ʰ� 1000�̸��� �Ǽ�: ");
		Scanner sc = new Scanner(System.in);
		userinput = sc.nextDouble();
		
		
		
		resu = (int)userinput;
		
		System.out.printf("�Է��� �Ǽ��� �����κ�: %d\n", resu);
		
		if(resu >> 31  == 0xffffffff ){
			
			abs = -resu;
			System.out.printf("���� �κ��� ����: %d", abs);
			
			absresu = abs/100;
			abs%=100;
			abskor = (absresu>1)?absresu + "�� ":(absresu==1)?"�� ":"";
			System.out.printf("(%s", abskor);
			
			absresu = abs/10;
			
			abskor = (absresu>1)?absresu + "�� ":(absresu==1)?"�� ":"";
			System.out.printf("%s", abskor);
			absresu %=10;
			System.out.printf("%s)", absresu);
		}
		
		
		else {
			abs = resu;
			System.out.printf("���� �κ��� ����: %d", abs);
			
			absresu = abs/100;
			abs%=100;
			abskor = (absresu>1)?absresu + "�� ":(absresu==1)?"�� ":"";
			System.out.printf("(%s", abskor);
			
			absresu = abs/10;
			
			abskor = (absresu>1)?absresu + "�� ":(absresu==1)?"�� ":"";
			System.out.printf("%s", abskor);
			absresu%=10;
			System.out.printf("%s)", absresu);
		}
	
	
	
	}
}

