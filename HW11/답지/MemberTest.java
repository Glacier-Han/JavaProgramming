class MemberTest{
	public static void main(String [] args){
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		Member m4 = new Member("ȫ�浿", 20);		
		System.out.println("�� ��ȣȸ�� ��� ���� "+Member.numOfMember+"�� �Դϴ�.");
	}
}



class Member{
	String name; 
	int age;
	static int numOfMember;		

	Member(){
		System.out.println("����Ʈ ������ ���� ��ȣȸ ��� ����");
		numOfMember++;
	}

	Member(String name, int age){
		System.out.println("�̸��� ���̰� �����ϴ� ��ȣȸ ��� ����");
		this.name = name;
		this.age = age;
		numOfMember++;
	}
}