import java.util.Scanner;

class HW2p1 {
	public static void main(String[] args){
		
		int cm;
		
		System.out.print("키 : ");
		Scanner s = new Scanner(System.in);
		cm = s.nextInt();
		
		System.out.printf("%dcm는 %d피트 %f인치 입니다.",cm,(int)(cm/2.54/12) ,cm/2.54);
		
		//-------------------------------------------------------2
		
		System.out.println();
		int num;
		int juldae;
		String pm;
		Scanner s2 = new Scanner(System.in);
		System.out.print("정수 : ");
		num = s2.nextInt();
		
		if ((num & 0x80000000) == 0){
			pm = "양수";
			juldae = num;
		}
		else {
			pm = "음수";
			juldae = -1*num;
			
		}
		System.out.printf("\"%d는(은) %s입니다. 이 수의 절댓값은 %d이고,\n\t절댓값을 4로 나눈 몫은 %d이고,\n\t\t나머지는 %d입니다.\"",num, pm, juldae, juldae/4, juldae%4);
	}
}
		