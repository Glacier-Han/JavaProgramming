import java.util.Scanner;

class ForPrac2{
	public static void main(String[] args){
		
		//6�� - 3
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.printf("�ﰢ�� ���� ��:");
		input = sc.nextInt();
		for(int i=1; i<=input; i++){
			for(int s=0; s<input - i; s++) System.out.print(" ");
			for(int s=0; s<2*i - 1; s++) System.out.print("*");

			System.out.print("\n");
		}
	}
}
