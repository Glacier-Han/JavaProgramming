import java.util.Scanner;

class RepeatEx1{
	public static void main(String[] args){
		
		
		//ver1-------------while----------------
		System.out.println("ver1");
		int age;
		System.out.print("���� : ");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		while(age < 0 || age >= 200) {
			System.out.println("[�Է¿���]���̴� 0���̻� 200�� �̸��� ���� ��ȿ�մϴ�.");
			System.out.print("���� : ");
			age = sc.nextInt();
		}
		System.out.println("����� ���̴� "+ age + "�� �Դϴ�.");
		
		//ver2--------------dowhile-------------
		System.out.println("ver2");
		do{
			System.out.print("���� : ");
			age = sc.nextInt();
			if(age<0 || age>=200) 
				System.out.println("[�Է¿���]���̴� 0���̻� 200�� �̸��� ���� ��ȿ�մϴ�.");
			System.out.println("����� ���̴� "+ age + "�� �Դϴ�.");
		}while(age < 0 || age >= 200);
		
		
		//ver3--------------InfiniteLoop--------
		System.out.println("ver3");
		while(true){
			System.out.print("���� : ");
			age = sc.nextInt();
			//Ż������
			if(age>0 && age<200) 
				break;
			System.out.println("[�Է¿���]���̴� 0���̻� 200�� �̸��� ���� ��ȿ�մϴ�.");
		}
		System.out.println("����� ���̴� "+ age + "�� �Դϴ�.");
	}
}
