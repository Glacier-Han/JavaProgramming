import java.util.Scanner;

class PreTest{
	public static void main(String[] args){
		int line, rep;
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		line = sc.nextInt();
		System.out.print("�ݺ�: ");
		rep = sc.nextInt();
		
		for(int i=1; i<=line; i++){
			//i��° ���� : ���� line-1, �� i, ���� 1��
			for(int r=0; r<rep; r++){
				for(int j=0; j<(line-i); j++) {
					System.out.print(" ");
				}
				for(int j=0; j<i; j++) {
					System.out.print(i-j-1);
				}
		
				for(int j=0; j<i-1; j++){
					System.out.print(j+1);
				}
				for(int j=0; j<(line-i+3); j++) {
					System.out.print(" ");
				}
				
				
			}
			System.out.println();
		}
		
		
	}
}