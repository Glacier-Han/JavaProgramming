import java.util.Scanner;

class ArrayPrac2{
	public static void main(String[] args){
		int rep, what;
		int [] score;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�л� ��: ");
		rep = sc.nextInt();
		score = new int[rep];
		
		for(int i=0; i<score.length; i++){
			System.out.printf("%d�� �л� ����: ",i+1);
			score[i] = sc.nextInt();
		}
		
		System.out.print("��� �л�?: ");
		what = sc.nextInt();
		System.out.printf("%d�� �л� ����: %d",what,score[what-1]);
	}
}