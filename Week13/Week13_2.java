import java.util.*;

class Week13_2{
	public static void main(String [] args){
		
		Player [] players = {new Piano(),new Piano(),new Piano(),new Cello(),new Cello()
		,new Violin(),new Violin()};
		
		/*
		Piano p1 = new Piano();
		Piano p2 = new Piano();
		Piano p3 = new Piano();
		Cello c1 = new Cello();
		Cello c2 = new Cello();
		Violin v1 = new Violin();
		Violin v2 = new Violin();
		*/
		
		Jiwhi j1 = new Jiwhi();
		j1.conduct(players);
	}
}

class Jiwhi{
	void conduct(Player [] players){
		for(int i=0; i<players.length; i++){
			players[i].play();
		}
	}	
}

class Player{
	void play(){}
}
class Piano extends Player{
	void play(){
		System.out.println("�ǾƳ븦 �����մϴ�");
	}
	
}

class Cello extends Player{
	void play(){
		System.out.println("ÿ�θ� �����մϴ�");
	}
}

class Violin extends Player{
	void play(){
		System.out.println("���̿ø��� �����մϴ�");
	}
}



