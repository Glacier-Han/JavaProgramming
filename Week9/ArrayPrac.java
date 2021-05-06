import java.util.*;

class ArrayPrac{
	static void initArr(double [] arr){
		Random ran = new Random();
		for(int i=0; i<arr.length; i++){
			arr[i] = ran.nextDouble()*10;
		}
		return;
	}

	static void printArr(double [] arr){
		for(double x:arr){
			System.out.printf("諛곗�� ��깅�� : %.2f ", x);
		}
		return;
	}

	static double sumArr(double [] arr){
		double sum=0;
		for(int i=0; i<arr.length; i++) sum+=arr[i];
		return sum;
	}

	static double maxArr(double [] arr){
		double max=0;
		for(int i=0; i<arr.length; i++){
			if(max<arr[i]) max=arr[i];
		}
		return max;
	}

	static int indexMaxArr(double [] arr){
		int indexv=0;
		double max=0;
		for(int i=0; i<arr.length; i++){
			if(max<arr[i]) max=arr[i];
		}

		for(int i=0; i<arr.length; i++){
			if(arr[i]==max) indexv = i;
		}
		return indexv;
	}

	static void shuffleArr(double [] arr){
		double tem;
		int rannum;
		Random ran = new Random();
		for(int i=0; i<arr.length-1; i++){
			rannum = ran.nextInt(arr.length);
			tem = arr[i];
			arr[i] = arr[rannum];
			arr[rannum] = tem;
			}


		for(int i=0; i<arr.length; i++){
			System.out.printf("%.2f ",arr[i]);
		}

	}

	static void rotate1Arr(double [] arr){
		double tem;
		for(int i=0; i<arr.length-1; i++){
				tem = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = tem;
			}

		for(int i=0; i<arr.length; i++){
			System.out.printf("%.2f ",arr[i]);
		}
	}


	public static void main(String [] args){
		System.out.print("諛곗�댁�� ������ 媛���� : ");
		Scanner sc = new Scanner(System.in);

		int su;
		su = sc.nextInt();
		double [] arr = new double [su];

		initArr(arr);
		System.out.println();

		printArr(arr);
		System.out.println();

		System.out.printf("��� : %.2f ",sumArr(arr));
		System.out.println();

		System.out.printf("理����媛� : %.2f ",maxArr(arr));
		System.out.println();

		System.out.print("理����媛� ��몃�깆�� : " + indexMaxArr(arr));
		System.out.println();

		System.out.print("������ ��� 諛곗�� ��깅��: ");
		shuffleArr(arr);
		System.out.println();

		System.out.print("��ㅻⅨ履� 1移� 濡���� : ");
		rotate1Arr(arr);
		System.out.println();

	}

}
