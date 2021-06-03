class Figure{
	protected double perimeter;	//�ѷ�����
	protected double area;	//����
	Figure(){} //���⿡�� ����Ʈ �����ڴ� �ƹ� �ϵ� ���� ����
	Figure(double perimeter, double area){
		this.perimeter = perimeter;
		this.area = area;
	}
	public String toString(){	//(Object Ŭ������)toString�޼��� ������
		return String.format("�� ������ %s�̰�, �ѷ��� %.2f, ���̴� %.2f�Դϴ�.\n", this.getClass().getName(), perimeter, area); //this.getClass().getName()
	}
}

class Circle extends Figure{
	protected double radius;
	Circle(){ //����Ʈ �����ڴ� ����ֵ� ������ ���⿡�� �������� 1�� �� �����ϰ� �ۼ�
		this(1);
	}
	Circle(double r){	//�������� ���ڷ� �޾� ������, ����, �ѷ����� �ʵ� �ʱ�ȭ
		super(Math.PI*2*r, Math.PI*r*r);
		this.radius = r;
	}
	public String toString(){	//toString�޼��� ������
		return super.toString()+"��, �������� "+radius+"�Դϴ�.";		
	} 
	public boolean equals(Object o){
		return this.radius ==((Circle)o).radius;//��ü�� o�� ������ ĳ����(����ȯ)
	}
}

class EquilateralTriangle extends Figure{//���� ����.
	protected double side;
	protected double height;
	EquilateralTriangle(){ //���� ���������� ����Ʈ �����ڴ� �Ѻ��� ���̰� 1�� ���ﰢ�� ����
		this(1);
	}
	EquilateralTriangle(double s){ //�Ѻ��� ���̰�  s�� ���ﰢ�� ����
		super(3*s, Math.sqrt(3)/4*s*s);
		side = s;
		height = Math.sqrt(3)/2*side;
	}
	public String toString(){
		return String.format("%s�� �ﰢ���� �Ѻ��� ���̴� %.2f�̰�, ���̴� %.2f�Դϴ�.", super.toString(),side, height);		
	} 
}

class FigureTest{
	public static void main(String args []){
		EquilateralTriangle et = new EquilateralTriangle(3);	//�Ѻ��� ���̰�  3�� ���ﰢ�� ����
		System.out.println(et);
		Circle c = new Circle(3);	//�������� 3�� �� ����
		System.out.println(c);	
		Circle c1 = new Circle();//�������� 1�� �� ����
		System.out.println(c1);	
		if(c1.equals(c)==true)System.out.println("���� �� ���� �յ��Դϴ�. ");
		else System.out.println("���� �� ���� �յ��� �ƴմϴ�. ");
		
	}	
}
