import java.util.Scanner;

class YearTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int year;
		
		System.out.print("�⵵: ");
		year = s.nextInt();
		
		System.out.printf("%d���� ", year);
		if(year%4==0 && year%100!=0 || year%400==0)
			System.out.println("�����Դϴ�.");
		else 
			System.out.println("����Դϴ�.");
		
	}
}