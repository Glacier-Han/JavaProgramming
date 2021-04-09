import java.util.Scanner;

class Week6Test2{
	public static void main(String[] args){
		//반복문실습문제 3,4번
		// \b는 커서 앞으로 한칸 땡김
		// \r은 커서 젤앞으로 땡김
		
		//3번 
		int a, b,num, tem;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a: ");
		a = sc.nextInt();
		System.out.print("b: ");
		b = sc.nextInt();
		
		if(a>b) {
			tem = a;
			a = b;
			b = tem;
		}
		
		for(int i=a; i<=b; i++){
			System.out.printf("%d의 약수: ",i);
			for(int j=1; j<=i; j++){
				if(i%j == 0) System.out.print(j + ", ");
			}
			System.out.println("\b\b "); //백슬래시 두번해서 콤마자리를 공백으로 처리
		}
		
		System.out.println("\n----------------------------");
		//4번
		String input;
		int count = 0;
		char c;
		
		System.out.print("문자열: ");
		input = sc.nextLine();
		input = sc.nextLine();
		System.out.print("문자: ");
		c = sc.next().charAt(0);
		
		for(int i=0; i<input.length(); i++){
			if(input.charAt(i) == c) {
				System.out.print((i+1) + "번째 ");
				count++;
			}
		}
		
		System.out.printf("문자열 %s에서 문자 %s는 %d번 검색되었습니다.",input,c,count);
		
		System.out.println("\n----------------------------");
		//다이아
		int input3;
		System.out.printf("라인 수:");
		input3 = sc.nextInt();
		for(int i=1; i<=input3/2+1; i++){
			for(int s=0; s<(input3/2+1) - i; s++) System.out.print(" ");
			for(int s=0; s<2*i - 1; s++) System.out.print("*");
		
			System.out.print("\n");
		}
		for(int i=input3/2; i>0; i--){
			for(int s=(input3/2+1) - i; s>0; s--) System.out.print(" ");
			for(int s=2*i - 1; s>0; s--) System.out.print("*");
		
			System.out.print("\n");
		}
		
	}
}