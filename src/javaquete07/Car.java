package javaquete07;

public class Car extends Vehicule {

	public Car(String brand, int kilometers) {
		// TODO Auto-generated constructor stub
		super(brand, kilometers);
	}
	
	@Override
	public String doStuff() {
		return "Je suis " + this.getBrand() + " et je fais vroum vroum.";
	}

}
