import java.util.Scanner;

class StringManipulate{
	String concat(String s1, String s2){
		return s1+s2;
	}
	String toUpper(String s){
		String newString = "";//���ڿ��� ���� �Ϻ� ������ �Ұ��Ͽ� �ƿ� ���ο� ���ڿ��� �빮�ڷ� ������ ���ڿ��� ����
		//������ ���� ���ڿ��� �ʱ�ȭ
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)>='a'&&s.charAt(i)<='z')
				newString += (char)(s.charAt(i)-32);
			//32�� �빮�ڿ� �ҹ��� ����: 32 ��� ('a'-'A')�� �ۼ��ص� �����մϴ�. 
			//s.charAt(i)-32�� char�ڷ�-int�ڷ� �̹Ƿ� �� ����� �� ū �ڷ����� int���� �˴ϴ�. ���� �ٽ� char�� ����ȯ������մϴ�.  
			else 
				newString += s.charAt(i);
		}
		return newString;
	}
	boolean equals(String s1, String s2){
		if(s1.length()!=s2.length())
			return false;//���̰� �ٸ��ٸ� ���� �ʿ� ���� false ��ȯ
		//���̰� ���ٸ� �� ����
		for(int i=0; i<s1.length(); i++){
			if(s1.charAt(i)!=s2.charAt(i))
				return false; //i��° ���ڰ� �ٸ��ٸ� false�� ��ȯ
		}
		//�̱��� �Դٸ� �� �ݺ������� false�� ��ȯ�ϰ� �޼ҵ� ������� �ʾҴٴ� ��: ��, ��� ���ڰ� ��ġ�Ѵٴ� ���̹Ƿ� true�� ��ȯ
		return true;
	}
}

class StringManipulateTest{
	public static void main(String [] args){
		String s1, s2;
		StringManipulate sm = new StringManipulate();
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� 1: ");
		s1 = s.nextLine();
		System.out.print("���� 2: ");
		s2 = s.nextLine();
		
		System.out.println("���� 1�� ���� 2�� ���� ���: "+sm.concat(s1, s2));
		System.out.println("���� 1 �빮�� ��ȯ ���: "+sm.toUpper(s1));
		System.out.println("���� 1�� ���� 2�� ��ġ ����: "+sm.equals(s1, s2));
		
	}
}