import java.util.Scanner;

class PatternPrint{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int line = -100, garo = -100, sero = -100, repeat = -100;
		String type;
		
		//도형 타입 입력
		while(true){
			System.out.print("도형의 타입: ");
			type = s.nextLine();
			if(type.equals("피라미드")||type.equals("사각형")||type.equals("다이아몬드")) break;
			System.out.println("[입력오류]도형의 타입은 피라미드, 사각형, 다이아몬드만 가능합니다. 다시 입력해주세요. ");
		}
		
		//도형 라인수 입력
		switch(type){
			case "피라미드":
				while(true){
					System.out.print("라인 수: ");
					line = s.nextInt();
					if(line>0 && line<=10) break;
					System.out.println("[입력오류]피라미드의 라인 수는 10이하의 양의 정수만 가능합니다. 다시 입력해주세요.");
					
				}
				break;
				
			case "사각형":
				while(true){
					System.out.print("가로: ");
					garo = s.nextInt();
					if(garo>0) break;
					System.out.println("[입력오류]사각형의 가로는 양의 정수만 가능합니다. 다시 입력해주세요.");
				}
				while(true){
					System.out.print("세로: ");
					sero = s.nextInt();
					if(sero>0) break;
					System.out.println("[입력오류]사각형의 세로는 양의 정수만 가능합니다. 다시 입력해주세요.");
				}
				while(true){
					System.out.print("반복 횟수: ");
					repeat = s.nextInt();
					if(repeat>0) break;
					System.out.println("[입력오류]사각형의 반복 횟수는 양의 정수만 가능합니다. 다시 입력해주세요.");
				}
				break;
				
			case "다이아몬드":
				while(true){
					System.out.print("라인 수: ");
					line = s.nextInt();
					if(line>0 && line%2==1) break;
					System.out.println("[입력오류]다이아몬드의 라인 수는 양의 홀수만 가능합니다. 다시 입력해주세요.");
				}
				break;
		}
		
		
		//도형 출력
		switch(type){
			case "피라미드":
				for(int i=1; i<=line; i++){
					for(int j=0; j<line-i; j++) System.out.print(" ");	
					for(int j=0; j<i-1; j++) System.out.print(i-1-j);	
					for(int j=0; j<i; j++) System.out.print(j);	
					System.out.println();
				}
				break;
				
			case "사각형":
				for(int i=1; i<=sero; i++){
					for(int j=0; j<repeat; j++){
						for(int k=0; k<garo; k++){
							System.out.print("*");
						}
						System.out.print(" ");	
					}
					System.out.println();
				}
				break;
				
			case "다이아몬드":
				//상단부
				for(int i=1; i<=line/2+1; i++){
					for(int j=0; j<line/2+1-i; j++) System.out.print(" ");
					for(int j=0; j<2*i-1; j++) System.out.print("*");
					System.out.println();
				}
				//하단부
				for(int i=1; i<=line/2; i++){
					for(int j=0; j<i; j++) System.out.print(" ");
					for(int j=0; j<line-2*i; j++) System.out.print("*");
					System.out.println();
				}
				break;
		}
		
	}
}