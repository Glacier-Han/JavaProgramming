import java.util.Scanner;

class H5p2q5{
	public static void main(String[] args){
		
		String input, word;
		int space = 1;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문장: ");
		input = sc.nextLine();
		System.out.print("검색할 단어: ");
		word = sc.next();
		
		for(int i=0; i<=input.length()-word.length(); i++){
			if(input.charAt(i)==' ' && input.charAt(i+1)!=' ') {
				space++;
			}
			if(input.substring(i,i+word.length()).equalsIgnoreCase(word)){
				System.out.printf("%d번째, ",space);
				cnt++;
			}
		}
		System.out.printf("\b\b 어절에서 \"%s\"가(이) 검색되어, 총 %d회 검색되었습니다.",word,cnt);
			
		
	}
}