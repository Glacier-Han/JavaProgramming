//���� 10�� ������ �� �ִ� �迭 ������, �迭�� ������ 0�̻� 10���� ������ �ʱ�ȭ �� ���
//�������� ���� �� ���

import java.util.*;

class ArrayPrac4{
	public static void main(String[] args){
		int [] arr;
		int tem;
		arr = new int[15];
		Random ran = new Random();
		
		for(int i=0; i<15; i++){
			arr[i] = ran.nextInt(15);
		}
		for(int i=0; i<15; i++){
			for(int j=0; j<i; j++){
				if(arr[i]<arr[j]){
					tem = arr[i];
					arr[i] = arr[j];
					arr[j] = tem;
				}
			}
			
		}
		for(int i=0; i<15; i++){
			System.out.printf(" %d ",arr[i]);
		}
		
		
		
	}
}