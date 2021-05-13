class Student{
	private String name;
	private double grade;
	private int age;
	void speak(){
		System.out.printf("���� %d�� %s�Դϴ�. ���� ������ %.1f�Դϴ�.\n", age, name, grade);
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
			this.name = "�����";
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
		i.setName("ȫ�浿");
		i.setGrade(4.3);
		
		i.speak();
	}
}