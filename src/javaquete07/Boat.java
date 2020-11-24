package javaquete07;

public class Boat extends Vehicule {
	
	public Boat(String brand, int kilometers) {
		// TODO Auto-generated constructor stub
		super(brand, kilometers);
	}
	
	@Override
	public String doStuff() {
		return "Je suis " + this.getBrand() + " et je fais glou  glou.";
	}

}
