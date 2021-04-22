import java.util.Scanner;

class H5p1q4{
	public static void main(String[] args){
		int cnt=0;
		for(int i=1; i<=100; i++){
			int j;
			for(j=2; j<i; j++){
				if(i%j==0) break;
			}
			if(i==j) {
				cnt++;
				System.out.printf("%3d ",i);
				if(cnt%5 == 0) System.out.println();
			}

		}
		
		Scanner sc = new Scanner(System.in);
		String input,word;
	System.out.printf("문장: ");
	input = sc.nextLine();
	
	System.out.printf("검색단어: ");
	word = sc.next();

	int cnt1=0, wcnt=1;
	for(int i=0; i<=input.length()-word.length(); i++){
			if(input.charAt(i)==' ' && input.charAt(i+1)!=' ') {
				cnt1++;
			}
			if(input.substring(i,i+word.length()).equalsIgnoreCase(word)){
				System.out.printf("%d번째, ",cnt1);
				wcnt++;
			}
	}
	System.out.printf("\b\b 어절에서 %s가 검색되어, 총 %d회 검색되었습니다.", word, wcnt);
	}
}
