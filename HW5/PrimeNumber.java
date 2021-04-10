<<<<<<< HEAD
import java.util.Scanner;
//1이상 100이하의 소수 한 라인에 5개씩 출력
class PrimeNumber{
	public static void main(String [] args){
		int cnt = 0, numOfDivisors=0; //한 라인에 5개씩 출력하기 위해 cnt 변수 선언
		//cnt는 소수 개수 카운트-> 소수 개수가 5의 배수일 때 개행
		
		//i의 소수 여부 판단하기 
		//방법1: 2이상 i-1이하의 수 중에서 i의 약수 존재 여부로 소수 판단.  
		//방법2: 약수 개수 2개냐 아니냐. 
		
		
		//방법 1: 아래에 주석 버전 있으니 코드 이해 안되는 분은 아래 코드 확인 바랍니다. 
		for(int i=1; i<=100; i++){
			int j; //j가 아래 for문 벗어난 범위에서도 사용되므로 for문 외부에서 선언. 
			for(j=2; j<i; j++){
				if(i%j==0) break;
			}
			if(j==i) {
				cnt++;
				System.out.printf("%3d ", i); 
				if(cnt%5==0)
					System.out.println();
			}
		}
		System.out.println();
		
		//방법 2: 아래에 주석 버전 있으니 코드 이해 안되는 분은 아래 코드 확인 바랍니다. 
		cnt =0;//소수 개수 0으로 다시 0으로 설정
		for(int i=1; i<=100; i++){
			numOfDivisors = 0;//i마다 약수개수를 저장할 변수, i가 달라질때마다 약수개수는 0으로 설정
			int j;
			for(j=1; j<=i; j++){
				if(i%j==0) numOfDivisors++;
			}
			if(numOfDivisors==2) {
				cnt++;
				System.out.printf("%3d ", i); 
				if(cnt%5==0)
					System.out.println();
			}
		}
		
		/*
		//방법 1 주석버전
		for(int i=1; i<=100; i++){
			int j;
			for(j=2; j<i; j++){//j는 i 약수 후보(1과 i자신 제외한)
				if(i%j==0) break; //2이상 i-1이하의 수 중에서 i의 약수가 발견되면 i는 소수가 아니므로 break 걸고 반복문 나감
			}
			//이까지 왔단 건 두 경우가 있음. ⓐbreak 걸려 나온 경우:소수 아님 ⓑ반복문 조건이 거짓이라 나온 경우(이 경우 j=i임): 2이상 i-1의 수 중 약수가 있어 break당하지 않았다는 말이므로 소수임. 
			if(j==i) {//소수인 경우 
				cnt++;//소수 카운트
				System.out.printf("%3d ", i); 
				if(cnt%5==0)//소수 5개씩 출력후 
					System.out.println();//개행
			}
		}
		*/
		
		/*
		//방법 2 주석버전
		
		cnt =0;//소수 개수 0으로 다시 0으로 설정
		for(int i=1; i<=100; i++){
			numOfDivisors = 0;//i마다 약수개수를 저장할 변수, i가 달라질때마다 약수개수는 0으로 설정
			int j;
			for(j=1; j<=i; j++){
				if(i%j==0) numOfDivisors++; //i의 약수가 발견될 때마다 약수개수 증가
			}
			if(numOfDivisors==2) {//약수 개수가 2개라면 소수 
				cnt++;
				System.out.printf("%3d ", i); 
				if(cnt%5==0)
					System.out.println();
			}
		}
		
		 */
	}
=======
import java.util.Scanner;
//1이상 100이하의 소수 한 라인에 5개씩 출력
class PrimeNumber{
	public static void main(String [] args){
		int cnt = 0, numOfDivisors=0; //한 라인에 5개씩 출력하기 위해 cnt 변수 선언
		//cnt는 소수 개수 카운트-> 소수 개수가 5의 배수일 때 개행
		
		//i의 소수 여부 판단하기 
		//방법1: 2이상 i-1이하의 수 중에서 i의 약수 존재 여부로 소수 판단.  
		//방법2: 약수 개수 2개냐 아니냐. 
		
		
		//방법 1: 아래에 주석 버전 있으니 코드 이해 안되는 분은 아래 코드 확인 바랍니다. 
		for(int i=1; i<=100; i++){
			int j; //j가 아래 for문 벗어난 범위에서도 사용되므로 for문 외부에서 선언. 
			for(j=2; j<i; j++){
				if(i%j==0) break;
			}
			if(j==i) {
				cnt++;
				System.out.printf("%3d ", i); 
				if(cnt%5==0)
					System.out.println();
			}
		}
		System.out.println();
		
		//방법 2: 아래에 주석 버전 있으니 코드 이해 안되는 분은 아래 코드 확인 바랍니다. 
		cnt =0;//소수 개수 0으로 다시 0으로 설정
		for(int i=1; i<=100; i++){
			numOfDivisors = 0;//i마다 약수개수를 저장할 변수, i가 달라질때마다 약수개수는 0으로 설정
			int j;
			for(j=1; j<=i; j++){
				if(i%j==0) numOfDivisors++;
			}
			if(numOfDivisors==2) {
				cnt++;
				System.out.printf("%3d ", i); 
				if(cnt%5==0)
					System.out.println();
			}
		}
		
		/*
		//방법 1 주석버전
		for(int i=1; i<=100; i++){
			int j;
			for(j=2; j<i; j++){//j는 i 약수 후보(1과 i자신 제외한)
				if(i%j==0) break; //2이상 i-1이하의 수 중에서 i의 약수가 발견되면 i는 소수가 아니므로 break 걸고 반복문 나감
			}
			//이까지 왔단 건 두 경우가 있음. ⓐbreak 걸려 나온 경우:소수 아님 ⓑ반복문 조건이 거짓이라 나온 경우(이 경우 j=i임): 2이상 i-1의 수 중 약수가 있어 break당하지 않았다는 말이므로 소수임. 
			if(j==i) {//소수인 경우 
				cnt++;//소수 카운트
				System.out.printf("%3d ", i); 
				if(cnt%5==0)//소수 5개씩 출력후 
					System.out.println();//개행
			}
		}
		*/
		
		/*
		//방법 2 주석버전
		
		cnt =0;//소수 개수 0으로 다시 0으로 설정
		for(int i=1; i<=100; i++){
			numOfDivisors = 0;//i마다 약수개수를 저장할 변수, i가 달라질때마다 약수개수는 0으로 설정
			int j;
			for(j=1; j<=i; j++){
				if(i%j==0) numOfDivisors++; //i의 약수가 발견될 때마다 약수개수 증가
			}
			if(numOfDivisors==2) {//약수 개수가 2개라면 소수 
				cnt++;
				System.out.printf("%3d ", i); 
				if(cnt%5==0)
					System.out.println();
			}
		}
		
		 */
	}
>>>>>>> 99344cf6d6a855103188cdb0a595d802a2c11c34
}