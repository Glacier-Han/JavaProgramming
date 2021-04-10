<<<<<<< HEAD
import java.util.Scanner;

class PowerSum{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int n, sum = 0;
		
		while(true){
			System.out.print("1보다 큰 정수: ");
			n = s.nextInt();
			
			if(n>1) break;
			System.out.println("[입력오류]1보다 큰 정수를 입력해주세요. ");
		}
		
		for(int i=1; i<=n; i++){
			if(i%2==0){
				sum -= Math.pow(i,2);
				System.out.print(i+"²+");
			}
			else{
				sum += Math.pow(i,2);
				System.out.print(i+"²-");
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
			System.out.print("1보다 큰 정수: ");
			n = s.nextInt();
			
			if(n>1) break;
			System.out.println("[입력오류]1보다 큰 정수를 입력해주세요. ");
		}
		
		for(int i=1; i<=n; i++){
			if(i%2==0){
				sum -= Math.pow(i,2);
				System.out.print(i+"²+");
			}
			else{
				sum += Math.pow(i,2);
				System.out.print(i+"²-");
			}
		}
		
		System.out.println("\b= "+sum);
		
	}
>>>>>>> 99344cf6d6a855103188cdb0a595d802a2c11c34
}