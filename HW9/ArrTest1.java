import java.util.*;
/*
import java.util.Scanner;
import java.util.Random;
*/

class ArrTest1{
	public static void main(String [] args){
		double [] arr;
		int size, rotNbr;
		Scanner s = new Scanner(System.in);
		
		System.out.print("배열 원소 개수: ");
		size = s.nextInt();
		
		arr =  new double[size];
		
		initArr(arr);
		System.out.println("배열 성분 초기화 후 모든 성분 출력: ");
		printArr(arr);
		
		System.out.printf("배열의 모든 성분의 합: %.1f\n", sumArr(arr));
		System.out.printf("배열의 최댓값: %.1f\n", maxArr(arr));
		System.out.printf("최댓값은 %d 번째에 존재\n", indexMaxArr(arr));
		
		shuffleArr(arr);
		System.out.println("배열 성분 셔플 후 모든 성분 출력: ");
		printArr(arr);
		
		rotateR1Arr(arr);
		System.out.println("배열 성분 오른쪽으로 한 칸 로테이션: ");
		printArr(arr);
		
		rotateL1Arr(arr);
		System.out.println("배열 성분 왼쪽으로 한 칸 로테이션: ");
		printArr(arr);
		
		System.out.print("오른쪽 시프트 횟수: ");
		rotNbr = s.nextInt();
		rotateRnArr(arr, rotNbr);
		System.out.printf("배열 성분 오른쪽으로 %d 칸 로테이션: \n", rotNbr);
		printArr(arr);
				
		System.out.print("왼쪽 시프트 횟수: ");
		rotNbr = s.nextInt();
		rotateLnArr(arr, rotNbr);
		System.out.printf("배열 성분 왼쪽으로 %d 칸 로테이션: \n", rotNbr);
		printArr(arr);
	}
	static void initArr(double [] arr){
		Random r = new Random();
		
		for(int i=0; i<arr.length; i++){
			arr[i] = r.nextDouble()*10;
		}
		
		return;//없어도 무방
	}
	
	static void printArr(double [] arr){
		for(int i=0; i<arr.length; i++){
			System.out.printf("%.1f  ", arr[i]);
		}
		System.out.println();
		
		return;//없어도 무방
	}
	
	static double sumArr(double [] arr){
		double sum = 0;
		
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		
		return sum;
	}
	
	static double maxArr(double [] arr){
		double max = arr[0];//일단 첫번째 성분을 최댓값이라고 둠
		
		for(int i=0; i<arr.length; i++){
			if(max<arr[i]) max = arr[i];// max<arr[i]일 경우 최댓값 교체
		}
		
		return max;
	}
	
	static int indexMaxArr(double [] arr){
		double max = arr[0];
		int index = 1;//일단 첫번째 성분을 최댓값이라고 둠
		
		for(int i=0; i<arr.length; i++){
			if(max<arr[i]){
				max = arr[i];// max<arr[i]일 경우 최댓값 교체
				index = i+1;// max<arr[i]일 경우 인덱스도 교체
			}
		}
		
		return index;
	}
	
	static void shuffleArr(double [] arr){
		Random r = new Random();
		int rNbr;
		double tmp;
		
		for(int i=0; i<arr.length; i++){
			rNbr = r.nextInt(arr.length);
			tmp = arr[i]; 
			arr[i] = arr[rNbr];
			arr[rNbr] = tmp;
		}
		
		return;//없어도 무방
	}
		
	static void rotateR1Arr(double [] arr){
		double tmp = arr[arr.length-1];
		
		for(int i=arr.length-1; i>0; i--){
			arr[i] = arr[i-1];
		}
		
		arr[0] = tmp;
		
		return;//없어도 무방
	}
	
	static void rotateL1Arr(double [] arr){
		double tmp = arr[0];
		
		for(int i=0; i<arr.length-1; i++){
			arr[i] = arr[i+1];
		}
		
		arr[arr.length-1] = tmp;
		
		return;//없어도 무방
	}
	
	static void rotateRnArr(double [] arr, int rotNbr){
		rotNbr %= arr.length;
		
		for(int i=0; i<rotNbr; i++){
			rotateR1Arr(arr);
		}
		
		return;//없어도 무방
	}
	
	static void rotateLnArr(double [] arr, int rotNbr){
		rotNbr %= arr.length;
		
		for(int i=0; i<rotNbr; i++){
			rotateL1Arr(arr);
		}
		
		return;//없어도 무방
	}
}