import java.util.*;

class MS_2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int line;
		while(true){
			System.out.print("라인 수: ");
			line = sc.nextInt();
			if(line>0 && line<=10) break;
			System.out.println("[입력오류]");
		}
		
		for(int i=1; i<=line; i++){
			for(int j=0; j<line-i; j++) System.out.print(" ");
			for(int j=0; j<i; j++) System.out.print(i-j-1);
			for(int j=0; j<i-1; j++) System.out.print(j+1);
			System.out.println();
		}
		for(int i=1; i<=line-1; i++){
			for(int j=0; j<i; j++) System.out.print(" ");
			for(int j=0; j<line-1-i; j++) System.out.print(line-1-i-j);
			for(int j=0; j<line-i; j++) System.out.print(j);
			System.out.println();
		}
		
		int cnt=1;
		for(int t=1; t<=100; t++){
			int j;
			for(j=2; j<=t; j++){
				if(t%j==0) break;
			}
			if(t==j){
				System.out.printf("%2d ", t);
				if(cnt%5==0) System.out.println();
				cnt++;
			}
		}
		
		Scanner sc1 = new Scanner(System.in);
		String word, input;
		int tcnt=0, wcnt=0;
		System.out.print("문장: ");
		input = sc1.nextLine();
		System.out.print("단어: ");
		word = sc1.next();
		
		for(int i=0; i<=input.length()-word.length(); i++){
			if(input.charAt(i)==' ') tcnt++;
			if(input.substring(i,i+word.length()).equalsIgnoreCase(word)){
				wcnt++;
				System.out.printf("%d번째, ",tcnt+1);
			}
		}
		
		System.out.printf("\b\b 어절에서 \"%s\"가(이) 검색되어 총 %d회 검색됨",word,wcnt);
		
	}
}