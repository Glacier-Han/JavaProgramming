/*
	Animal
	 - age
	 - eat()
	Person
	 - age, name
	 - eat(), speak()
	Student
	 - age, name, grade(학년)
	 - eat(), speak(),  study()
	 //각 클래스에서 디폴트 생성자 작성: 나는 ***입니다. 
*/
class Animal {
	private int age;
	void eat(){
		System.out.println("맛있어요.");
	}
	Animal(){
		System.out.println("나는 동물입니다. ");
	}
	Animal(int age){
		this.age = age;
	}
	public String toString(){//Object 클래스의 toString() 재정의
		return String.format("나이: %d", age);
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
		System.out.println("말해요.");
	}
	Person(){
		System.out.println("나는 사람입니다. ");
	}
	Person(int age, String name){
		super(age);
		this.name = name;
	}
	public String toString(){
		return super.toString()+String.format(", 이름: %s", name);
	}
}
class Student extends Person{
	private int grade;
	void study(){
		System.out.println("공부해요.");
	}
	//모든 필드를 매개변수로 받아 초기화하는 생성자
	Student(int age, String name, int grade){
		super(age, name);
		this.grade = grade;
	}
	Student(){
		//자식클래스의 생성자에서 명시적으로 어떤 생성자도 호출하지 않는다면 부모클래스의 디폴트 생성자를 자동 호출 
		System.out.println("나는 학생입니다. ");
	}
	//equals() 재정의: 두 학생이 같은지 비교하도록 작성: 나이, 이름, 학년이 같다면 같은 학생으로 간주하도록
	public boolean equals(Object o){	//s1.equals(s2)
	
		Student s = (Student)o;
		if(this.getAge()==s.getAge() && this.getName().equals(s.getName()) && this.grade ==s.grade)
			return true;
		else 
			return false;
	}
	/*
	//equals()메소드 중복정의: 두 학생이 같은지 비교하도록 작성: 나이, 이름, 학년이 같다면 같은 학생으로 간주하도록
	public boolean equals(Student s){ // s1학생과 s2학생이 동일한가? s1.equals(s2)
		if(this.getAge()==s.getAge() && this.getName().equals(s.getName()) && this.grade ==s.grade)
			return true;
		else 
			return false;
	}*/
	//학생의 모든 정보를 반환하는 toString()메소드 
	public String toString(){
		return super.toString()+String.format(", 학년: %d", grade);
	}
	
	public static void main(String [] args){
		Stone stone = new Stone();
		Animal s1 =  new Student(9, "홍동", 2);
		//s1.study();//는 불가
		//((Student)s1).study();
		Person s2 = new Student(9, "홍길동", 2);
		// 업캐스팅
		Student s3 = new Student(9, "홍길동", 2);
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






