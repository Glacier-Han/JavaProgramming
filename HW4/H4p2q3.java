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
			System.out.print("예측값: ");
			input = sc.nextInt();
			
			if(input < ran) System.out.println("더 큰값");
			else if(input > ran) System.out.println("더 작은값");
			else break;
			
			count++;
		}
		
		System.out.println("정답입니다 총 " + count + "회 만에 맞췄어요");
		
	}
}

