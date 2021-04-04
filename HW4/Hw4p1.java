import java.util.Scanner;

class Hw4p1{
	public static void main(String[] args){
		double x1, x2, y1, y2, width, height;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("점 1의 x좌표 : ");
			x1 = sc.nextDouble();
			System.out.print("점 1의 y좌표 : ");
			y1 = sc.nextDouble();
			System.out.print("점 2의 x좌표 : ");
			x2 = sc.nextDouble();
			System.out.print("점 2의 y좌표 : ");
			y2 = sc.nextDouble();
			
			width = x2-x1;
			height = y2-y1;
			
			if(width != 0 && height != 0) break;
			
			System.out.printf("점 (%.2f, %.2f)와 점 (%.2f, %.2f)는 직사각형을 이루지 않습니다.\n다시 입력해 주세요.\n",x1,y1,x2,y2);
		}
		
		if(width<0){//가로 길이가 음수
			width *= -1; //양수로 변환
		}
		if(height<0){
			height *= -1; 
		}
		
		System.out.println("=========계산 결과==========");
		System.out.printf(" - 둘레의 길이: %.2f\n",2*(width+height));
		System.out.printf(" - 넓이: %.2f\n",width*height);
		System.out.printf(" - 대각선의 길이: %.2f\n",Math.sqrt(Math.pow(width,2)+Math.pow(height,2)));
	}
}
