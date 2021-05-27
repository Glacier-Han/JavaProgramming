class Student{
	void report(Subject s){
		System.out.format("%s: %d\n", s.getClass().getName(), s.getScore());
	}
}
class Subject{
	private int score;
	Subject(){
		this((int)(Math.random()*101));
	}
	Subject(int score){
		this.score = score;
	}
	int getScore(){
		return score;
	}
}
class Korean extends Subject{
	Korean(){}	
	Korean(int score){
		super(score);
	}
}
class English extends Subject{
	English(){}	
	English(int score){
		super(score);
	}
}
class Mathematics extends Subject{
	Mathematics(){}	
	Mathematics(int score){
		super(score);
	}	
}
class Science extends Subject{
	Science(){}	
	Science(int score){
		super(score);
	}
}

class SubjectTest{
	public static void main(String [] args){
		Subject [] subjects = {new Korean(100), new English(72), new Mathematics(), new Science()};
		Student hong = new Student();
		
		for(int i=0; i<subjects.length; i++){
			hong.report(subjects[i]);
		}
	}
}