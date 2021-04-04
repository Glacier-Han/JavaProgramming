import java.util.Scanner;

class Rectangular{
	public static void main(String [] args){
		double x1, y1, x2, y2; //각 점의 x,y 좌표들
		double width, height;  //가로, 세로
		Scanner s = new Scanner(System.in);
		
		System.out.print("점1의 x좌표: ");
		x1 = s.nextDouble();
		System.out.print("점1의 y좌표: ");
		y1 = s.nextDouble();
		
		System.out.print("점2의 x좌표: ");
		x2 = s.nextDouble();
		System.out.print("점2의 y좌표: ");
		y2 = s.nextDouble();
		
		
		width = x1-x2;
		height = y1-y2;
		
		if(x1<x2){//가로 길이가 음수
			width *= -1; //양수로 변환
		}
		
		if(y1<y2){
			width *= -1; 
		}
		
		if((width==0)||(height==0))	System.out.println("직사각형이 아닙니다.");//가로나 세로가 0이면 직사각형이 아니라고 출력
		else{
			System.out.format("둘레의 길이: %.2f\n", 2*(width+height));
			System.out.format("대각선의 길이: %.2f\n", Math.sqrt(Math.pow(width,2)+Math.pow(height,2)));
			System.out.format("넓이: %.2f\n",width*height);
		}
	}
}