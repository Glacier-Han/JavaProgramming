import java.util.Scanner;

class ArrayPrac1{
	public static void main(String[] args){
		
		/*
		- �迭 : ���� �ڷ����� ��Ƴ��� ��
		- ���� ������ ���� = ������ �迭 ���
			int [] arr; -> ���� ���� ������ �迭
		- �迭 ����ÿ� �迭�� ���а��� �˰� ���� ��� �߰�ȣ�� ���� �ʱ�ȭ
			int [] arr = {9,5,4,3,7};
		- ���� �ÿ� �߰�ȣ �ʱ�ȭ ���ϸ� �Ʒ�ó�� �ϳ��� �ؾ���.
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
		System.out.println(arr.length); // �޼ҵ尡 �ƴ϶� ��ȣ�� ����.
		System.out.println(arr.length);
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
		
	}
}