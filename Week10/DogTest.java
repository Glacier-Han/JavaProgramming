/*
	강아지를 프로그램하고 테스트해라
	강아지 
		필드 : 나이, 이름, 포만감(정수:0~10)
		메소드 : eat(int food), play()
		
	강아지 테스트
		강아지에게 먹이를  5만큼 준다.
		강아지와 놀아준다
*/
import java.util.*;

class Dog{
	
	private int age;
	private String name;
	private int fullrate;
	//필드는 private로 두는게 일반적 (외부에서 접근 ㄴㄴ)
	//접근지시자 : private public ....
	//private : 클래스 내부에서만 사용가능
	
	//외부에서 private한 필드에 접근하기 위한 경로 만들어 줘야함.
	//getter setter
	
	//1.getter : private한 필드값을 얻어내기 위한 용도
	int getAge(){
		return age;
	}
	
	int getFullrate(){
		return fullrate;
	}
	
	String getName(){
		return name;
	}
	
	//2.setter : private한 필드값을 설정하기 위한 용도
	void setAge(int age){
		if(age>=0 && age<=40)
			this.age = age; //this -> 이 클래스의 age, 그냥 age -> 매개변수 age
		else
			this.age = 5;
		
	}
	//포만감에 대한 setter : 포만감은 0이상 10이하만 유효
	//이름에 대한 setter : 이름의 길이가 10이하인 경우만 유효
	
	void setFullrate(int fullrate){
		if(fullrate>=0 && fullrate<=10)
			this.fullrate = fullrate;
		else
			this.fullrate = 5;
		
	}
	
	void setName(String name){
		if(name.length() <= 10)
			this.name = name;
		else
			this.name = "개똥이";
	}
	
	void eat(int food){
		if(food<=0) System.out.println("장난 ㄴㄴ");
		else if(food>0 && food<10){
			System.out.println("먹이를 "+food+"만큼 먹었어요");
			fullrate += food;
			if(fullrate>10) fullrate = 10;
			
			System.out.println("잘먹었습니다 ");
		}
	}
	
	void eat(String food){
		System.out.println(food + "를 먹습니다!");
		fullrate += 3;
	}
	
	void play(){
		System.out.println("재밌게 놀았어요");
	}
	
	void showFull(){
		System.out.println(name + "의 포만감은 " + fullrate + "에요");
	}
	
	
	
}

class DogTest{
	public static void main(String [] args){
		Dog myDog = new Dog();
		Scanner sc = new Scanner(System.in);
		System.out.print("강아지의 나이를 입력하세요 : ");
		myDog.setAge(sc.nextInt());
		myDog.getAge();
		
		System.out.print("강아지의 이름를 입력하세요 :");
		myDog.setName(sc.next());
		myDog.getName();
		
		Random ran = new Random();
		
		myDog.setFullrate(ran.nextInt(11));
		myDog.showFull();
		if(myDog.getFullrate() < 5){
			myDog.eat("햄버거"); //햄버거를 먹습니다!
			System.out.println(myDog.getName() + "에게 먹이를  5만큼 준다.");
			myDog.eat(5);
			
		}
		else {
			System.out.println(myDog.getName() + "와 놀아라.");
			myDog.play();
		}
		
	}
}