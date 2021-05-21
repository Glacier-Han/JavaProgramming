class Animal{
	int age;
	String name;
	
	void eat(){
		System.out.print("���־��. ");
	}
	void speak(){
		System.out.println("���ؿ�.");
	}
}
class Dog extends Animal{
	/*
	eat(): ���־��. �۸�~~
	speak(): �۸�!
	*/
	//������: Override 
	@Override
	void speak(){
		System.out.println("�۸�!");
	}
	@Override
	void eat(){
		super.eat();
		System.out.println("�۸�~~");
	}
	public static void main(String [] args){
		new Dog().eat();
	}
}
class Cat extends Animal{
	/*
	eat(): ���־��. �߿�~~
	speak(): �߿�!
	*/
}




