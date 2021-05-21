class Animal{
	int age;
	String name;
	
	void eat(){
		System.out.print("咐乐绢夸. ");
	}
	void speak(){
		System.out.println("富秦夸.");
	}
}
class Dog extends Animal{
	/*
	eat(): 咐乐绢夸. 港港~~
	speak(): 港港!
	*/
	//犁沥狼: Override 
	@Override
	void speak(){
		System.out.println("港港!");
	}
	@Override
	void eat(){
		super.eat();
		System.out.println("港港~~");
	}
	public static void main(String [] args){
		new Dog().eat();
	}
}
class Cat extends Animal{
	/*
	eat(): 咐乐绢夸. 具克~~
	speak(): 具克!
	*/
}




