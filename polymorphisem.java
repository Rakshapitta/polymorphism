package overload_ride;

class Animals {

	void sound() {
		System.out.println("animals make sound...");
	}

	void colour() {
		System.out.println("my pet colour is black");
	}
}

class Cat extends Animals {
	void food() {
		System.out.println("cat loves milk.");
	}

	// over ride:the sub class can have a method with the same as the super class
	// but different arguments.

	void sound(String m) {
		super.sound();
		System.out.println("cat makes sound = " + m);
	}

	// over ride:the sub class can have a method with the same as the super class
	// but different body.

	void colour() {
		super.colour();
		System.out.println("my pet colour is white.");
	}
}

class polymorphisem {
	public static void main(String args[]) {
		Cat cat = new Cat();
		cat.sound("mow");
		cat.colour();
		cat.food();
	}
}
