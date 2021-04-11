import java.util.Scanner;

class SearchWord{
	public static void main(String [] args){
		String line, word;
		int cnt = 0, numOfWord = 1;
		Scanner s = new Scanner(System.in);
		System.out.print("문장: ");
		line = s.nextLine(); 
		
		System.out.print("단어: ");
		word = s.next(); 
		
		for(int i=0; i<line.length()-word.length(); i++){
			if(line.charAt(i)==' ' &&line.charAt(i+1)!=' ')
				numOfWord++;
			if(word.equalsIgnoreCase(line.substring(i, i+word.length()))){
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