import java.util.*;

class Students{
	private String name;
	private int age;
	private double score;
	
	String getName(){
		return name;
	}
	
	void setName(String name){
		this.name = name;
	}
	
	int getAge(){
		return age;
	}
	
	void setAge(int age){
		if(age >= 0 && age < 200) {
			this.age = age;
			System.out.println("나이를 "+ age + "살로 변경합니다");
		}
		else System.out.println("유효하지 않은 값");
	}
	
	double getScore(){
		return score;
	}
	
	void setScore(double score){
		if(score >= 0 && score <= 4.3){
			this.score = score;
			System.out.println("학점을 "+ score + "로 변경합니다");
		}
		else System.out.println("유효하지 않은 값");
	}
	
	Students(){
		this("홍길동", 20, 3.0);
	}
	
	Students(String name, int age, double score){
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public String toString(){
		return String.format("학생정보\n 이름 : %s, 나이 : %d, 학점 : %.1f \n",name, age, score);
	}
}
	
	
	class H8P1{
		public static void main(String [] args){
			Scanner sc = new Scanner(System.in);
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("학점 : ");
			double score = sc.nextDouble();
			Students st1 = new Students(name, age, score);
			st1.setScore(4.3);
			System.out.println(st1.toString());
		}
	}
	