import java.util.Scanner;
import java.util.Random;

class H4p2q3{
	public static void main(String[] args){
		
		int input, ran;
		int count = 1;
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		ran = random.nextInt(101)-50;
		System.out.println(ran);
		
		while(true){
			System.out.print("������: ");
			input = sc.nextInt();
			
			if(input < ran) System.out.println("�� ū��");
			else if(input > ran) System.out.println("�� ������");
			else break;
			
			count++;
		}
		
		System.out.println("�����Դϴ� �� " + count + "ȸ ���� ������");
		
	}
}

