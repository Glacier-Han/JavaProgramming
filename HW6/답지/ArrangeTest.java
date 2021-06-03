//커맨드 라인에서 몇 개의 정수를 입력받아 입력받은 정수들을 오름 차순으로 정렬하는 프로그램을 작성하시오. 
//단, 커맨드 라인에 입력이 존재하지 않는 경우 사용법을 알려주고 프로그램을 종료할 것. 

class ArrangeTest{
	public static void main(String [] args){
		if(args.length==0){
			System.out.println("[사용법]java HW5_2_2 정수1 정수2 ...");
			System.exit(1);
		}
		int [] iArr = new int[args.length];//커맨드 라인의 입력 개수 만큼 정수 배열을 생성함
		int tmp;
		
		//커맨드 라인의 인자들(문자열)을 정수로 형태 변경하여 배열에 저장
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
		
		System.out.println("커맨드 라인 인자들 오름차순 정렬: ");
		for(int i=0; i<iArr.length; i++){
			System.out.print(iArr[i]+" ");
		}
		System.out.println();
	}
}

