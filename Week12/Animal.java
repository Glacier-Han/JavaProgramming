/*
	Animal
	 - age
	 - eat()
	Person
	 - age, name
	 - eat(), speak()
	Student
	 - age, name, grade(�г�)
	 - eat(), speak(),  study()
	 //�� Ŭ�������� ����Ʈ ������ �ۼ�: ���� ***�Դϴ�. 
*/
class Animal {
	private int age;
	void eat(){
		System.out.println("���־��.");
	}
	Animal(){
		System.out.println("���� �����Դϴ�. ");
	}
	Animal(int age){
		this.age = age;
	}
	public String toString(){//Object Ŭ������ toString() ������
		return String.format("����: %d", age);
	}/**/
	int getAge(){
		return age;		
	}
}
class Person extends Animal{
	private String  name;
	
	String getName(){
		return name;		
	}
	void speak(){
		System.out.println("���ؿ�.");
	}
	Person(){
		System.out.println("���� ����Դϴ�. ");
	}
	Person(int age, String name){
		super(age);
		this.name = name;
	}
	public String toString(){
		return super.toString()+String.format(", �̸�: %s", name);
	}
}
class Student extends Person{
	private int grade;
	void study(){
		System.out.println("�����ؿ�.");
	}
	//��� �ʵ带 �Ű������� �޾� �ʱ�ȭ�ϴ� ������
	Student(int age, String name, int grade){
		super(age, name);
		this.grade = grade;
	}
	Student(){
		//�ڽ�Ŭ������ �����ڿ��� ��������� � �����ڵ� ȣ������ �ʴ´ٸ� �θ�Ŭ������ ����Ʈ �����ڸ� �ڵ� ȣ�� 
		System.out.println("���� �л��Դϴ�. ");
	}
	//equals() ������: �� �л��� ������ ���ϵ��� �ۼ�: ����, �̸�, �г��� ���ٸ� ���� �л����� �����ϵ���
	public boolean equals(Object o){	//s1.equals(s2)
	
		Student s = (Student)o;
		if(this.getAge()==s.getAge() && this.getName().equals(s.getName()) && this.grade ==s.grade)
			return true;
		else 
			return false;
	}
	/*
	//equals()�޼ҵ� �ߺ�����: �� �л��� ������ ���ϵ��� �ۼ�: ����, �̸�, �г��� ���ٸ� ���� �л����� �����ϵ���
	public boolean equals(Student s){ // s1�л��� s2�л��� �����Ѱ�? s1.equals(s2)
		if(this.getAge()==s.getAge() && this.getName().equals(s.getName()) && this.grade ==s.grade)
			return true;
		else 
			return false;
	}*/
	//�л��� ��� ������ ��ȯ�ϴ� toString()�޼ҵ� 
	public String toString(){
		return super.toString()+String.format(", �г�: %d", grade);
	}
	
	public static void main(String [] args){
		Stone stone = new Stone();
		Animal s1 =  new Student(9, "ȫ��", 2);
		//s1.study();//�� �Ұ�
		//((Student)s1).study();
		Person s2 = new Student(9, "ȫ�浿", 2);
		// ��ĳ����
		Student s3 = new Student(9, "ȫ�浿", 2);
		s3.equals(stone);
		
		Animal a = new Animal();
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		
		
		System.out.println(a.toString());
		System.out.println(a.getClass().getName());
		
		System.out.println(s1);
		System.out.println(s1.getClass().getName());
		System.out.println(s2);
		
		
		
		
		
	}
}

class Stone{}






