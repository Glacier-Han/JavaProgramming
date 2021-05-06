import java.util.Scanner;

class ArrTest2{
	public static void main(String [] args){
		int [][] arr = new int [3][2];
		int [] colSum; 
		
		initArr(arr);
		System.out.println("배열 성분 초기화 후 모든 성분 출력: ");
		printArr(arr);
		
		System.out.println("배열의 모든 성분의 합: "+sumArr(arr));
		
		colSum = colSumArr(arr);
		for(int j=0; j<arr[0].length; j++){
			System.out.printf("배열의 %d열 합: %d\n", j+1, colSum[j]);
		}
		
		System.out.println("행 별 합의 최댓값: "+rowSumMaxArr(arr));
		
		System.out.printf("배열의 최댓값의 인덱스: %d행 %d열\n", indexMaxArr(arr)[0], indexMaxArr(arr)[1]);
		
		shuffleArr(arr);
		System.out.println("배열 성분 셔플 후 모든 성분 출력: ");
		printArr(arr);
		
	}
	static void initArr(int [][] arr){
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.printf("%d행 %d열 성분: ", i+1, j+1);
				arr[i][j] = s.nextInt();
			}
		}
		
		return;//없어도 무방
	}
	
	static void printArr(int [][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.printf("%d  ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		return;//없어도 무방
	}
	
	static int sumArr(int [][] arr){
		int sum = 0;
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				sum += arr[i][j];
			}
		}
		
		return sum;
	}
	
	
	static int [] colSumArr(int [][] arr){
		int [] sum = new int [arr[0].length];
		
		for(int j=0; j<arr[0].length; j++){
			for(int i=0; i<arr.length; i++){
				sum[j] += arr[i][j];
			}
		}
		
		return sum;
	}
	
	static int rowSumMaxArr(int [][] arr){
		int sumMax = Integer.MIN_VALUE;//일단 최댓값이 절대 될 수 없는 int 타입의 최솟값으로 둠(교체될 수 있도록)
		int sum;
		
		for(int i=0; i<arr.length; i++){
			sum = 0;
			for(int j=0; j<arr[i].length; j++){
				sum += arr[i][j];
			}
			if(sum>sumMax) sumMax = sum;
		}
		
		return sumMax;
	}
	
	static int [] indexMaxArr(int [][] arr){
		int max = arr[0][0];//일단 1행 1열 성분을 최댓값이라고 둠
		int index[] = {1, 1};//인덱스도 1행 1열 성분을 최댓값이라고 둠
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if(max<arr[i][j]){
					max = arr[i][j];// max<arr[i][j]일 경우 최댓값 교체
					index[0] = i+1;
					index[1] = j+1;
					// max<arr[i][j]일 경우 인덱스도 교체
				}
			}
		}
		
		return index;
	}
	
	static void shuffleArr(int [][] arr){
		int r, c, tmp;
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				r = (int)(Math.random()*arr.length);
				c = (int)(Math.random()*arr[0].length);
				
				tmp = arr[i][j]; 
				arr[i][j] = arr[r][c];
				arr[r][c] = tmp;
			}
		}
		return;//없어도 무방
	}
}