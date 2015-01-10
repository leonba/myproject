//:Music5.java
//Interfaces

interface Instrument5 {
	//Compile-time constant:
	int i = 5;			//static & final
	//Cannot have method definitions:
	void play();	//Automatically public
	String what();
	void adjust();
}

class Wind5 implements Instrument5 {
	public void play() {
		System.out.println("Wind5.play()");
	}
	public String what() {
		return "Wind5";
	}
	public void adjust() {};
}