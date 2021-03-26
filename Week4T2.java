import java.util.Scanner;

class Week4T2 {
	public static void main(String[] args){
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수 두개를 입력하시오");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.printf("max : %d", a>b?a:b);
		System.out.printf("입력하신 두 수는 %d, %d이며, 최대는 %s의 수 입니다.", a,b,(a>b?"앞":(a==b?"동일":"뒤")));

	}
}