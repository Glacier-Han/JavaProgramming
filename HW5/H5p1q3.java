import java.util.Scanner;

class H5p1q3{
	public static void main(String[] args){
		String type;
		int line;
		int width, height, rep;
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("도형의 타입: ");
			type = sc.nextLine();
			if(type.equals("피라미드")||type.equals("사각형")||type.equals("다이아몬드")) break;
			System.out.println("[입력오류]");
		}

		if(type.equals("피라미드")){
			while(true){
			System.out.print("라인 수: ");
			line = sc.nextInt();
			if(line>0 && line<=10) break;
			System.out.println("[입력오류]");
			}
			for(int i=1; i<=line; i++){
				for(int j=line; j>i; j--) System.out.print(" ");
				for(int s=i; s<=2*i-1; s++) System.out.print(s);
				System.out.print("\n");
			}

		}

		else if(type.equals("다이아몬드")){
			while(true){
			System.out.print("라인 수: ");
			line = sc.nextInt();
			if(line>0 && line%2==1) break;
			System.out.println("[입력오류]");
			}

			for(int i=1; i<=line/2+1; i++){
				for(int j=line/2; j>i-1; j--) System.out.print(" ");
				for(int s=1; s<=2*i-1; s++) System.out.print("*");
				System.out.print("\n");
			}

			for(int i=line/2; i>=1; i--){
				for(int j=i; j<=line/2; j++) System.out.print(" ");
				for(int s=2*i-1; s>=1; s--) System.out.print("*");
				System.out.print("\n");
			}
		}

		else {
			while(true){
				System.out.print("가로: ");
				width = sc.nextInt();
				if(width>0) break;
				System.out.println("[입력오류]");
			}
			while(true){
				System.out.print("세로: ");
				height = sc.nextInt();
				if(height>0) break;
				System.out.println("[입력오류]");
			}
			while(true){
				System.out.print("반복 횟수: ");
				rep = sc.nextInt();
				if(rep>0) break;
				System.out.println("[입력오류]");
			}


			for(int i=0; i<height; i++){
				for(int r=0; r<rep; r++){
					for(int w=0; w<width; w++) System.out.print("*");
					System.out.print(" ");
				}
				System.out.print("\n");
			}


	}
	}
}
