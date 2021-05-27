class Animal{
	void move(){
		System.out.format("���� %s�̰�, ", getClass().getName());
	}
}
class Cat extends Animal{
	@Override
	void move(){
		super.move();
		System.out.println("�޸��ϴ�.");
	}
}
class Dolphin extends Animal{
	@Override
	void move(){
		super.move();
		System.out.println("�����մϴ�.");
	}
}
class Dove extends Animal{
	@Override
	void move(){
		super.move();
		System.out.println("���ƴٴմϴ�.");
	}
}
class AnimalTest{
	public static void main(String [] args){
		Animal [] animals={new Cat(), new Dolphin(), new Dove()};
		for(Animal a: animals) a.move();
	}
}