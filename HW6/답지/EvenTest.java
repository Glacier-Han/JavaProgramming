class EvenTest{
	public static void main(String [] args){
		if(args.length<1){
			System.out.println("[사용법]java EvenTest 정수1 정수2 정수3 ...");
			System.exit(1);
		}
		int [] arr = new int[args.length];
		
		for(int i=0; i<arr.length;i++){
			arr[i] = Integer.parseInt(args[i]);
		}
		System.out.print("커맨드 라인 인자들 중 짝수: ");
		for(int i=0; i<arr.length;i++){
			if(arr[i]%2==0) System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}