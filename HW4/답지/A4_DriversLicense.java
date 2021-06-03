import java.util.Scanner;

class DriversLicense{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int score, type;
		
		while(true){
			System.out.print("종: ");
			type = s.nextInt();
			if(type == 1 || type ==2)
				break;
			System.out.println("[입력오류] 1, 2 종만 유효합니다. \n다시 입력해주세요.");
		}
		while(true){
			System.out.print("점수: ");
			score = s.nextInt();
			if(score>=0 && score <=100)
				break;
			System.out.println("[입력오류] 0점 이상 100점 이하의 값만 유효합니다. \n다시 입력해주세요.");
		}
		
		if(type==1){
			if(score>=70)
				System.out.println("합격입니다.");
			else
				System.out.println("불합격입니다.");
		}else{//이 경우엔 type이 1, 2인 경우 밖에 없으므로 꼭 else-if를 쓸 필요가 없죠.
			if(score>=60)
				System.out.println("합격입니다.");
			else
				System.out.println("불합격입니다.");
		}
		
	}
}