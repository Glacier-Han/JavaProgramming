import java.util.*;

class Week7Test{
	public static void main(String[] args){
		//Commandline 2)
		String tem;
		for(int i=0; i<(args.length); i++){
			for(int j=0; j<i; j++){
				if(args[j].compareToIgnoreCase(args[i])>0){
					tem = args[j];
					args[j] = args[i];
					args[i] = tem;
				}
			}
		}
		for(int i=0; i<(args.length); i++){
			System.out.print(args[i]+ " ");
		}
			
		
		
		
		
		
		
		
	}
}