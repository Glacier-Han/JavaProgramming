import java.util.Scanner;

class YearTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int year;
		
		System.out.print("년도: ");
		year = s.nextInt();
		
		System.out.printf("%d년은 ", year);
		if(year%4==0 && year%100!=0 || year%400==0)
			System.out.println("윤년입니다.");
		else 
			System.out.println("평년입니다.");
		
	}
}