class Test9{
	public static void main(String [] args) throws Exception {
		Computer [] computers = {new Laptop(), new Desktop(), new TabletPC(), new TabletPC("Apple", true), new TabletPC("SAMSUNG", true)};
		
		for(int i=0; i<computers.length; i++)
			computers[i].tell();
		
		System.out.println("3번째와 4번째 태블릿은 "+(computers[2].equals(computers[3])?"같은":"다른")+" 태블릿 입니다.");
		System.out.println("3번째와 5번째 태블릿은 "+(computers[2].equals(computers[4])?"같은":"다른")+" 태블릿 입니다.");
		
		Computer timertest = new Computer();
		timertest.printNumbers();
	}
}
class Computer{
	private String brand;
	
	void printNumbers() throws Exception{
		//컴파일러가 어떤 예외가 일어날 수 있다고 컴파일 안해줌
		// 던지거나 잡아라
		// 폭탄을 메인한테 던진다 (throws Exception) 메인도 또 던진다 (throws Exception)
		for(int i=1; i<=10; i++){
			System.out.print(i+" ");
			Thread.sleep(1000);
		}
	}
	
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

