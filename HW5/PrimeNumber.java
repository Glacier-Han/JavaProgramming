<<<<<<< HEAD
import java.util.Scanner;
//1�̻� 100������ �Ҽ� �� ���ο� 5���� ���
class PrimeNumber{
	public static void main(String [] args){
		int cnt = 0, numOfDivisors=0; //�� ���ο� 5���� ����ϱ� ���� cnt ���� ����
		//cnt�� �Ҽ� ���� ī��Ʈ-> �Ҽ� ������ 5�� ����� �� ����
		
		//i�� �Ҽ� ���� �Ǵ��ϱ� 
		//���1: 2�̻� i-1������ �� �߿��� i�� ��� ���� ���η� �Ҽ� �Ǵ�.  
		//���2: ��� ���� 2���� �ƴϳ�. 
		
		
		//��� 1: �Ʒ��� �ּ� ���� ������ �ڵ� ���� �ȵǴ� ���� �Ʒ� �ڵ� Ȯ�� �ٶ��ϴ�. 
		for(int i=1; i<=100; i++){
			int j; //j�� �Ʒ� for�� ��� ���������� ���ǹǷ� for�� �ܺο��� ����. 
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
		
		//��� 2: �Ʒ��� �ּ� ���� ������ �ڵ� ���� �ȵǴ� ���� �Ʒ� �ڵ� Ȯ�� �ٶ��ϴ�. 
		cnt =0;//�Ҽ� ���� 0���� �ٽ� 0���� ����
		for(int i=1; i<=100; i++){
			numOfDivisors = 0;//i���� ��������� ������ ����, i�� �޶��������� ��������� 0���� ����
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
		//��� 1 �ּ�����
		for(int i=1; i<=100; i++){
			int j;
			for(j=2; j<i; j++){//j�� i ��� �ĺ�(1�� i�ڽ� ������)
				if(i%j==0) break; //2�̻� i-1������ �� �߿��� i�� ����� �߰ߵǸ� i�� �Ҽ��� �ƴϹǷ� break �ɰ� �ݺ��� ����
			}
			//�̱��� �Դ� �� �� ��찡 ����. ��break �ɷ� ���� ���:�Ҽ� �ƴ� �ιݺ��� ������ �����̶� ���� ���(�� ��� j=i��): 2�̻� i-1�� �� �� ����� �־� break������ �ʾҴٴ� ���̹Ƿ� �Ҽ���. 
			if(j==i) {//�Ҽ��� ��� 
				cnt++;//�Ҽ� ī��Ʈ
				System.out.printf("%3d ", i); 
				if(cnt%5==0)//�Ҽ� 5���� ����� 
					System.out.println();//����
			}
		}
		*/
		
		/*
		//��� 2 �ּ�����
		
		cnt =0;//�Ҽ� ���� 0���� �ٽ� 0���� ����
		for(int i=1; i<=100; i++){
			numOfDivisors = 0;//i���� ��������� ������ ����, i�� �޶��������� ��������� 0���� ����
			int j;
			for(j=1; j<=i; j++){
				if(i%j==0) numOfDivisors++; //i�� ����� �߰ߵ� ������ ������� ����
			}
			if(numOfDivisors==2) {//��� ������ 2����� �Ҽ� 
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
//1�̻� 100������ �Ҽ� �� ���ο� 5���� ���
class PrimeNumber{
	public static void main(String [] args){
		int cnt = 0, numOfDivisors=0; //�� ���ο� 5���� ����ϱ� ���� cnt ���� ����
		//cnt�� �Ҽ� ���� ī��Ʈ-> �Ҽ� ������ 5�� ����� �� ����
		
		//i�� �Ҽ� ���� �Ǵ��ϱ� 
		//���1: 2�̻� i-1������ �� �߿��� i�� ��� ���� ���η� �Ҽ� �Ǵ�.  
		//���2: ��� ���� 2���� �ƴϳ�. 
		
		
		//��� 1: �Ʒ��� �ּ� ���� ������ �ڵ� ���� �ȵǴ� ���� �Ʒ� �ڵ� Ȯ�� �ٶ��ϴ�. 
		for(int i=1; i<=100; i++){
			int j; //j�� �Ʒ� for�� ��� ���������� ���ǹǷ� for�� �ܺο��� ����. 
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
		
		//��� 2: �Ʒ��� �ּ� ���� ������ �ڵ� ���� �ȵǴ� ���� �Ʒ� �ڵ� Ȯ�� �ٶ��ϴ�. 
		cnt =0;//�Ҽ� ���� 0���� �ٽ� 0���� ����
		for(int i=1; i<=100; i++){
			numOfDivisors = 0;//i���� ��������� ������ ����, i�� �޶��������� ��������� 0���� ����
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
		//��� 1 �ּ�����
		for(int i=1; i<=100; i++){
			int j;
			for(j=2; j<i; j++){//j�� i ��� �ĺ�(1�� i�ڽ� ������)
				if(i%j==0) break; //2�̻� i-1������ �� �߿��� i�� ����� �߰ߵǸ� i�� �Ҽ��� �ƴϹǷ� break �ɰ� �ݺ��� ����
			}
			//�̱��� �Դ� �� �� ��찡 ����. ��break �ɷ� ���� ���:�Ҽ� �ƴ� �ιݺ��� ������ �����̶� ���� ���(�� ��� j=i��): 2�̻� i-1�� �� �� ����� �־� break������ �ʾҴٴ� ���̹Ƿ� �Ҽ���. 
			if(j==i) {//�Ҽ��� ��� 
				cnt++;//�Ҽ� ī��Ʈ
				System.out.printf("%3d ", i); 
				if(cnt%5==0)//�Ҽ� 5���� ����� 
					System.out.println();//����
			}
		}
		*/
		
		/*
		//��� 2 �ּ�����
		
		cnt =0;//�Ҽ� ���� 0���� �ٽ� 0���� ����
		for(int i=1; i<=100; i++){
			numOfDivisors = 0;//i���� ��������� ������ ����, i�� �޶��������� ��������� 0���� ����
			int j;
			for(j=1; j<=i; j++){
				if(i%j==0) numOfDivisors++; //i�� ����� �߰ߵ� ������ ������� ����
			}
			if(numOfDivisors==2) {//��� ������ 2����� �Ҽ� 
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