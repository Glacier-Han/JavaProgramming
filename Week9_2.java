import java.util.*;

class Week9_2{
	
	//�� ���� �� �޼ҵ�
	static int sumTwo(int a, int b){
		return a+b;
	}
	
	//�� �Ǽ� �� �޼ҵ�
	static void sumThree(double a, double b, double c){
		System.out.println(a+b+c);
		return;
	}		
	
	//������ ������ �迭 ���� ��� �޼ҵ�
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
		//�Լ�����Ϸ��� ȣ���ؾ���
		//�Լ�ȣ��� -> �Լ� �̸�(�Լ��� ���ϴ� ����)
		
		System.out.print(sumTwo(5,3));
		System.out.println();
		sumThree(5.3,3.4,6.5);
		
		int [][] arr = {{1,2,3},{3,5,6}, {5,2,3}};
		printArr(arr);
		
		
	}
}