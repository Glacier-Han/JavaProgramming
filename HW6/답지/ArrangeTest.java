//Ŀ�ǵ� ���ο��� �� ���� ������ �Է¹޾� �Է¹��� �������� ���� �������� �����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//��, Ŀ�ǵ� ���ο� �Է��� �������� �ʴ� ��� ������ �˷��ְ� ���α׷��� ������ ��. 

class ArrangeTest{
	public static void main(String [] args){
		if(args.length==0){
			System.out.println("[����]java HW5_2_2 ����1 ����2 ...");
			System.exit(1);
		}
		int [] iArr = new int[args.length];//Ŀ�ǵ� ������ �Է� ���� ��ŭ ���� �迭�� ������
		int tmp;
		
		//Ŀ�ǵ� ������ ���ڵ�(���ڿ�)�� ������ ���� �����Ͽ� �迭�� ����
		for(int i=0; i<iArr.length; i++){
			iArr[i] = Integer.parseInt(args[i]);
		}
		
		for(int i=0; i<iArr.length-1; i++){
			for(int  j=i; j<iArr.length; j++){
				if(iArr[i]>iArr[j]){
					tmp = iArr[i]; 
					iArr[i]=iArr[j];
					iArr[j]=tmp;
				}
			}
		}
		
		System.out.println("Ŀ�ǵ� ���� ���ڵ� �������� ����: ");
		for(int i=0; i<iArr.length; i++){
			System.out.print(iArr[i]+" ");
		}
		System.out.println();
	}
}

