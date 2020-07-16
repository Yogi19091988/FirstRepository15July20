package sample;

public class B1 extends A1  {

	public B1() {
		
		// TODO Auto-generated constructor stub
		System.out.println("B1 Subclass of A1 Constructor");
	}

	public void sound () {
		super.sound();
		System.out.println("B1 sound");
	}
}
