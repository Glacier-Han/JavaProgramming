import java.util.*;


class Animal{
	int age;
	String name;
	
	void eat(){
		System.out.print("맛있어요");
	}
	
	void speak(){
		System.out.println("말해요.");
	}
}

class Dog extends Animal{
	/*
	eat() : 맛있어요 멍멍~
	speak() : 멍멍~!
	*/
	
	@Override //옵션, 가독성 높이기 위함. 안써도 컴파일 됨. , Override 메소드 오타 찾아줌 -> 컴파일러가 override 한다는것을 인지, 오류 찾아줌.
	//재정의 : Override
	void speak(){ //헤더는 일치, 내용은 변경
		System.out.println("멍멍~!");
	}
	
	@Override
	void eat(){
		super.eat();
		System.out.println("멍멍~");
	}
	
	
	public static void main(String [] args){
		Dog d1 = new Dog();
		d1.eat();
		System.out.print(d1.toString());
		
		Animal s1 = new Student(9, "홍동", 2);
		//s1.study() -> 불가능
		((Student)s1).study(); // -> 가능 (다운캐스팅)
		Person s2 = new Student(9, "홍길동", 2);
		//업캐스팅 -> 본인보다 위의 범주로 참조
	}
	
}

class Cat extends Animal{
	/*
	eat() : 맛있어요 야옹~
	speak() : 야호~!
	*/
	
	@Override //옵션, 가독성 높이기 위함. 안써도 컴파일 됨.
	void speak(){ //헤더는 일치, 내용은 변경
		System.out.println("야호~!");
	}
	
	@Override
	void eat(){
		super.eat();
		System.out.println("야옹~");
	}
}

