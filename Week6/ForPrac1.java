import java.util.Scanner;

class ForPrac1 {
	public static void main(String[] args){
		
		
		//3��
		for(char c='A'; c<='Z'; c++) System.out.print(c+" ");
		System.out.println();
		System.out.println("\n-----------------------------------");
		
		//4�� 
		int out = 11;
		for(int i=0; i<30; i++){
			System.out.printf(" %d",out);
			out +=4;
		}
		
		for(int i=127; i>=11; i-=4){
			System.out.print(" "+i);
		}
		System.out.println("\n-----------------------------------");
		
		
		//5��
		int sum=0;
		for(int i=0; i<10; i++){
			sum += i+1;
		}
		System.out.printf("sum : %d", sum);
		
		System.out.println("\n-----------------------------------");
		
		//6��
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.printf("���簢�� ���� ��:");
		input = sc.nextInt();
		for(int i=0; i<input; i++){
			for(int s=0; s<10; s++) System.out.print("*");
			System.out.print("\n");
		}
		
		//8�� **�߰����**
		int line;
		System.out.printf("���� �ﰢ�� ���� ��:");
		line = sc.nextInt();
		for(int i=1; i<line+1; i++){
			for(int s=0; s<i; s++) System.out.print("*");
			System.out.print("\n");
		}
		
		int line2;
		System.out.printf("�� ���� �ﰢ�� ���� ��:");
		line = sc.nextInt();
		for(int i=1; i<=line; i++){
			for(int j=0; j<line-i; j++) System.out.print(" "); 
			for(int j=0; j<i; j++) System.out.print("*");
			System.out.print("\n");
		}
		
		//
	}
}
