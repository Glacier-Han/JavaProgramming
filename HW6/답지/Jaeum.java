class Jaeum{
	public static void main(String [] args){
		String word;
		int nbOfMoeum = 0, nbOfJaeum=0;//각각 모음 개수
		
		if(args.length != 1){
			System.out.println("[입력오류]하나의 문자열을 입력하지 않아 프로그램을 종료합니다. ");
			System.exit(1);
		}
		
		word = args[0]; //커맨드라인에 입력한 하나의 단어를 word에 저장
		
		for(int i=0; i<word.length(); i++){
			if(((word.charAt(i)>='A')&&(word.charAt(i)<='Z'))||((word.charAt(i)>='a')&&(word.charAt(i)<='z'))){//word의 i번째 문자가 알파벳이라면 카운팅
				switch(word.charAt(i)){
				case 'A': case 'E': case 'I': case 'O': case 'U': 
				case 'a': case 'e': case 'i': case 'o': case 'u': 
					nbOfMoeum++;
					break;
				default: 
					nbOfJaeum++;
					break;
				}
			}
		}
		
		System.out.println("자음 개수: "+nbOfJaeum);
		System.out.println("모음 개수: "+nbOfMoeum);
	}
}