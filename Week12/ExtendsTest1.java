/*
	Animal
	- age
	- eat()
	
	Person
	- age, name
	- eat(), speak()
	
	Student
	- age, name, grade(학년)
	- eat(), speak(), study()
	
	//각 클래스에서 디폴트 생성자 작성 : 나는 ***입니다.
	//꼭 테스트 클래스를 만들 필요는 없음
	
*/

class Animal{
	private int age;
	
	void eat(){
	System.out.println("먹었어요");
	}
	
	int getAge(){
		return age;
	}
	
	Animal(){
		System.out.println("나는 동물입니다.");
	}
	
	Animal(int age){
		this.age = age;
	}
	
	public String toString(){
		return String.format("나이 : %d,", age);
	}
}

class Person extends Animal{
	private String name;
	
	void speak(){
		System.out.println("말했어요");
	}
	
	String getName(){
		return name;
	}
	
	Person(){
		System.out.println("나는 사람이에요");
	}
	
	Person(int age, String name){
		super(age); //부모클래스(슈퍼클래스) 이름 부르지 않고 'super' 처리 -> 'this' 쓰는 원리와 같음
		this.name = name;
	}
	
	public String toString(){
		return super.toString() + String.format("이름 : %s, ", name);
	}
	
	public static void main(String [] args){
		new Student();
		/*
		실행결과 : 
		나는 동물입니다.
		나는 사람이에요
		나는 학생이네요
		
		이유 : 상속받는 클래스부터 쭉 생성 -> animal부터 생성
		*/
		
		Student son = new Student(23, "손승현", 2);
		System.out.println(son.toString());
		Student kim = new Student(23, "김준엽", 2);
		System.out.println(kim.toString());
		Student kim2 = new Student(23, "김준엽", 2);
		System.out.println(kim2.toString());
		
		System.out.println(son.getClass()); //class **
		System.out.println(kim.getClass().getName()); //**
		
		System.out.println(son.equals(kim));
		System.out.println(kim.equals(kim2));
		
		//toString get으로 한번에, main 밖에 가능한지?
		
		Stone stone = new Stone();
		//kim2.equals(stone);  --> 에러 발생 , 돌->학생 캐스팅 불가.
		
		
	}
}

class Student extends Person{
	int grade;
	
	void study(){
		System.out.println("공부해요");
	}
	
	Student(){ //자식클래스의 생성자에서 명시적으로 어떤 생성자도 호출하지 않는다면 부모클래스의 생성자를 자동호출
		System.out.println("나는 학생이네요");
	}
	
	Student(int age, String name, int grade){
		super(age, name);
		this.grade = grade;
	}
	
	public String toString(){ //object 클래스의 toString() 재정의
		return super.toString() + String.format("학년 : %d", grade);
		//return String.format("%d, %s, %d",super.getAge(), super.getName(), grade);
	}
	
	//equals() 재정의 : 두 학생이 같은지 비교하도록 작성 , 나이이름학년이 같다면 같은학생으로 간주하도록!
	public boolean equals(Object o){ //s1.equals(s2)
	
		//o가 학생이라면 캐스팅 후 비교하도록
		//o가 학생이 아니라면 false 반환
		if(o instanceof Student){
			
			Student s = (Student)o;
			if(this.getAge() == s.getAge() && this.getName().equals(s.getName()) && this.grade == s.grade) return true;
			else return false;
			
		}
		
		else return false;
		
	}
	
	
	//equals() 메소드 중복정의 작성 : 두 학생이 같은지 비교하도록 작성 , 나이이름학년이 같다면 같은학생으로 간주하도록!
	public boolean equals(Student s){ //s1학생과 s2학생이 동일한지? --> s1.equals(s2);
		if(this.getAge() == s.getAge() && this.getName().equals(s.getName()) && this.grade == s.grade) return true;
		else return false;
		
	}	
}

class Stone{
}





	