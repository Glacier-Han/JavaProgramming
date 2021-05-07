/*
	�������� ���α׷��ϰ� �׽�Ʈ�ض�
	������ 
		�ʵ� : ����, �̸�, ������(����:0~10)
		�޼ҵ� : eat(int food), play()
		
	������ �׽�Ʈ
		���������� ���̸�  5��ŭ �ش�.
		�������� ����ش�
*/
import java.util.*;

class Dog{
	
	private int age;
	private String name;
	private int fullrate;
	//�ʵ�� private�� �δ°� �Ϲ��� (�ܺο��� ���� ����)
	//���������� : private public ....
	//private : Ŭ���� ���ο����� ��밡��
	
	//�ܺο��� private�� �ʵ忡 �����ϱ� ���� ��� ����� �����.
	//getter setter
	
	//1.getter : private�� �ʵ尪�� ���� ���� �뵵
	int getAge(){
		return age;
	}
	
	int getFullrate(){
		return fullrate;
	}
	
	String getName(){
		return name;
	}
	
	//2.setter : private�� �ʵ尪�� �����ϱ� ���� �뵵
	void setAge(int age){
		if(age>=0 && age<=40)
			this.age = age; //this -> �� Ŭ������ age, �׳� age -> �Ű����� age
		else
			this.age = 5;
		
	}
	//�������� ���� setter : �������� 0�̻� 10���ϸ� ��ȿ
	//�̸��� ���� setter : �̸��� ���̰� 10������ ��츸 ��ȿ
	
	void setFullrate(int fullrate){
		if(fullrate>=0 && fullrate<=10)
			this.fullrate = fullrate;
		else
			this.fullrate = 5;
		
	}
	
	void setName(String name){
		if(name.length() <= 10)
			this.name = name;
		else
			this.name = "������";
	}
	
	void eat(int food){
		if(food<=0) System.out.println("�峭 ����");
		else if(food>0 && food<10){
			System.out.println("���̸� "+food+"��ŭ �Ծ����");
			fullrate += food;
			if(fullrate>10) fullrate = 10;
			
			System.out.println("�߸Ծ����ϴ� ");
		}
	}
	
	void eat(String food){
		System.out.println(food + "�� �Խ��ϴ�!");
		fullrate += 3;
	}
	
	void play(){
		System.out.println("��հ� ��Ҿ��");
	}
	
	void showFull(){
		System.out.println(name + "�� �������� " + fullrate + "����");
	}
	
	
	
}

class DogTest{
	public static void main(String [] args){
		Dog myDog = new Dog();
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ���̸� �Է��ϼ��� : ");
		myDog.setAge(sc.nextInt());
		myDog.getAge();
		
		System.out.print("�������� �̸��� �Է��ϼ��� :");
		myDog.setName(sc.next());
		myDog.getName();
		
		Random ran = new Random();
		
		myDog.setFullrate(ran.nextInt(11));
		myDog.showFull();
		if(myDog.getFullrate() < 5){
			myDog.eat("�ܹ���"); //�ܹ��Ÿ� �Խ��ϴ�!
			System.out.println(myDog.getName() + "���� ���̸�  5��ŭ �ش�.");
			myDog.eat(5);
			
		}
		else {
			System.out.println(myDog.getName() + "�� ��ƶ�.");
			myDog.play();
		}
		
	}
}