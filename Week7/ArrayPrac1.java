import java.util.Scanner;

class ArrayPrac1{
	public static void main(String[] args){
		
		/*
		- 배열 : 같은 자료형을 모아놓은 것
		- 정수 여러개 저장 = 정수형 배열 사용
			int [] arr; -> 정수 저장 가능한 배열
		- 배열 선언시에 배열의 성분값을 알고 있을 경우 중괄호를 통해 초기화
			int [] arr = {9,5,4,3,7};
		- 선언 시에 중괄호 초기화 안하면 아래처럼 하나씩 해야함.
			int [] arr1;
			arr1[0] = 9;
			arr1[1] = 5; 
		*/
		double [] darr = new double[100];
		double [] darr2;
		int [] arr = {9,5,4,3,7};
		darr2 = new double[120];
		String [] sarr;
		// Scanner[] scArr;
		System.out.println(arr.length); // 메소드가 아니라서 괄호가 없다.
		System.out.println(arr.length);
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
		
	}
}