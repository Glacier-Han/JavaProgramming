class ABCTest{
	public static void main(String [] args){
		String tmp;
		if(args.length<1){
			System.out.println("[����]java ABCTest �ܾ�1 �ܾ�2 �ܾ�3 ...");
			System.exit(1);
		}
		for(int i=0; i<args.length-1; i++){
			for(int j=i+1; j<args.length;j++){
				if(args[i].compareToIgnoreCase(args[j])>0){
					tmp = args[i];
					args[i] = args[j];
					args[j] = tmp;
				}
			}
		}
		
		
		for(int i=0; i<args.length;i++){
			System.out.print(args[i]+" ");
		}
	}
}