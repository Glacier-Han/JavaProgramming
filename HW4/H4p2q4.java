import java.util.Scanner;

class H4p2q4{
	public static void main(String[] args){
		
		int type, score;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("종: ");
			type = sc.nextInt();
			
			if(type == 1 || type == 2) {
				break;
			}
			System.out.println("[입력오류] 0점이상 100점이하의 값만 유효");
		}
		
			
			
		while(true) {
			System.out.print("점수: ");
			score = sc.nextInt();
			if(score>=0 && score <=100)
				break;
			System.out.println("[입력오류] 0점 이상 100점 이하의 값만 유효합니다. \n다시 입력해주세요.");
		}
		
		if(type == 1){
				
				if(score >= 70) {
					System.out.println("합격");
				}
				
				else {
					System.out.println("불합격");
				}
				
			}
			
		else {
			if(score >= 60) {
				System.out.println("합격");
			}
				
			else {
				System.out.println("불합격");
			}
			
		}
	}
		
		
}
