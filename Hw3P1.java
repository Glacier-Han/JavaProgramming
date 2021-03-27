import java.util.Scanner;

class Hw3P1 {
	public static void main(String[] args){
		int a, qou;
		String resu;
		
		System.out.println("1억 미만의 정수 : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		qou = a/10000;
		a%=10000;
		resu = (qou>1) ? qou + "만 " : (qou==1) ? "만 " : "";
		System.out.printf("%s",resu);
		
		qou = a/1000;
		a%=1000;
		resu = (qou>1) ? qou + "천 " : (qou==1) ? "천 " : ""; 
		System.out.printf("%s",resu);

		qou = a/100;
		a%=100;
		resu = (qou>1) ? qou + "백 " : (qou==1) ? "백 " : ""; 
		System.out.printf("%s",resu);
		
		qou = a/10;
		resu = (qou>1) ? qou + "십 " : (qou==1) ? "십 " : "";
		System.out.printf("%s",resu);
		
		qou = a%10;
		System.out.printf("%s",(a==0) ? "" : a);
		
		//--------------------------------------------------------
		
		int year;
		System.out.println("\n\n년도 : ");
		year = sc.nextInt();
		System.out.println(year + "년은 ");
		
		if((year%4 == 0) && (year%100 != 0) || (year%400 == 0)){
				System.out.println("윤년입니다. ");
		}
		else{
			System.out.println("평년입니다. ");
		}
		
		
		
	}
}