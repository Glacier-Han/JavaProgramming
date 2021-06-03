import java.util.*;

class Student{
	void report(Subject s){
		System.out.println(s.getClass().getName() + "ÀÇ Á¡¼ö : " + s.getScore());
	}
	
	public static void main(String [] args){
		Student s1 = new Student();
		
		Subject [] subs = {new Korean(), new English(), new Maths(), new Maths(), new Science()};
		
		for(Subject s : subs) s1.report(s);
	}
	
}

class Subject{
	Random ran = new Random();
	private int score;
	
	int getScore(){
		return score;
	}
	
	Subject(){
		//score = (int)(Math.random()*101);
		score = ran.nextInt(101);
	}
}
class Korean extends Subject{
}

class English extends Subject{
}

class Maths extends Subject{
}

class Science extends Subject{
} 