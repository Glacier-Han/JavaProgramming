import java.util.Scanner;

class Week6Test{
	public static void main(String[] args){
		//추가문제 1,2번
		
		//추가문제 1번
		int input,sum1;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("1보다 큰 정수: ");
			input = sc.nextInt();
			if(input > 1) break;
			System.out.println("[입력오류]1보다 큰정수 입력하세요.");
		}
		
		for(int i=1; i<=input/2; i++){
			System.out.print("+" + (2*i-1) + "²");
			System.out.print("-" + (2*i) + "²");
		}
		
		System.out.println("\n----------------------------");
		
		
		
		//추가문제 2번
		int input2, count = 0;
		double sum = 0;
		double avr;
		while(true){
			System.out.print("정수: ");
			input2 = sc.nextInt();
			if(input2 == 1111) break;
			if(input2%7 != 0 && input2%2 == 1) {
				sum += input2;
				count++;
			}
			
		}
		
		avr = sum/count;
		if(sum == 0) System.out.println("조건을 만족하는 홀수가 없어요.");
		else System.out.printf("조건을 만족하는 %d개의 홀수들의 평균은 %.2f입니다.",count, avr);
			
			
			
	}
}
