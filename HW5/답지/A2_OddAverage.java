import java.util.Scanner;

class OddAverage{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int nbr, sum = 0, cnt = 0;
		
		while(true){
			System.out.print("정수: ");
			nbr = s.nextInt();
			
			if(nbr==1111) break;
			else if(nbr%7!=0 && nbr%2==1){
				cnt++;
				sum += nbr;
			}
		}
		
		if(cnt==0) System.out.println("평균을 계산할 홀수가 없습니다. ");
		else{
			System.out.printf("조건을 만족하는 %d개의 홀수들의 평균은 %.2f입니다.\n", cnt, (double)sum/cnt);
			
		}
	}
}