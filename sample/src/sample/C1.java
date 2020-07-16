package sample;

public class C1 extends B1 {

	public C1() {
		
		System.out.println("C1 is subclass of B1 constructor");
	}
	
	public void sound () {
		super.sound();
		System.out.println("C1 sound");
	}
}
