import java.util.*;

//다형성 장점1 : 메소드의 매개변수를 상위클래스의 자료형으로 두면 하위클래스의 객체를 모두 처리 할 수 있다.

class Me{
	void eat(Object o){
		if(o instanceof Food) System.out.println(o.getClass().getName() + "를 먹겠어요");
		else System.out.println("장난치지 마라");
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
