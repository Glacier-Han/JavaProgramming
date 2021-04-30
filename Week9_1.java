import java.util.*;

class Week9_1{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[10];
		int[][] arr2 = {{1,2,3},{4,5,6}};
		
		for(int i=0; i<arr2.length; i++){
			for(int j=0; j<arr2[i].length; j++){
				System.out.print(arr2[i][j]+" ");
				System.out.println();
			}
		}
		
		//for-each로 arr2 성분 모두 출력
		
		for(int[] x:arr2){
			for(int y : x){
				System.out.print(y + " ");
			}
		}
		/*
		double[][] s = new double[3][5];
		for(int s=0; s<3; s++){
			for(int j=0; j<5; j++){
				System.out.println(s[i][j]);
			}
			*/
	}
}