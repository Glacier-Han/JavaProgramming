import java.util.Scanner;

class SearchWord{
	public static void main(String [] args){
		String line, word;
		int cnt = 0, numOfWord = 1;
		Scanner s = new Scanner(System.in);
		System.out.print("����: ");
		line = s.nextLine(); 
		
		System.out.print("�ܾ�: ");
		word = s.next(); 
		
		for(int i=0; i<line.length()-word.length(); i++){
			if(line.charAt(i)==' ' &&line.charAt(i+1)!=' ')
				numOfWord++;
			if(word.equalsIgnoreCase(line.substring(i, i+word.length()))){
				System.out.printf("%d��°, ", numOfWord);
				cnt++;
				}
		}
	if(cnt!=0) 
		System.out.printf("\b\b �������� \"%s\"�� �˻��Ǿ� �� %dȸ �˻��Ǿ����ϴ�. \n", word, cnt);
	else
		System.out.printf(" �� %dȸ �˻��Ǿ����ϴ�. \n", cnt);
	}
}