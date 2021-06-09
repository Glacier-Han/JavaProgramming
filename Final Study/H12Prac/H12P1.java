import java.util.*;

class H12P1{
	public static void main(String [] args){
		Circle c1 = new Circle(3.0);
		Circle c2 = new Circle(1.0);
		Circle c3 = new Circle(1.0);
		EquilateralTriangle e1 = new EquilateralTriangle(3.00, 2.60);

		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(e1.toString());
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c3));
		}
  }

	class Figure{
		double dul;
		double nul;

		Figure(){
		}

		Figure(double radius){
			this.dul = radius*2*Math.PI;
			this.nul = radius*radius*Math.PI;
		}

		Figure(double byun, double high){
			this.dul = byun*3;
			this.nul = byun*high/2;
		}

		@Override
		public String toString(){
			return String.format("이 도형은 %s이고, 둘레는 %.2f, 넓이는 %.2f입니다.", this.getClass().getName(), dul, nul);
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

		@Override
		public boolean equals(Object o){
			if(o instanceof Circle == true) {
				return ((Circle)o).radius == this.radius;
			}

			else return false;
		}

		@Override
		public String toString(){
			return String.format("%s\n또, 반지름은 %.2f입니다.", super.toString(), radius);
		}
	}

	class EquilateralTriangle extends Figure{
		double byun;
		double high;

		EquilateralTriangle(){
		}

		EquilateralTriangle(double byun, double high){
			super(byun, high);
			this.byun = byun;
			this.high = high;
		}

		@Override
		public String toString(){
			return String.format("%s\n이 삼각형의 한변의 길이는 %.2f이고 높이는 %.2f입니다.",super.toString(), byun, high);
		}
	}
