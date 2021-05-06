import java.util.*;

class H9P1{
	static void initArr(double [] arr){
		Random ran = new Random();
		for(int i=0; i<arr.length; i++){
			arr[i] = ran.nextDouble()*10;
		}
		return;
	}

	static void printArr(double [] arr){
		for(double x:arr){
			System.out.printf("%.2f ", x);
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

	static void rotaterightArr(double [] arr){
		double tem;
		for(int i=arr.length-1; i>0; i--){
				tem = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = tem;
			}

		for(int i=0; i<arr.length; i++){
			System.out.printf("%.2f ",arr[i]);
		}
	}

	static void rotateleftArr(double [] arr){
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

	static void rotateR22Arr(double [] arr){
		double tem;
		for(int j=0; j<22; j++){
			for(int i=arr.length-1; i>0; i--){
					tem = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = tem;
				}
		}

		for(int i=0; i<arr.length; i++){
			System.out.printf("%.2f ",arr[i]);
		}
	}

	static void rotateL22Arr(double [] arr){
		double tem;
		for(int j=0; j<14; j++){
			for(int i=0; i<arr.length-1; i++){
					tem = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tem;
				}
		}

		for(int i=0; i<arr.length; i++){
			System.out.printf("%.2f ",arr[i]);
		}
	}


	public static void main(String [] args){
		System.out.print(" ¿ø¼Ò°³¼ö: ");
		Scanner sc = new Scanner(System.in);

		int su;
		su = sc.nextInt();
		double [] arr = new double [su];

		initArr(arr);
		System.out.println();

		printArr(arr);
		System.out.println();

		System.out.printf("ÇÕ : %.2f ",sumArr(arr));
		System.out.println();

		System.out.printf("ÃÖ´ñ°ª : %.2f ",maxArr(arr));
		System.out.println();

		System.out.print("ÃÖ´ñ°ªÀÎµ¦½º : " + indexMaxArr(arr));
		System.out.println();

		System.out.print("¼ÅÇÃ ÈÄ : ");
		shuffleArr(arr);
		System.out.println();

		System.out.print("¿À¸¥ÂÊ1Ä­ ·ÎÅ×: ");
		rotaterightArr(arr);
		System.out.println();

		System.out.print("¿ÞÂÊ1Ä­ ·ÎÅ×: ");
		rotateleftArr(arr);
		System.out.println();

		System.out.print("¿À¸¥ 22Ä­ ·ÎÅ×: ");
		rotateR22Arr(arr);
		System.out.println();

		System.out.print("¿ÞÂÊ 14Ä­ ·ÎÅ×: ");
		rotateL22Arr(arr);
		System.out.println();

	}

}
