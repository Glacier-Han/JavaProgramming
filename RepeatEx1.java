import java.util.Scanner;

class RepeatEx1{
	public static void main(String[] args){
		
		
		//ver1-------------while----------------
		System.out.println("ver1");
		int age;
		System.out.print("나이 : ");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		while(age < 0 || age >= 200) {
			System.out.println("[입력오류]나이는 0세이상 200세 미만의 값만 유효합니다.");
			System.out.print("나이 : ");
			age = sc.nextInt();
		}
		System.out.println("당신의 나이는 "+ age + "세 입니다.");
		
		//ver2--------------dowhile-------------
		System.out.println("ver2");
		do{
			System.out.print("나이 : ");
			age = sc.nextInt();
			if(age<0 || age>=200) 
				System.out.println("[입력오류]나이는 0세이상 200세 미만의 값만 유효합니다.");
			System.out.println("당신의 나이는 "+ age + "세 입니다.");
		}while(age < 0 || age >= 200);
		
		
		//ver3--------------InfiniteLoop--------
		System.out.println("ver3");
		while(true){
			System.out.print("나이 : ");
			age = sc.nextInt();
			//탈출조건
			if(age>0 && age<200) 
				break;
			System.out.println("[입력오류]나이는 0세이상 200세 미만의 값만 유효합니다.");
		}
		System.out.println("당신의 나이는 "+ age + "세 입니다.");
	}
}
