class Test9{
	public static void main(String [] args){
		Computer [] computers = {new Laptop(), new Desktop(), new TabletPC(), new TabletPC("Apple", true), new TabletPC("SAMSUNG", true)};
		
		for(int i=0; i<computers.length; i++)
			computers[i].tell();
		
		System.out.println("3��°�� 4��° �º��� "+(computers[2].equals(computers[3])?"����":"�ٸ�")+" �º� �Դϴ�.");
		System.out.println("3��°�� 5��° �º��� "+(computers[2].equals(computers[4])?"����":"�ٸ�")+" �º� �Դϴ�.");
		
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
		System.out.println("���� ��ǻ��(" + this.brand + " �귣���� " + this.getClass().getName() + ")�Դϴ�.");
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

