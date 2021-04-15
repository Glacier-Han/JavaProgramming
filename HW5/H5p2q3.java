import java.util.Scanner;

class H5p2q3{
	public static void main(String[] args){
		
		String type;
		int line;
		int width, height, rep;
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("도형의 타입: ");
			type = sc.nextLine();
			if(type.equals("피라미드") || type.equals("사각형") || type.equals("다이아몬드")) break;
			System.out.print("[입력오류]");
		}
		
		switch(type){
			case "피라미드": 
				System.out.print("라인 수: ");
				line = sc.nextInt();
				for(int i=1; i<=line; i++){
					for(int j=line; j>i; j--) System.out.print(" ");
					for(int k=i-1; k>=0; k--) System.out.print(k);
					for(int s=1; s<i; s++) System.out.print(s);
					System.out.print("\n");
				}
				break;
				
			case "사각형":
				System.out.print("가로: ");
				width = sc.nextInt();
				System.out.print("세로: ");
				height = sc.nextInt();
				System.out.print("반복 횟수: ");
				rep = sc.nextInt();
				
				for(int i=0; i<height; i++){
					for(int j=0; j<rep; j++){
						for(int s=0; s<width; s++) {
							System.out.print("*");
						}
						System.out.print(" ");
					}
					System.out.print("\n");
				}
				break;
				
				case "다이아몬드":
					System.out.print("라인 수: ");
					line = sc.nextInt();
					for(int i=1; i<=line/2+1; i++) {
						for(int j=line/2; j>=i; j--) System.out.print(" ");
						for(int j=1; j<= 2*i-1; j++) System.out.print("*");
						System.out.print("\n");
					}
					for(int i=line/2; i>=1; i--){
						for(int j=line/2; j>=i; j--) System.out.print(" ");
						for(int j=1; j<= i*2-1; j++) System.out.print("*");
						System.out.print("\n");
					}
				
		}
	}
	
}