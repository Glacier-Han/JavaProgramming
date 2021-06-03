class ReverseTest{
	public static void main(String [] args){
		if(args.length<1){
			System.out.println("[사용법]java ReverseTest 문자열");
			System.exit(1);
		}
		String s = args[0];
		System.out.print("역순 문자열: ");
		for(int i=s.length()-1; i>=0; i--){
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}
}