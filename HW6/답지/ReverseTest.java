class ReverseTest{
	public static void main(String [] args){
		if(args.length<1){
			System.out.println("[����]java ReverseTest ���ڿ�");
			System.exit(1);
		}
		String s = args[0];
		System.out.print("���� ���ڿ�: ");
		for(int i=s.length()-1; i>=0; i--){
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}
}