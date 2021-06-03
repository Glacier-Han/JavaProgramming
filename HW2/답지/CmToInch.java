import java.util.Scanner;

class CmToInch{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int cm, feet;
		double inch;
		System.out.println();
		System.out.print("키: ");
		cm = s.nextInt();
		
		inch = cm/2.54;
		feet = (int)(inch/12);
		inch -= feet*12;
		
		System.out.printf("%dcm는 %d피트 %f인치입니다.\n", cm, feet, inch);
		
	}
}