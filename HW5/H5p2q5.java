import java.util.Scanner;

class H5p2q5{
	public static void main(String[] args){
		
		String input, word;
		int space = 1;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		input = sc.nextLine();
		System.out.print("�˻��� �ܾ�: ");
		word = sc.next();
		
		for(int i=0; i<=input.length()-word.length(); i++){
			if(input.charAt(i)==' ' && input.charAt(i+1)!=' ') {
				space++;
			}
			if(input.substring(i,i+word.length()).equalsIgnoreCase(word)){
				System.out.printf("%d��°, ",space);
				cnt++;
			}
		}
		System.out.printf("\b\b �������� \"%s\"��(��) �˻��Ǿ�, �� %dȸ �˻��Ǿ����ϴ�.",word,cnt);
			
		
	}
}