class MemberTest{
	public static void main(String [] args){
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		Member m4 = new Member("홍길동", 20);		
		System.out.println("이 동호회의 멤버 수는 "+Member.numOfMember+"명 입니다.");
	}
}



class Member{
	String name; 
	int age;
	static int numOfMember;		

	Member(){
		System.out.println("디폴트 생성자 통해 동호회 멤버 생성");
		numOfMember++;
	}

	Member(String name, int age){
		System.out.println("이름과 나이가 존재하는 동호회 멤버 생성");
		this.name = name;
		this.age = age;
		numOfMember++;
	}
}