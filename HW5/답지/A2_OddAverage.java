import java.util.Scanner;

class OddAverage{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int nbr, sum = 0, cnt = 0;
		
		while(true){
			System.out.print("����: ");
			nbr = s.nextInt();
			
			if(nbr==1111) break;
			else if(nbr%7!=0 && nbr%2==1){
				cnt++;
				sum += nbr;
			}
		}
		
		if(cnt==0) System.out.println("����� ����� Ȧ���� �����ϴ�. ");
		else{
			System.out.printf("������ �����ϴ� %d���� Ȧ������ ����� %.2f�Դϴ�.\n", cnt, (double)sum/cnt);
			
		}
	}
}