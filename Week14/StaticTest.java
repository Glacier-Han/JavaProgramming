class M{
	int x,y;
	static int sum(){
		M m1 = new M();
		System.out.println(m1.x + m1.y);
		//��ü ���� �Ŀ� �����߱� ������, �� ��ü�� ������ �����Ǿ� ����� ���� ������ ������ non-static������ ��밡��
		//static -> �������� ��� �������� ������? �� �Ǵ�.
	}
	
	/*
	static int sum(){
		//static �޼ҵ忡�� non-static ��� ���Ұ�
		return x+y;
	}
	*/
	
	static int sum(int x, int y){
		return x+y;
	}
}