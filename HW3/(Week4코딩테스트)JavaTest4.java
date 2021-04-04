import java.util.Scanner;

//>>31인데 16이라고 했음

class JavaTest4{
	public static void main(String[] args){
		
		double userinput;
		int resu;
		int abs;
		int absresu;
		String abskor;
		
		System.out.print("-1000초과 1000미만의 실수: ");
		Scanner sc = new Scanner(System.in);
		userinput = sc.nextDouble();
		
		
		
		resu = (int)userinput;
		
		System.out.printf("입력한 실수의 정수부분: %d\n", resu);
		
		if(resu >> 31  == 0xffffffff ){
			
			abs = -resu;
			System.out.printf("정수 부분의 절댓값: %d", abs);
			
			absresu = abs/100;
			abs%=100;
			abskor = (absresu>1)?absresu + "백 ":(absresu==1)?"백 ":"";
			System.out.printf("(%s", abskor);
			
			absresu = abs/10;
			
			abskor = (absresu>1)?absresu + "십 ":(absresu==1)?"십 ":"";
			System.out.printf("%s", abskor);
			absresu %=10;
			System.out.printf("%s)", absresu);
		}
		
		
		else {
			abs = resu;
			System.out.printf("정수 부분의 절댓값: %d", abs);
			
			absresu = abs/100;
			abs%=100;
			abskor = (absresu>1)?absresu + "백 ":(absresu==1)?"백 ":"";
			System.out.printf("(%s", abskor);
			
			absresu = abs/10;
			
			abskor = (absresu>1)?absresu + "십 ":(absresu==1)?"십 ":"";
			System.out.printf("%s", abskor);
			absresu%=10;
			System.out.printf("%s)", absresu);
		}
	
	
	
	}
}

