class EvenTest{
	public static void main(String [] args){
		if(args.length<1){
			System.out.println("[����]java EvenTest ����1 ����2 ����3 ...");
			System.exit(1);
		}
		int [] arr = new int[args.length];
		
		for(int i=0; i<arr.length;i++){
			arr[i] = Integer.parseInt(args[i]);
		}
		System.out.print("Ŀ�ǵ� ���� ���ڵ� �� ¦��: ");
		for(int i=0; i<arr.length;i++){
			if(arr[i]%2==0) System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}