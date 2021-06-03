import java.util.*;

class Figure{
	double dul;
	double nul;
	
	Figure(){
	}
	
	Figure(double radius){
		this.dul = radius*2*Math.PI;
		this.nul = radius*radius*Math.PI;
	}
	
	Figure(double byn, double high){
		this.dul = byn*3;
		this.nul = byn*high/2;
	}
	
	
	public String toString(){
		return String.format("�� ������ %s�̰�, �ѷ��� %.2f, ���̴� %.2f�Դϴ�.",this.getClass().getName(), dul,nul);
	}
}

class Circle extends Figure{
	double radius;
	
	Circle(){
	}
	
	Circle(double radius){
		super(radius);
		this.radius = radius;
	}
	
	public String toString(){
		return String.format("%s\n��, �������� %.1f�Դϴ�.:",super.toString(), radius);
	}
	
	public boolean equals(Object o){
		if(((Circle)o).radius == radius) return true;
		else return false;
	}
}

class EquilateralTriangle extends Figure{
	double byn;
	double high;
	
	EquilateralTriangle(){
	}
	
	EquilateralTriangle(double byn, double high){
		super(byn, high);
		this.byn = byn;
		this.high = high;
		
	}

	public String toString(){
			return String.format("%s\n�� �ﰢ�� �Ѻ��� ���̴� %.2f, ���̴� %.2f �Դϴ�.",super.toString(), byn, high);
		}	
}

class H12P2{
	public static void main(String [] args){
		EquilateralTriangle e1 = new EquilateralTriangle(3.00, 2.60);
		Circle c1 = new Circle(3.0);
		Circle c2 = new Circle(1.0);
		Circle c3 = new Circle(3.0);
		
		System.out.println(e1.toString());
		System.out.println();
		System.out.println(c1.toString());
		System.out.println();
		System.out.println(c2.toString());
		System.out.println();
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
	}
}

