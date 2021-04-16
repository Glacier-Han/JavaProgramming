import java.util.Scanner;

class ArrayPrac2{
	public static void main(String[] args){
		int rep, what;
		int [] score;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수: ");
		rep = sc.nextInt();
		score = new int[rep];
		
		for(int i=0; i<score.length; i++){
			System.out.printf("%d번 학생 점수: ",i+1);
			score[i] = sc.nextInt();
		}
		
		System.out.print("몇번 학생?: ");
		what = sc.nextInt();
		System.out.printf("%d번 학생 점수: %d",what,score[what-1]);
	}
}