import java.util.*;

class H8P2{
	public static void main(String [] args){
		Member mem1 = new Member();
		Member mem2 = new Member();
		Member mem3 = new Member();
		Member mem4 = new Member("�ս���", 23);
		
		System.out.println("�� ��ȣȸ ��� ���� " + mem4.getCount()+"�Դϴ�");
	}
}

class Member{
	private String name;
	private int age;
	static int count;
	
	Member(){
		count++;
		System.out.println("������������ ���� ��ȣȸ ��� ����");
	}
	
	Member(String name, int age){
		System.out.println("�̸��� ���̰� �����ϴ� ��ȣȸ ��� ����");
		count++;
		this.name = name;
		this.age = age;
	}
	
	int getCount(){
		return count;
	}
}