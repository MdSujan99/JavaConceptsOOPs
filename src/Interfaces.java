interface Car {
	void start();
	
}
class Audi implements Car{
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("This audi car is started");
		
	}
	
}
class BMW implements Car{
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("This bmw car is started");
		
	}
	
}
public class Interfaces {
	public static void main(String[] args) {
		Audi a1 = new Audi();
		a1.start();
		BMW b1 = new BMW();
		b1.start();
	}
}
