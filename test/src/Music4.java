//:Music4.java
//Abstracts
abstract class Instrument4 {
	int i;
	public abstract void play();
	public String what() {
		return "Instrument4";
	}
	public abstract void adjust();
}

class Wind4 extends Instrument4 {
	public void play() {
		System.out.println("Wind4.play()");
	}
	public String what() {
		return "Wind4";
	}
	public void adjust() {};
}