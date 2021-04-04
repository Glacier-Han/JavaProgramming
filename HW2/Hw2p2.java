import java.util.Scanner;

class Hw2p2 {
	public static void main(String[] args){
		
		int a;
		int feet;
		double inch;
		System.out.printf("키 : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		inch = a/2.54;
		feet = (int)(inch/12);
		inch -= feet*12;
		
		System.out.printf("%d는 %d피트 %f인치입니다.",a, feet, inch);
		
		
		//--------------------------------------------------------------
		
		int b, abs;
		System.out.printf("정수 : ");
		Scanner sc2 = new Scanner(System.in);
		b = sc2.nextInt();
		if ((b & 0x80000000) == 0){
			abs = b;
			System.out.printf("%d는(은) 양수입니다. 이수의 절댓값은 %d이고, ", b, abs);
		
		}
		else {
			abs = -b;
			System.out.printf("%d는(은) 음수입니다. 이수의 절댓값은 %d이고, ",b ,abs);
		}
		
		System.out.printf("\n\t절댓값을 4로 나눈 몫은 %d이고,\n\t\t나머지는 %d입니다.", abs>>2, abs&3);

	}
}