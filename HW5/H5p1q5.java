import java.util.Scanner;

class H5p1q5{
	public static void main(String[] args){

		String input, srh;
		int cnt = 1; //띄어쓰기를 찾은 횟수 (어절)
		int totalcnt=0; //검색 단어를 찾은 횟수

		Scanner sc = new Scanner(System.in);
		System.out.print("문장: ");
		input = sc.nextLine();
		System.out.print("검색할 단어: ");
		srh = sc.nextLine();

		for(int i=0; i<input.length()-srh.length()+1; i++){
			if(input.charAt(i) == ' ')
				//공백을 찾기 (어절 구분 위함)
				cnt++; //공백을 찾은게 몇번째인지 기록

			if(input.substring(i, i+srh.length()).equalsIgnoreCase(srh)){
				//substring을 이용해 띄어쓰기를 찾은 곳부터 검색단어의 길이만큼 단어 자르기
				//자른 단어가 검색단어와 같은지 확인하고 몇번째인지 출력
				System.out.printf("%d번째, ",cnt);
				totalcnt++;
			}


		}

		System.out.printf("\b\b 어절에서 \"%s\"가(이) 검색되어, 총 %d회 검색되었습니다.",srh,totalcnt);

		//System.out.print(input.length());
		//System.out.print(srh.length());
	}
}
