//정수 10개 저장할 수 있는 배열 생성후, 배열의 성분을 0이상 10이하 난수로 초기화 후 출력
//오름차순 정렬 후 출력

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