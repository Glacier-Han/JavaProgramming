import java.util.*;


class Animal{
	int age;
	String name;
	
	void eat(){
		System.out.print("���־��");
	}
	
	void speak(){
		System.out.println("���ؿ�.");
	}
}

class Dog extends Animal{
	/*
	eat() : ���־�� �۸�~
	speak() : �۸�~!
	*/
	
	@Override //�ɼ�, ������ ���̱� ����. �Ƚᵵ ������ ��. , Override �޼ҵ� ��Ÿ ã���� -> �����Ϸ��� override �Ѵٴ°��� ����, ���� ã����.
	//������ : Override
	void speak(){ //����� ��ġ, ������ ����
		System.out.println("�۸�~!");
	}
	
	@Override
	void eat(){
		super.eat();
		System.out.println("�۸�~");
	}
	
	
	public static void main(String [] args){
		Dog d1 = new Dog();
		d1.eat();
		System.out.print(d1.toString());
		
		Animal s1 = new Student(9, "ȫ��", 2);
		//s1.study() -> �Ұ���
		((Student)s1).study(); // -> ���� (�ٿ�ĳ����)
		Person s2 = new Student(9, "ȫ�浿", 2);
		//��ĳ���� -> ���κ��� ���� ���ַ� ����
	}
	
}

class Cat extends Animal{
	/*
	eat() : ���־�� �߿�~
	speak() : ��ȣ~!
	*/
	
	@Override //�ɼ�, ������ ���̱� ����. �Ƚᵵ ������ ��.
	void speak(){ //����� ��ġ, ������ ����
		System.out.println("��ȣ~!");
	}
	
	@Override
	void eat(){
		super.eat();
		System.out.println("�߿�~");
	}
}

