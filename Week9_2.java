import java.util.*;

class Week9_2{
	
	//두 정수 합 메소드
	static int sumTwo(int a, int b){
		return a+b;
	}
	
	//세 실수 합 메소드
	static void sumThree(double a, double b, double c){
		System.out.println(a+b+c);
		return;
	}		
	
	//정수형 이차원 배열 성분 출력 메소드
	static void printArr(int [][] arr){
		for(int[] x:arr){
			for(int y : x){
				System.out.print(y + " ");
			}
		}
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		//5+3
		//함수사용하려면 호출해야함
		//함수호출법 -> 함수 이름(함수가 원하는 인자)
		
		System.out.print(sumTwo(5,3));
		System.out.println();
		sumThree(5.3,3.4,6.5);
		
		int [][] arr = {{1,2,3},{3,5,6}, {5,2,3}};
		printArr(arr);
		
		
	}
}