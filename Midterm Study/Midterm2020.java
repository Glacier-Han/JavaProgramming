import java.util.*;

class Midterm2020{
	public static void main(String[] args){
		//12:50
		//1�� 4��
		int password;
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		System.out.printf("��й�ȣ: ");
		password = ran.nextInt(999999);
		System.out.printf("%06d",password);
		
		System.out.println();
		System.out.println();
		
		//2�� 12�� 55�� -> 1�� 12�� >> 17��
		int a, b,tem;
		double x=0;
		System.out.print("a: ");
		a = sc.nextInt();
		System.out.print("b: ");
		b = sc.nextInt();
		
		if(a>b) {
			tem = a;
			a = b;
			b = tem;
		}
		
		for(int i=a; i<=b; i++){
			if(i<5 && (i%2==1 || i%2==-1)) {
				x = 3*Math.sin((double)i);
				System.out.printf("(%d, %.2f)\n",i,x);
			}
			else if(i>=5 && i%2==1){
				x = Math.sqrt((Math.pow(i,2)-5*i+4));
				System.out.printf("(%d, %.2f)\n",i,x);
			}
		}
		
		System.out.println();
		System.out.println();
		
		//3�� 1�� 15�� --> 41�� ->25��
		String word,wordup;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("����: ");
		word = sc1.nextLine();
		sc.nextLine(); //���ͼҰ�
		wordup = word.toUpperCase();
		
		for(char j='A'; j<='Z'; j++){
			int chcnt=0;
			for(int i=0; i<word.length(); i++){
				
				if(j==wordup.charAt(i)) {
					chcnt++;
					System.out.printf("%c: %d\n",wordup.charAt(i), chcnt);
				}
			}
		}
		
		//4�� 1�� 45�� --> 2�� 5�� --> 20��
		int intarg = Integer.parseInt(args[0]);
		if(args.length <= 0){
			System.out.println("[����]java 3�̻�������");
			System.exit(1);
		}
		if(intarg<3){
			System.out.println("3�̻��� ������ �Է��ϼ���");
			System.exit(1);
		}
		
		if(intarg%2 == 0){
			for(int i=1; i<=intarg; i++){
				for(int j=0; j<2*(intarg-i)-1; j++) System.out.print(" ");
				for(int j=0; j<4*(i-1)+1; j++) System.out.print("*");
				System.out.println();
			}
		}
		
		else if(intarg%2 == 1){
			for(int i=1; i<=intarg/2+1; i++){
				for(int j=0; j<intarg/2+1-i; j++) System.out.print(" ");
				for(int j=0; j<i; j++) System.out.print("5");
				System.out.println();
			}
			for(int i=1; i<=intarg/2; i++){
				for(int j=0; j<intarg/2+1-i; j++) System.out.print("5");
				System.out.println();
			}
			
		}
		
		//6�� ���Ӹ� 2�� 8�� --> 13�� >> 5��
		
		String input6;
		System.out.print("���ڿ�: ");
		input6 = sc1.nextLine();
		System.out.print("���Ӹ�: ");
		System.out.print(input6.charAt(0));
		
		for(int i=0; i<input6.length(); i++){
			if(input6.charAt(i) == ' ') System.out.print(input6.charAt(i+1));
		}
		
		
		
		
			
	}
}
	