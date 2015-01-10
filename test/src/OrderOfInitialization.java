//:OrderOfInitialization.java

class Tag {
	Tag(int marker) {
		System.out.println("Tag ( " + marker + " )");
	}
}

class Card {
	Tag t1 = new Tag(1); //Before constructor
	Card() {
		System.out.println("card()");
		t3 = new Tag(33);
	}
	Tag t2 = new Tag(2); //After constructor
	void f() {
		System.out.println("f()");
	}
	Tag t3 = new Tag(3); //At end
}

class OrderOfInitialization {
	public static void main(String[] args) {
		new Card();
	}
}