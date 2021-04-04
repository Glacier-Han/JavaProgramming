import java.util.Scanner;

class PrintNbr{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int userInput, qou;
		String rslt;
		
		System.out.print("1억 미만의 정수: ");
		userInput = s.nextInt();
		
		qou = userInput/10000; //몫은 계산하여 출력할 용도
		userInput %=10000; //몫을 제외한 나머지는 앞으로 천, 백, 십 단위로 다시 나눠 출력해야 하므로 따로 보관
		
		rslt = qou>1?qou+"만 ":(qou==1?"만 ":"");
		//몫이 1보다 크다면(예: 321509) 몫에 "만 " 붙인 문장으로 설정(32만) 
		//아니라면 몫이 1인지 아니면 아예 없는 지 판단
			//몫이 1이라면 문장은 "만 "으로 설정
			//몫이 0이라면 빈 문장으로 설정
		System.out.print(rslt);
		
		qou = userInput/1000; 
		userInput %=1000;
		rslt = qou>1?qou+"천 ":(qou==1?"천 ":"");
		System.out.print(rslt);
		
		qou = userInput/100; 
		userInput %=100;
		rslt = qou>1?qou+"백 ":(qou==1?"백 ":"");
		System.out.print(rslt);
		
		qou = userInput/10; 
		userInput %=10;
		rslt = qou>1?qou+"십 ":(qou==1?"십 ":"");
		System.out.print(rslt);
		System.out.printf("%s\n", userInput!=0?userInput:"");
		
		/*
	//	또는 아래와 같이 문장을 연결만 하고 마지막에 한번만 출력하는 것도 가능
		Scanner s = new Scanner(System.in);
		int userInput, qou;
		String rslt;
		
		System.out.print("1억 미만의 정수: ");
		userInput = s.nextInt();
		
		qou = userInput/10000; //몫은 계산하여 출력할 용도
		userInput %=10000; //몫을 제외한 나머지는 앞으로 천, 백, 십 단위로 다시 나눠 출력해야 하므로 따로 보관
		
		rslt = qou>1?qou+"만 ":(qou==1?"만 ":"");
		//몫이 1보다 크다면(예: 321509) 몫에 "만 " 붙인 문장으로 설정(32만) 
		//아니라면 몫이 1인지 아니면 아예 없는 지 판단
			//몫이 1이라면 문장은 "만 "으로 설정
			//몫이 0이라면 빈 문장으로 설정
		
		qou = userInput/1000; 
		userInput %=1000;
		rslt += qou>1?qou+"천 ":(qou==1?"천 ":"");
		
		qou = userInput/100; 
		userInput %=100;
		rslt += qou>1?qou+"백 ":(qou==1?"백 ":"");
		
		qou = userInput/10; 
		userInput %=10;
		rslt += qou>1?qou+"십 ":(qou==1?"십 ":"");
		rslt += userInput!=0?userInput:"";
		
		System.out.println(rslt);
		
		*/
	}
}