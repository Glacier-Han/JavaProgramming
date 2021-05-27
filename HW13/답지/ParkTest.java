class Vehicle{
	protected int numOfWheel;
	protected int mileage;
	Vehicle(){
		this(4, 0);
	}
	Vehicle(int numOfWheel, int mileage){
		this.numOfWheel = numOfWheel;
		this.mileage = mileage;
	}
	void print(int dist){
		mileage += dist;
		System.out.printf("나는 %s이고, %dm만큼 직진합니다. 이제까지 총 %dm만큼 직진했습니다. \n", getClass().getName(), dist, mileage);
	}
}
class Car extends Vehicle{
	protected String brand;
	
	Car(){
		this(4, 0, "현대자동차");
	}	
	Car(int numOfWheel, int mileage, String brand){
		super(numOfWheel, mileage);
		this.brand = brand;
	}
}
class Bike extends Vehicle{	
	Bike(){
		this(2, 0);
	}	
	Bike(int numOfWheel, int mileage){
		super(numOfWheel, mileage);
	}
}
class Garage{
	protected int numOfVehicle;
	void park(Object o){
		if(o instanceof Vehicle){
			numOfVehicle++;
			System.out.printf("%s를 차고에 주차했습니다(총 %d대 주차됨)\n", o.getClass().getName(), numOfVehicle);
		}
		else{
			System.out.printf("%s는 주차 불가합니다. (총 %d대 주차됨)\n", o.getClass().getName(), numOfVehicle);
		}
	}
}
class Stone{}
class ParkTest{
	public static void main(String [] args){
		Vehicle [] vehicles = {new Bike(), new Bike(3, 50), new Bike(4, 1000), new Bike(), new Car(), new Car(4, 0, "벤츠")};
		Garage garage = new Garage();
		
		vehicles[0].print(30);
		vehicles[5].print(30);
		
		for(Vehicle v:vehicles){
			garage.park(v);
		}
		garage.park(new Stone());
		garage.park(new Garage());
	}
}
