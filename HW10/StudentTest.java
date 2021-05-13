class Student{
	private String name;
	private double grade;
	private int age;
	void speak(){
		System.out.printf("나는 %d세 %s입니다. 나의 학점은 %.1f입니다.\n", age, name, grade);
	}
	
	void setAge(int age){
		if(age>=0 && age<=200)
			this.age = age;
		else
			this.age = 23;
	}	
	void setName(String name){
		if(name.length()<20)
			this.name = name;
		else
			this.name = "장발장";
	}	
	void setGrade(double grade){
		if(grade>=0 && age<=4.3)
			this.grade = grade;
		else
			this.grade = 4.3;
	}
}
class StudentTest{
	public static void main(String [] args){
		Student i = new Student();
		
		i.speak();
		
		i.setAge(21);
		i.setName("홍길동");
		i.setGrade(4.3);
		
		i.speak();
	}
}