class M{
	int x,y;
	static int sum(){
		M m1 = new M();
		System.out.println(m1.x + m1.y);
		//객체 생성 후에 접근했기 떄문에, 그 객체의 값으로 한정되어 결과가 같게 나오기 때문에 non-static일지라도 사용가능
		//static -> 누구한테 물어도 같은값이 나오냐? 로 판단.
	}
	
	/*
	static int sum(){
		//static 메소드에서 non-static 멤버 사용불가
		return x+y;
	}
	*/
	
	static int sum(int x, int y){
		return x+y;
	}
}