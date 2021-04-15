import java.util.Scanner;

class H5p1q4{
	public static void main(String[] args){
		int cnt=0;
		for(int i=1; i<=100; i++){
			int j;
			for(j=2; j<i; j++){
				if(i%j==0) break;
			}
			if(i==j) {
				cnt++;
				System.out.printf("%3d ",i);
				if(cnt%5 == 0) System.out.println();
			}

		}
	}
}
