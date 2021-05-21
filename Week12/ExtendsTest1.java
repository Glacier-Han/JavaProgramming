/*
	Animal
	- age
	- eat()
	
	Person
	- age, name
	- eat(), speak()
	
	Student
	- age, name, grade(�г�)
	- eat(), speak(), study()
	
	//�� Ŭ�������� ����Ʈ ������ �ۼ� : ���� ***�Դϴ�.
	//�� �׽�Ʈ Ŭ������ ���� �ʿ�� ����
	
*/

class Animal{
	private int age;
	
	void eat(){
	System.out.println("�Ծ����");
	}
	
	int getAge(){
		return age;
	}
	
	Animal(){
		System.out.println("���� �����Դϴ�.");
	}
	
	Animal(int age){
		this.age = age;
	}
	
	public String toString(){
		return String.format("���� : %d,", age);
	}
}

class Person extends Animal{
	private String name;
	
	void speak(){
		System.out.println("���߾��");
	}
	
	String getName(){
		return name;
	}
	
	Person(){
		System.out.println("���� ����̿���");
	}
	
	Person(int age, String name){
		super(age); //�θ�Ŭ����(����Ŭ����) �̸� �θ��� �ʰ� 'super' ó�� -> 'this' ���� ������ ����
		this.name = name;
	}
	
	public String toString(){
		return super.toString() + String.format("�̸� : %s, ", name);
	}
	
	public static void main(String [] args){
		new Student();
		/*
		������ : 
		���� �����Դϴ�.
		���� ����̿���
		���� �л��̳׿�
		
		���� : ��ӹ޴� Ŭ�������� �� ���� -> animal���� ����
		*/
		
		Student son = new Student(23, "�ս���", 2);
		System.out.println(son.toString());
		Student kim = new Student(23, "���ؿ�", 2);
		System.out.println(kim.toString());
		Student kim2 = new Student(23, "���ؿ�", 2);
		System.out.println(kim2.toString());
		
		System.out.println(son.getClass()); //class **
		System.out.println(kim.getClass().getName()); //**
		
		System.out.println(son.equals(kim));
		System.out.println(kim.equals(kim2));
		
		//toString get���� �ѹ���, main �ۿ� ��������?
		
		Stone stone = new Stone();
		//kim2.equals(stone);  --> ���� �߻� , ��->�л� ĳ���� �Ұ�.
		
		
	}
}

class Student extends Person{
	int grade;
	
	void study(){
		System.out.println("�����ؿ�");
	}
	
	Student(){ //�ڽ�Ŭ������ �����ڿ��� ��������� � �����ڵ� ȣ������ �ʴ´ٸ� �θ�Ŭ������ �����ڸ� �ڵ�ȣ��
		System.out.println("���� �л��̳׿�");
	}
	
	Student(int age, String name, int grade){
		super(age, name);
		this.grade = grade;
	}
	
	public String toString(){ //object Ŭ������ toString() ������
		return super.toString() + String.format("�г� : %d", grade);
		//return String.format("%d, %s, %d",super.getAge(), super.getName(), grade);
	}
	
	//equals() ������ : �� �л��� ������ ���ϵ��� �ۼ� , �����̸��г��� ���ٸ� �����л����� �����ϵ���!
	public boolean equals(Object o){ //s1.equals(s2)
	
		//o�� �л��̶�� ĳ���� �� ���ϵ���
		//o�� �л��� �ƴ϶�� false ��ȯ
		if(o instanceof Student){
			
			Student s = (Student)o;
			if(this.getAge() == s.getAge() && this.getName().equals(s.getName()) && this.grade == s.grade) return true;
			else return false;
			
		}
		
		else return false;
		
	}
	
	
	//equals() �޼ҵ� �ߺ����� �ۼ� : �� �л��� ������ ���ϵ��� �ۼ� , �����̸��г��� ���ٸ� �����л����� �����ϵ���!
	public boolean equals(Student s){ //s1�л��� s2�л��� ��������? --> s1.equals(s2);
		if(this.getAge() == s.getAge() && this.getName().equals(s.getName()) && this.grade == s.grade) return true;
		else return false;
		
	}	
}

class Stone{
}





	