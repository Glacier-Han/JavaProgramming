import java.util.*;

//������ ����1 : �޼ҵ��� �Ű������� ����Ŭ������ �ڷ������� �θ� ����Ŭ������ ��ü�� ��� ó�� �� �� �ִ�.

class Me{
	void eat(Object o){
		if(o instanceof Food) System.out.println(o.getClass().getName() + "�� �԰ھ��");
		else System.out.println("�峭ġ�� ����");
	}
		
}

class Food{}

class Hamburger extends Food{

}

class Pizza extends Food{

}

class Bingsu extends Food{

}

class Icecream extends Food{

}

class Week13_1{
	public static void main(String [] args){
		Me me = new Me();
		Hamburger h1 = new Hamburger();
		Pizza p1 = new Pizza();
		Bingsu b1 = new Bingsu();
		me.eat(new Icecream());
		
		me.eat(h1);
	}
}
