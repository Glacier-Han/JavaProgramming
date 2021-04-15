import java.util.Scanner;

class Play{
	public static void main(String[] args){
		
		String type;
		int line;
		int width, height, rep;
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("??? : ");
			type = sc.nextLine();
			if(type.equals("공부 하기 싫다")) break;
			System.out.println("[입력오류] 솔직하게 입력하세요.");
		}
		
		switch(type){
			case "공부 하기 싫다":
				for(int i=1; i<=6/2+1; i++) {
						for(int j=6/2; j>=i; j--) System.out.print("   ");
						for(int j=1; j<= 2*i-1; j++) System.out.print("공부");
						System.out.print("\n\n");
					}
					for(int i=6/2; i>=1; i--){
						for(int j=6/2; j>=i; j--) System.out.print("   ");
						for(int j=1; j<= i*2-1; j++) System.out.print("싫다");
						System.out.print("\n\n");
					}
					
			int cnt=0, numOfWord=0;
			for(int i=0; i<type.length()-"싫다".length()+1; i++){
				if(type.charAt(i)==' ' &&type.charAt(i+1)!=' ')
					numOfWord++;
				if("싫다".equalsIgnoreCase(type.substring(i, i+"싫다".length()))){
					System.out.printf("%d번째, ", numOfWord);
					cnt++;
					}
			}
			if(cnt!=0) 
				System.out.printf("\b\b 어절에서 \"%s\"가 검색되어 총 %d회 검색되었습니다. \n", word, cnt);
			else
				System.out.printf(" 총 %d회 검색되었습니다. \n", cnt);
		}
	}
}
