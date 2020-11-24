package javaquete07;

public class Hangar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car auto1 = new Car ("Porsche", 80);
		Car auto2 = new Car ("Opel", 180000);
		
		Boat cano1 = new Boat ("Zodiac", 300);
		Boat cano2 = new Boat ("Argo", 0);
		
		System.out.println(auto1.doStuff());
		System.out.println(auto2.doStuff());
		System.out.println(cano1.doStuff());
		System.out.println(cano2.doStuff());
		
	

	}

}
