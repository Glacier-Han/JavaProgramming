import java.util.Scanner;

class ForPrac3{
	public static void main(String[] args){
		//"String".substring(a,b); --> a���� b������ , 0���ͽ���
		
		//"abc".compareTo("abdc"); --> c,d���� �ٸ��Ƿ� c-d = -1
		//"abc".compareToIgnoreCase("ABC"); --> 0
		//compareTo �߿�****
		
		//"HELLO, world!".replaceAll(���ܾ�, �Ŵܾ�);
		//EX) "HELLO, world!".replaceAll("HELLO", "hello"); --> "hello, world!"
		//EX) "HELLO, world!".replaceAll("HELLO", "hi"); --> "hi, world!"
		
		//toLowerCase --> ��繮�� �ҹ��ڷ�
		//toUpperCase --> ��繮�� �빮�ڷ�
		//EX) String str2 = "HELLO, world!";
		//EX) String str3 = str2.toUpperCase(); --> str2�� �빮�ڷ� �����Ȱ� '��ȯ' �ϱ� ������ ���ο� ������ ������ �ǹ̰�����
		//EX) String str4 = str2.replaceAll("HELLO", "hi"); --> ���������� �� ��ȯ�̱� ������ ���ο� ������ ��ƾ���.
		
		
		System.out.println("�ݺ��� �ǽ����� 10��");
		
		String input;
		String str;
		int a,b,tem;
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ�: ");
		input = sc.nextLine();
		while(true){
			System.out.print("a: ");
			a = sc.nextInt();
			if(a>0 && a<= input.length()) break;
			System.out.println("[�Է¿���]");
		}
		while(true){
			System.out.print("b: ");
			b = sc.nextInt();
			if(b>0 && b<= input.length()) break;
			System.out.println("[�Է¿���]");
		}
		if(a>b) {
			tem = a; //�ӽú����� ���
			a = b;
			b = tem;
		}
		str = input.substring(a-1, b);
		System.out.printf("�Է��� ���ڿ� %s���� %d���� %d���� ������ ���ڿ��� %s�Դϴ�.", input, a, b, str );
		
	}
}
