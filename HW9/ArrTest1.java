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
		
		System.out.print("�迭 ���� ����: ");
		size = s.nextInt();
		
		arr =  new double[size];
		
		initArr(arr);
		System.out.println("�迭 ���� �ʱ�ȭ �� ��� ���� ���: ");
		printArr(arr);
		
		System.out.printf("�迭�� ��� ������ ��: %.1f\n", sumArr(arr));
		System.out.printf("�迭�� �ִ�: %.1f\n", maxArr(arr));
		System.out.printf("�ִ��� %d ��°�� ����\n", indexMaxArr(arr));
		
		shuffleArr(arr);
		System.out.println("�迭 ���� ���� �� ��� ���� ���: ");
		printArr(arr);
		
		rotateR1Arr(arr);
		System.out.println("�迭 ���� ���������� �� ĭ �����̼�: ");
		printArr(arr);
		
		rotateL1Arr(arr);
		System.out.println("�迭 ���� �������� �� ĭ �����̼�: ");
		printArr(arr);
		
		System.out.print("������ ����Ʈ Ƚ��: ");
		rotNbr = s.nextInt();
		rotateRnArr(arr, rotNbr);
		System.out.printf("�迭 ���� ���������� %d ĭ �����̼�: \n", rotNbr);
		printArr(arr);
				
		System.out.print("���� ����Ʈ Ƚ��: ");
		rotNbr = s.nextInt();
		rotateLnArr(arr, rotNbr);
		System.out.printf("�迭 ���� �������� %d ĭ �����̼�: \n", rotNbr);
		printArr(arr);
	}
	static void initArr(double [] arr){
		Random r = new Random();
		
		for(int i=0; i<arr.length; i++){
			arr[i] = r.nextDouble()*10;
		}
		
		return;//��� ����
	}
	
	static void printArr(double [] arr){
		for(int i=0; i<arr.length; i++){
			System.out.printf("%.1f  ", arr[i]);
		}
		System.out.println();
		
		return;//��� ����
	}
	
	static double sumArr(double [] arr){
		double sum = 0;
		
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		
		return sum;
	}
	
	static double maxArr(double [] arr){
		double max = arr[0];//�ϴ� ù��° ������ �ִ��̶�� ��
		
		for(int i=0; i<arr.length; i++){
			if(max<arr[i]) max = arr[i];// max<arr[i]�� ��� �ִ� ��ü
		}
		
		return max;
	}
	
	static int indexMaxArr(double [] arr){
		double max = arr[0];
		int index = 1;//�ϴ� ù��° ������ �ִ��̶�� ��
		
		for(int i=0; i<arr.length; i++){
			if(max<arr[i]){
				max = arr[i];// max<arr[i]�� ��� �ִ� ��ü
				index = i+1;// max<arr[i]�� ��� �ε����� ��ü
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
		
		return;//��� ����
	}
		
	static void rotateR1Arr(double [] arr){
		double tmp = arr[arr.length-1];
		
		for(int i=arr.length-1; i>0; i--){
			arr[i] = arr[i-1];
		}
		
		arr[0] = tmp;
		
		return;//��� ����
	}
	
	static void rotateL1Arr(double [] arr){
		double tmp = arr[0];
		
		for(int i=0; i<arr.length-1; i++){
			arr[i] = arr[i+1];
		}
		
		arr[arr.length-1] = tmp;
		
		return;//��� ����
	}
	
	static void rotateRnArr(double [] arr, int rotNbr){
		rotNbr %= arr.length;
		
		for(int i=0; i<rotNbr; i++){
			rotateR1Arr(arr);
		}
		
		return;//��� ����
	}
	
	static void rotateLnArr(double [] arr, int rotNbr){
		rotNbr %= arr.length;
		
		for(int i=0; i<rotNbr; i++){
			rotateL1Arr(arr);
		}
		
		return;//��� ����
	}
}