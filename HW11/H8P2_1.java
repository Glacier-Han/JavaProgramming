import java.util.*;

class H8P2_1{
	public static void main(String [] args){
		Member mem1 = new Member();
		Member mem2 = new Member();
		Member mem3 = new Member();
		Member mem4 = new Member("�ս���", 23);

		System.out.println("�� ��ȣȸ ��� ���� " + mem4.getCount()+"�Դϴ�");
		System.out.println(mem1.toString());
		System.out.println(mem2.toString());
		System.out.println(mem3.toString());
		System.out.println(mem4.toString());
	}
}

class Member{
	private String name;
	private int age;
	static int count;

	String getName(){
		return name;
	}

	int getAge(){
		return age;
	}

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

	public String toString(){
		return String.format("�̸� : %s, ���� : %d",name, age);
	}
}
