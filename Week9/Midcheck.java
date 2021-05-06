import java.util.*

class Midcheck{
		
		//1
		int[] array = new int[100];
		
		//2
		0~9;
		
		//3
		실행예외 발생
		ArrayIndexOutOfBoundsException
		
		//4
		double[] arr = {1.2, 3.1, 6.7}; //선언과 동시에 초기화할 경우 중괄호를 통해 초기화 가능
		double [] arr;
		
		//5
		for(int i=0; i<array.length; i++){
			array[i] *= 2;
		}
		
		//6
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		double [] arr = new double(num);
		
		//8
		arr1을 arr2에 복사
		for(int i=0; i<arr1.length; i++){
			arr2[i] = arr1[i];
		}
		
		//7
		배열 성분 모두 출력하는 코드
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		//for-each
		for(배열 성분의 자료형, 변수명:배열명){
			할일
		}
		
		for(int x:arr){//arr[0]
			System.out.print(x+" ");
		}
		
		//배열길이 적지 않아도 반복 가능
		//특정 성분에만 접근 불가 (모든 성분에 반복)
		//배열 원소 변경 불가
		
		//->전통 for문
		//일정 부분만 반복가능
		//배열 길이 다적어줘야함
		//배열 원소 변경 가능
}
