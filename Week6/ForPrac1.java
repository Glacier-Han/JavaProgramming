import java.util.Scanner;

class ForPrac1 {
	public static void main(String[] args){
		
		
		//3번
		for(char c='A'; c<='Z'; c++) System.out.print(c+" ");
		System.out.println();
		System.out.println("\n-----------------------------------");
		
		//4번 
		int out = 11;
		for(int i=0; i<30; i++){
			System.out.printf(" %d",out);
			out +=4;
		}
		
		for(int i=127; i>=11; i-=4){
			System.out.print(" "+i);
		}
		System.out.println("\n-----------------------------------");
		
		
		//5번
		int sum=0;
		for(int i=0; i<10; i++){
			sum += i+1;
		}
		System.out.printf("sum : %d", sum);
		
		System.out.println("\n-----------------------------------");
		
		//6번
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.printf("직사각형 라인 수:");
		input = sc.nextInt();
		for(int i=0; i<input; i++){
			for(int s=0; s<10; s++) System.out.print("*");
			System.out.print("\n");
		}
		
		//8번 **중간고사**
		int line;
		System.out.printf("직각 삼각형 라인 수:");
		line = sc.nextInt();
		for(int i=1; i<line+1; i++){
			for(int s=0; s<i; s++) System.out.print("*");
			System.out.print("\n");
		}
		
		int line2;
		System.out.printf("역 직각 삼각형 라인 수:");
		line = sc.nextInt();
		for(int i=1; i<=line; i++){
			for(int j=0; j<line-i; j++) System.out.print(" "); 
			for(int j=0; j<i; j++) System.out.print("*");
			System.out.print("\n");
		}
		
		//
	}
}
