import java.util.Scanner;

class ArrTest2{
	public static void main(String [] args){
		int [][] arr = new int [3][2];
		int [] colSum; 
		
		initArr(arr);
		System.out.println("�迭 ���� �ʱ�ȭ �� ��� ���� ���: ");
		printArr(arr);
		
		System.out.println("�迭�� ��� ������ ��: "+sumArr(arr));
		
		colSum = colSumArr(arr);
		for(int j=0; j<arr[0].length; j++){
			System.out.printf("�迭�� %d�� ��: %d\n", j+1, colSum[j]);
		}
		
		System.out.println("�� �� ���� �ִ�: "+rowSumMaxArr(arr));
		
		System.out.printf("�迭�� �ִ��� �ε���: %d�� %d��\n", indexMaxArr(arr)[0], indexMaxArr(arr)[1]);
		
		shuffleArr(arr);
		System.out.println("�迭 ���� ���� �� ��� ���� ���: ");
		printArr(arr);
		
	}
	static void initArr(int [][] arr){
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.printf("%d�� %d�� ����: ", i+1, j+1);
				arr[i][j] = s.nextInt();
			}
		}
		
		return;//��� ����
	}
	
	static void printArr(int [][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.printf("%d  ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		return;//��� ����
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
		int sumMax = Integer.MIN_VALUE;//�ϴ� �ִ��� ���� �� �� ���� int Ÿ���� �ּڰ����� ��(��ü�� �� �ֵ���)
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
		int max = arr[0][0];//�ϴ� 1�� 1�� ������ �ִ��̶�� ��
		int index[] = {1, 1};//�ε����� 1�� 1�� ������ �ִ��̶�� ��
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if(max<arr[i][j]){
					max = arr[i][j];// max<arr[i][j]�� ��� �ִ� ��ü
					index[0] = i+1;
					index[1] = j+1;
					// max<arr[i][j]�� ��� �ε����� ��ü
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
		return;//��� ����
	}
}