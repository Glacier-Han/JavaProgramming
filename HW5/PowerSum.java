<<<<<<< HEAD
import java.util.Scanner;

class PowerSum{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int n, sum = 0;
		
		while(true){
			System.out.print("1���� ū ����: ");
			n = s.nextInt();
			
			if(n>1) break;
			System.out.println("[�Է¿���]1���� ū ������ �Է����ּ���. ");
		}
		
		for(int i=1; i<=n; i++){
			if(i%2==0){
				sum -= Math.pow(i,2);
				System.out.print(i+"��+");
			}
			else{
				sum += Math.pow(i,2);
				System.out.print(i+"��-");
			}
		}
		
		System.out.println("\b= "+sum);
		
	}
=======
import java.util.Scanner;

class PowerSum{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int n, sum = 0;
		
		while(true){
			System.out.print("1���� ū ����: ");
			n = s.nextInt();
			
			if(n>1) break;
			System.out.println("[�Է¿���]1���� ū ������ �Է����ּ���. ");
		}
		
		for(int i=1; i<=n; i++){
			if(i%2==0){
				sum -= Math.pow(i,2);
				System.out.print(i+"��+");
			}
			else{
				sum += Math.pow(i,2);
				System.out.print(i+"��-");
			}
		}
		
		System.out.println("\b= "+sum);
		
	}
>>>>>>> 99344cf6d6a855103188cdb0a595d802a2c11c34
}