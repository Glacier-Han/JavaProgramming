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
			System.out.println("���̸� "+ age + "��� �����մϴ�");
		}
		else System.out.println("��ȿ���� ���� ��");
	}
	
	double getScore(){
		return score;
	}
	
	void setScore(double score){
		if(score >= 0 && score <= 4.3){
			this.score = score;
			System.out.println("������ "+ score + "�� �����մϴ�");
		}
		else System.out.println("��ȿ���� ���� ��");
	}
	
	Students(){
		this("ȫ�浿", 20, 3.0);
	}
	
	Students(String name, int age, double score){
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public String toString(){
		return String.format("�л�����\n �̸� : %s, ���� : %d, ���� : %.1f \n",name, age, score);
	}
}
	
	
	class H8P1{
		public static void main(String [] args){
			Scanner sc = new Scanner(System.in);
			System.out.print("�̸� : ");
			String name = sc.next();
			System.out.print("���� : ");
			int age = sc.nextInt();
			System.out.print("���� : ");
			double score = sc.nextDouble();
			Students st1 = new Students(name, age, score);
			st1.setScore(4.3);
			System.out.println(st1.toString());
		}
	}
	