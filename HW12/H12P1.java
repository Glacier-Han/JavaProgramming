import java.util.*;

class Figure{
	double dul;
	double nul;
	Figure(){
	}
	
	Figure(double dul, double nul){
		this.dul = dul;
		this.nul = nul;
	}
	
}

class Circle extends Figure{
	double radius;
	Circle(){
		System.out.println("�� ������ ���Դϴ�.");
	}
	
	
	Circle(double radius){
		super(radius*Math.PI*2, Math.PI*radius*radius);
		this.radius = radius;
		System.out.printf("�� ������ Circle�̰�, �ѷ��� %.2f, ���̴� %.2f�Դϴ�.\n",super.dul, super.nul);
	}
	
	
	public String toString(){
		return String.format("�������� %.1f�Դϴ�.",radius);
	}
	
	public boolean equals(Object o){
		if(o instanceof Circle){
			if(((Circle)o).radius == this.radius) return true;
			else return false;
		}
		else return false;
	}
	
}

class EquilateralTriangle extends Figure{
	double cm;
	double height;
	
	EquilateralTriangle(){
		System.out.println("�� ������ ���ﰢ���Դϴ�.");
	}
	
	
	EquilateralTriangle(double cm, double height){
		super(cm*3, cm*height*0.5);
		this.cm = cm;
		this.height = height;
		System.out.printf("�� ������ EquilateralTriangle�̰�, �ѷ��� %.2f, ���̴� %.2f�Դϴ�.\n",super.dul, super.nul);
	
	}
	
	public String toString(){
		return String.format("�� �ﰢ���� �Ѻ��� ���̴� %.2f�̰�, ���̴� %.2f�Դϴ�.",cm,height);
	}
}	
	


class H12P1{
	public static void main(String[] args){
		EquilateralTriangle e1 = new EquilateralTriangle(3.00, 2.60);
		System.out.println(e1);
		
		Circle c1 = new Circle(3.0);
		System.out.println(c1);
		
		Circle c2 = new Circle(1.0);
		System.out.println(c2);
		
		System.out.println(c1.equals(c2));
	}
}

