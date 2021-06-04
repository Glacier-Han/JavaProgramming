class Test9{
	public static void main(String [] args){
		Computer [] computers = {new Laptop(), new Desktop(), new TabletPC(), new TabletPC("Apple", true), new TabletPC("SAMSUNG", true)};
		
		for(int i=0; i<computers.length; i++)
			computers[i].tell();
		
		System.out.println("3번째와 4번째 태블릿은 "+(computers[2].equals(computers[3])?"같은":"다른")+" 태블릿 입니다.");
		System.out.println("3번째와 5번째 태블릿은 "+(computers[2].equals(computers[4])?"같은":"다른")+" 태블릿 입니다.");
		
	}
}
class Computer{
	private String brand;
	
	String getBrand(){
		return brand;
	}
	
	Computer(){
		this("SAMSUNG");
	}
	Computer(String brand){
		this.brand = brand;
	}
	
	void tell(){
		System.out.println("나는 컴퓨터(" + this.brand + " 브랜드의 " + this.getClass().getName() + ")입니다.");
	}
}

class Laptop extends Computer{
}

class Desktop extends Computer{
}

class TabletPC extends Computer{
	private boolean hasPen;
	
	TabletPC(){
		super("Apple");
		this.hasPen = true;
		
	}
	
	TabletPC(String brand, boolean hasPen){
		super(brand);
		this.hasPen = hasPen;
	}
	
	public boolean equals(Object o){
		return (this.hasPen == ((TabletPC)o).hasPen) && (super.getBrand().equals(((TabletPC)o).getBrand()));
	}
	
}

