import java.util.Scanner;

class Hw3P1 {
	public static void main(String[] args){
		int a, qou;
		String resu;
		
		System.out.println("1�� �̸��� ���� : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		qou = a/10000;
		a%=10000;
		resu = (qou>1) ? qou + "�� " : (qou==1) ? "�� " : "";
		System.out.printf("%s",resu);
		
		qou = a/1000;
		a%=1000;
		resu = (qou>1) ? qou + "õ " : (qou==1) ? "õ " : ""; 
		System.out.printf("%s",resu);

		qou = a/100;
		a%=100;
		resu = (qou>1) ? qou + "�� " : (qou==1) ? "�� " : ""; 
		System.out.printf("%s",resu);
		
		qou = a/10;
		resu = (qou>1) ? qou + "�� " : (qou==1) ? "�� " : "";
		System.out.printf("%s",resu);
		
		qou = a%10;
		System.out.printf("%s",(a==0) ? "" : a);
		
		//--------------------------------------------------------
		
		int year;
		System.out.println("\n\n�⵵ : ");
		year = sc.nextInt();
		System.out.println(year + "���� ");
		
		if((year%4 == 0) && (year%100 != 0) || (year%400 == 0)){
				System.out.println("�����Դϴ�. ");
		}
		else{
			System.out.println("����Դϴ�. ");
		}
		
		
		
	}
}