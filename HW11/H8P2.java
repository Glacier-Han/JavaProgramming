import java.util.*;

class H8P2{
	public static void main(String [] args){
		Member mem1 = new Member();
		Member mem2 = new Member();
		Member mem3 = new Member();
		Member mem4 = new Member("손승현", 23);
		
		System.out.println("이 동호회 멤버 수는 " + mem4.getCount()+"입니다");
	}
}

class Member{
	private String name;
	private int age;
	static int count;
	
	Member(){
		count++;
		System.out.println("디폴츠생성자 통해 동호회 멤버 생성");
	}
	
	Member(String name, int age){
		System.out.println("이름과 나이가 존재하는 동호회 멤버 생성");
		count++;
		this.name = name;
		this.age = age;
	}
	
	int getCount(){
		return count;
	}
}